<%-- 
    Document   : Ajoutcr
    Created on : 6 mai 2016, 22:25:14
    Author     : Zied
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ajout réussie</title>
    </head>
    <body>
        <% String nomc = new String(); 
        String idc = new String(); 
        nomc =(String)request.getAttribute("nomc");
        idc =(String)request.getAttribute("idc");%>
        
        <p><%out.println("Votre cours:"+nomc+" de reférence:"+idc+" a été ajouté avec succés");%></p>
        <a href="http://localhost:8080/TP3J2EE/authadmin.jsp">Retour</a>
    </body>
</html>
