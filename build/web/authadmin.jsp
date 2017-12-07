<%-- 
    Document   : authadmin
    Created on : 23 avr. 2016, 12:04:10
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
           c= (Client)session.getAttribute("client");%>
           <p><%out.println("Bienvenue Admin: "+c.getPrenom()+" "+c.getNom());%></p>
           <p>Liste des Services:</br>
               <a href="http://localhost:8080/TP3J2EE/AjoutC.jsp">Ajout Cours</a></br>
               <a href="http://localhost:8080/TP3J2EE/Suppc.jsp">Suppression Cours</a></br>
               <a href="http://localhost:8080/TP3J2EE/RechCours.jsp">Recherche des Cours</a></br>
               <a href="http://localhost:8080/TP3J2EE/RechEtud.jsp">Recherche d'Etudiant</a>
               
           </p>
    </body>
</html>
