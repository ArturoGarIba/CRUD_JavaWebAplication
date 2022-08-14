

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ALMACEN</title>
    </head>
    <body>
        <h1>PRODUCTOS</h1>


        <a href="ProductosController?accion=nuevo">Nuevo Registro</a>
        <br></br>

        <table border="1" width="80%">
            <thead>
                <tr>
                    <th>Código</th>
                    <th>Nombre</th>
                    <th>Precio</th>
                    <th>Existencia</th>
                    <th>Acción</th>
                    <th>Acción</th>
                </tr>
            </thead>

            <tbody>
                <c:forEach var="producto" items="${lista}">
                    <tr>
                        <td>
                            <c:out value="${producto.codigo}"/>
                        </td>
                        <td>
                            <c:out value="${producto.nombre}"/>
                        </td>
                        <td>
                            <c:out value="${producto.precio}"/>
                        </td>
                        <td>
                            <c:out value="${producto.existencia}"/>
                        </td>
                        <td>
                            <a href="ProductosController?accion=modificar&id=<c:out value="${producto.id}"/>">
                                MODIFICAR
                            </a>
                        </td>
                        <td>
                            <a href="ProductosController?accion=eliminar&id=<c:out value="${producto.id}"/>
                               ">
                                ELIMINAR
                            </a>
                        </td>
                    </tr>
                </c:forEach>

            </tbody>
        </table>

    </body>
</html>
