<%-- 
    Document   : muestraResultado
    Created on : 15/04/2022
    Author     : SusanaHI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "controller.muestraSolicitud"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SOLICITUD DE CAMBIOS EN APLICACIONES</title>
    </head>
    <body>
        
        <h1>USUARIO</h1>
            <%
                HttpSession mysession = request.getSession(false);
                out.println(mysession.getAttribute("usuarioResuelto"));
                /*HttpSession mysession2 = request.getSession(false);
                out.println(mysession.getAttribute("apellidoResuelto"));
                HttpSession mysession3 = request.getSession(false);
                out.println("Grupo de Negocios: "+mysession.getAttribute("grupoResuelto")+"\n");
                HttpSession mysession4 = request.getSession(false);
                out.println("Planta: "+mysession.getAttribute("plantaResuelto")+"\n");
                HttpSession mysession5 = request.getSession(false);
                out.println("Area: "+mysession.getAttribute("areaResuelto")+"\n");
                HttpSession mysession6 = request.getSession(false);
                out.println("Autoriza: "+mysession.getAttribute("autorizaResuelto")+"\n");*/
            %>
        
        <h1>SOLICITUD</h1>
            <h3>Tipo de Cambio</h3><br>
            <%=request.getAttribute("cambioSolicitado")%>
            <h3>Aplicacion</h3>
            <%=request.getAttribute("aplicacionSolicitada")%>
            <h3>Descripcion de Cambio</h3>
            <%=request.getAttribute("descripcionSolicitada")%>
            <h3>Justificacion de Cambio</h3>
            <%=request.getAttribute("justificacionSolicitada")%>
                    
    </body>
</html>
