<%-- 
    Document   : modificar
    Created on : 1/08/2022, 10:35:30 AM
    Author     : Aula1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2 style="text-align: center">Modificar Registro</h2>

        <form action="ProductosController?accion=actualizar" method="POST" autocomplete="off" style="text-align: center">
            <p>Id</p>
            <input id="id" name="id" type="hidden" value="<c:out 
                       value="${producto.id}"/>">
            <p>Código</p>
            <input id="codigo" name="codigo" type="text" value="<c:out 
                       value="${producto.codigo}"/>">
            <p>Nombre</p>
            <input id="nombre" name="nombre" type="text" value="<c:out 
                       value="${producto.nombre}"/>">
            <p>Precio</p>
            <input id="precio" name="precio" type="number" value="<c:out 
                       value="${producto.precio}"/>">
            <p>Existencia</p>
            <input id="existencia" name="existencia" type="number" value="<c:out 
                       value="${producto.existencia}"/>">
            <br></br>
            <button id="guardar" name="guardar" type="submit" >
                Guardar
            </button>
        </form>
    </body>
</html>
