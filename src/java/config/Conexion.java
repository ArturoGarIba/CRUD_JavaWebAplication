package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection getConexion() throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/";
        String db = "almacen";
        String user = "root";
        String pass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url + db,
                    user, pass);
            //System.out.println("ConexionBIEEEEEEEEEEN");
            return conexion;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }
    }

}
