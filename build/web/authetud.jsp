<%-- 
    Document   : authetud
    Created on : 23 avr. 2016, 11:37:41
    Author     : Zied
--%>

<%@page import="metier.Client"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Authentification réussie</title>
    </head>
    <body>
        <% 
           Client c = new Client();
           c= (Client)session.getAttribute("client"); %>
           <p><%out.println("Bienvenue Etudiant: "+c.getPrenom()+" "+c.getNom());%></p>
           <p>Liste des Services:</br>
               <a href="http://localhost:8080/TP3J2EE/RechCours.jsp">Recherche des Cours</a>     
           </p>
       
    </body>
</html>
