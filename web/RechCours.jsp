<%-- 
    Document   : RechCours
    Created on : 6 mai 2016, 23:09:25
    Author     : Zied
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recherche Cours</title>
    </head>
    <body>
        <h1>Ajouter Un Cours!</h1>
        <% if (session.getAttribute("client")!= null){%>
        <form method="post" action="http://localhost:8080/TP3J2EE/ServletRechCours">
            <p>Mot Clé:</p><input type="text" name="motcle">
            <input type="submit" value="Validez">
        </form>
        <%}%>
    </body>
</html>
