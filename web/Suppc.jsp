<%-- 
    Document   : Suppc
    Created on : 6 mai 2016, 22:42:34
    Author     : Zied
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Suppression d'un Cours</title>
    </head>
    <body>
        <% if (session.getAttribute("client")!= null){%>
        <form method="post" action="http://localhost:8080/TP3J2EE/ServletSuppCours">
            <p>Identifiant du Cours :</p><input type="text" name="idc">
            <p>Nom du Cours :</p><input type="text" name="nomc">
            <input type="submit" value="Validez">
        </form> 
        <%}%>
    </body>
</html>
