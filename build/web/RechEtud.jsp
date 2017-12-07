<%-- 
    Document   : RechEtud
    Created on : 7 mai 2016, 01:04:20
    Author     : Zied
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recherche Etudiant</title>
    </head>
    <body>
       <% if (session.getAttribute("client")!= null){%>
        <form method="post" action="http://localhost:8080/TP3J2EE/ServletRechEtud">
            <p>Mot Clé:</p><input type="text" name="motcle">
            <input type="submit" value="Validez">
        </form>
        <%}%>
    </body>
</html>
