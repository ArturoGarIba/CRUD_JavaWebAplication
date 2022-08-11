package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductosDAO {

    Connection conexion;

    public ProductosDAO() {
        Conexion con = new Conexion();
        try {
            conexion = con.getConexion();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Productos> listaProductos() {

        List<Productos> lista = new ArrayList<>();

        try {
            PreparedStatement ps = conexion.prepareStatement("SELECT * FROM ALMACEN.PRODUCTOS;");
            ResultSet rs = ps.executeQuery();
            Productos prod;
            while (rs.next()) {
                System.out.println("ASDASDSAD");
                int id = rs.getInt("id");
                String codigo = rs.getString("codigo");
                String nombre = rs.getString("nombre");
                double precio = rs.getDouble("precio");
                int existencia = rs.getInt("existencia");

                prod = new Productos(id, existencia, codigo, nombre, precio);
                lista.add(prod);
                
            }
            return lista;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }

    public Productos mostrarProducto(int _id) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        Productos prod = null;

        try {
            ps = conexion.prepareStatement("SELECT * FROM productos where id =?;");
            ps.setInt(1, _id);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String codigo = rs.getString("codigo");
                String nombre = rs.getString("nombre");
                double precio = rs.getDouble("precio");
                int existencia = rs.getInt("existencia");

                prod = new Productos(id, existencia, codigo, nombre, precio);

                return prod;
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }

    public boolean insertar(Productos prod) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = conexion.prepareStatement("INSERT INTO productos(codigo,nombre,"
                    + "precio,existencia) VALUES (?,?,?,?);");
            ps.setString(1, prod.getCodigo());
            ps.setString(2, prod.getNombre());
            ps.setDouble(3, prod.getPrecio());
            ps.setInt(4, prod.getExistencia());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return false;
    }

    public boolean actualizar(Productos prod) {
        PreparedStatement ps ;

        try {
            ps = conexion.prepareStatement("UPDATE productos SET codigo=?, nombre=?, precio=?, existencia=? "
                    + "where id=?;");
            ps.setString(1, prod.getCodigo());
            ps.setString(2, prod.getNombre());
            ps.setDouble(3, prod.getPrecio());
            ps.setInt(4, prod.getExistencia());
            ps.setInt(5, prod.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return false;
    }

    public boolean eliminar(int _id) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        Productos prod = null;

        try {
            ps = conexion.prepareStatement("DELETE FROM productos "
                    + "WHERE id=?");
            ps.setInt(1, _id);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return false;
    }

    //FIN
}
