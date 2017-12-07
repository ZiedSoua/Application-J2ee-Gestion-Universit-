<%-- 
    Document   : errors
    Created on : 23 avr. 2016, 10:06:51
    Author     : Zied
--%>

<%@page import="java.util.Enumeration"%>
<%@page import="java.util.Hashtable"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Erreurs</title>
    </head>
    <body>
        <p>Quelques erreurs ont été trouvés dans les champs du formulaire :</p>
        <% Hashtable err = new Hashtable();
        err= (Hashtable)request.getAttribute("err");
           Enumeration k = err.keys();
           while (k.hasMoreElements())
           {
               String e = (String)k.nextElement();
               String v = (String)err.get(k);
               out.println(e+" : "+v);
           }
            %>
    </body>
</html>