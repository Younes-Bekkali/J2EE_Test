<%-- 
    Document   : formationintrouvee
    Created on : Jan 20, 2022, 9:28:45 AM
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3> </h3>
        <table border="1">
            <thead>
                <tr>
                    <th colspan="2">Bienvenue ${sessionScope.recherche.nom},
                        voici les formations retrouvees pour ${requestScope.recherche.langage}</th>

                </tr>
            </thead>
            <tbody>
           
                <c:forEach var="formation" items="${requestScope.ListeDisp}">
                <tr>
                    <td>Formation</td>
                    <td>${requestScope.formation.formation}</td>
                </tr>
                <tr>
                    <td>Ville</td>
                    <td>$formation.ville}</td>
                </tr>
            </c:forEach>
        </tbody>

    </table>
    <h3><a href="rechercher.jsp"> Une autre recherche</a> </h3>
</body>
</html>
