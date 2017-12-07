<%-- 
    Document   : ListeEtud
    Created on : 7 mai 2016, 01:31:50
    Author     : Zied
--%>

<%@page import="metier.Client"%>
<%@page import="java.util.Vector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Résultat de Recherche</title>
    </head>
    <body>
       <h1>liste des Etudiants:</h1>
       <% Vector liste = new Vector() ;
        liste =(Vector)request.getAttribute("liste");
        for(int i=0;i<liste.size();i++)
        {
            Client c = new Client();
            c=(Client)liste.get(i);%>
        <p><%out.println("Etudiant"+i+":"+c.getNom()+" "+c.getPrenom()+" Email:"+c.getEmail()+" Login:"+c.getLogin()+" Adresse:"+c.getAdresse()+" Téléphone:"+c.getTelephone());}%></p>
        
        <a href="http://localhost:8080/TP3J2EE/authadmin.jsp">Retour</a>
    </body>
</html>
