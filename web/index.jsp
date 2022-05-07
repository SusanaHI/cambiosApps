<%-- 
    Document   : index
    Created on : 15/04/2022
    Author     : SusanaHI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Enumeration"%>
<%@page import = "controller.muestraSolicitud"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Solicitud de Cambios de Aplicaciones</title>
    </head>
    <body>
        
        <%--Session--%>
        <%
            HttpSession mysession = request.getSession(false);
            Enumeration e = mysession.getAttributeNames();
            if (e.hasMoreElements()) {
                out.println("Bienvenid@ de nuevo " + mysession.getAttribute("usuarioResuelto"));
            }
        %>
                               
        <div><br> Solicitud de Cambios <br><br>
            <form action="muestraSolicitud" method="post">
                BIENVENIDO <br><br>
                DATOS DEL USUARIO <br><br> Introduce tu nombre:<br>
                <input type="String" name="userName"><br>
                Introduce tu apellido:<br>
                <input type="String" name="userLastName" value=""><br>
                Introduce tu grupo de negocios:<br>
                <input type="String" name="userGrupo" value=""><br>
                Introduce tu planta:<br>
                <input type="String" name="userPlanta" value=""><br>
                Introduce tu area:<br>
                <input type="String" name="userArea" value=""><br>
                Introduce tu autorizador:<br>
                <input type="String" name="userAutoriza" value=""><br><br>
                SOLICITUD <br><br> Introduce el tipo de cambio solicitado:<br>
                <input type="String" name="tipo" value=""><br>
                Introduce la aplicacion a modificar:<br>
                <input type="String" name="aplicacion" value=""><br>
                Introduce la descripcion de tu solicitud:<br>
                <input type="String" name="descripcion" value=""><br>
                Introduce la justificacion de tu solicitud:<br>
                <input type="String" name="justificacion" value=""><br><br>
                Al dar clic en el botón Solicitar, su solicitud se enviará a autorizar.
                <input type="submit" value="Solicitar">
            </form>
        </div>
        
        <%--Filter--%>
        <%
            if(request.getAttribute("flag")!=null){
                out.print("<h1> Ningún campo puede estar vacío </h1>");
            }
        %>
        
    </body>
</html>
