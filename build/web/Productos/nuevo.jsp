<%-- 
    Document   : nuevo
    Created on : 1/08/2022, 10:35:16 AM
    Author     : Aula1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Almacen</title>
    </head>
    <body>
        <h2 style="text-align: center">Nuevo Registro</h2>

        <form action="ProductosController?accion=insertar" method="POST" autocomplete="off" style="text-align: center">
            <p>Código</p>
            <input id="codigo" name="codigo" type="text">
            <p>Nombre</p>
            <input id="nombre" name="nombre" type="text">
            <p>Precio</p>
            <input id="precio" name="precio" type="number">
            <p>Existencia</p>
            <input id="existencia" name="existencia" type="number">
            <br></br>
            <button id="guardar" name="guardar" type="submit" >
                Guardar
            </button>
        </form>
    </body>
