<%-- 
    Document   : resRechcours
    Created on : 7 mai 2016, 00:49:13
    Author     : Zied
--%>

<%@page import="metier.Client"%>
<%@page import="metier.Cours"%>
<%@page import="java.util.Vector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Résultat de Recherche</title>
    </head>
    <body>
        <h1>liste des Cours:</h1>
        <% Vector liste = new Vector() ;
        liste =(Vector)request.getAttribute("listec");
        for(int i=0;i<liste.size();i++)
        {
            Cours c = new Cours();
            c=(Cours)liste.get(i);%>
            <p><%out.println("Cours:"+c.getNom()+" reférence:"+c.getId());}%></p>
            <% Client c = (Client)session.getAttribute("client"); 
            if (c.getType().equals("admin")){%>
             <a href="http://localhost:8080/TP3J2EE/authadmin.jsp">Retour</a>
        <%}
            else {%>
            <a href="http://localhost:8080/TP3J2EE/authetud.jsp">Retour</a>   <%      }%>
    </body>
</html>
