<%-- 
    Document   : suc
    Created on : 23 avr. 2016, 10:05:34
    Author     : Zied
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <title>Inscription effectué</title>
    </head>
    <body>
        <h1>inscription effectué avec succés</h1>
        <% String nom = new String();
        nom= (String)request.getAttribute("nom");
        String prenom = new String();
        prenom=(String)request.getAttribute("prenom");
        String login = new String();
        login= (String)request.getAttribute("login");%>
        <p><%out.println(nom+" "+prenom+" Votre inscription a été réalisé sous le login:"+login);%></p>
        
        
       
    </body>
</html>