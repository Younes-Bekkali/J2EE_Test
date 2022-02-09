<%-- 
    Document   : formationdisponible
    Created on : Jan 20, 2022, 9:28:25 AM
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Aucune formation prevue pour le langauge ${requestScope.language}</h3>
        <h3><a href="rechercher.jsp">Envoyer une nouvelle recherche</a> </h3>
    </body>
</html>
