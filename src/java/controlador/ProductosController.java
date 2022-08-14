/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Productos;
import modelo.ProductosDAO;

/**
 *
 * @author Aula1
 */
@WebServlet(name = "ProductosController", urlPatterns = {"/ProductosController"})
public class ProductosController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ProductosDAO productosDAO = new ProductosDAO();
        String accion;
        RequestDispatcher dispatcher = null;
        accion = request.getParameter("accion");
        if (accion == null || accion.isEmpty()) {
            dispatcher = request.getRequestDispatcher("Productos/index.jsp");
            List<Productos> listaProductos = productosDAO.listaProductos();
            request.setAttribute("lista", listaProductos);

        } else if (accion.equals("nuevo")) {
            dispatcher = request.getRequestDispatcher("Productos/nuevo.jsp");

        } else if (accion.equals("insertar")) {
            String codigo = request.getParameter("codigo");
            String nombre = request.getParameter("nombre");
            Double precio = Double.parseDouble(request.getParameter("precio"));
            int existencia = Integer.parseInt(request.getParameter("existencia"));
            Productos producto = new Productos(0, existencia, codigo, nombre, precio);
            productosDAO.insertar(producto);
            dispatcher = request.getRequestDispatcher("Productos/index.jsp");

            List<Productos> listaProductos = productosDAO.listaProductos();
            request.setAttribute("lista", listaProductos);
        } else if (accion.equals("modificar")) {
            dispatcher = request.getRequestDispatcher("Productos/modificar.jsp");
            int id = Integer.parseInt(request.getParameter("id"));
            System.out.println(id);
            Productos producto = productosDAO.mostrarProducto(id);
            request.setAttribute("producto", producto);
        } else if (accion.equals("actualizar")) {
            int id = Integer.parseInt(request.getParameter("id"));
            String codigo = request.getParameter("codigo");
            String nombre = request.getParameter("nombre");
            Double precio = Double.parseDouble(request.getParameter("precio"));
            int existencia = Integer.parseInt(request.getParameter("existencia"));
            Productos producto = new Productos(id, existencia, codigo, nombre, precio);
            System.out.println(id+" "+codigo+" "+nombre+" "+precio+" "+existencia);
            productosDAO.actualizar(producto);
            dispatcher = request.getRequestDispatcher("Productos/index.jsp");

            List<Productos> listaProductos = productosDAO.listaProductos();
            request.setAttribute("lista", listaProductos);
        } else if (accion.equals("eliminar")) {
            int id = Integer.parseInt(request.getParameter("id"));
            productosDAO.eliminar(id);
            dispatcher = request.getRequestDispatcher("Productos/index.jsp");
            List<Productos> listaProductos = productosDAO.listaProductos();
            request.setAttribute("lista", listaProductos);
        } else {
            dispatcher = request.getRequestDispatcher("Productos/index.jsp");
            List<Productos> listaProductos = productosDAO.listaProductos();
            request.setAttribute("lista", listaProductos);
        }
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
