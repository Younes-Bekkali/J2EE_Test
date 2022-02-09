<%-- 
    Document   : rechercher
    Created on : Jan 20, 2022, 8:59:58 AM
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
         <form name="maform" action="TraitementRecherche" method="POST">
            <table border="1" align="center" width="40%">
                <thead>
                    <tr>
                        <th colspan="2"><h1>Saisier le langage recherche</h1></th>
                    </tr>
                </thead>
                <tbody>
                   <tr>
                        <td>Nom</td>
                        <td><input type="text" name="nom" value="" /></td>
                    </tr>
                      <tr>
                        <td>Langage</td>
                        <td><input type="text" name="langage" value="" /></td>
                    </tr>
                      <tr>
                        <td colspan="2" align="center"> <input type="submit" value="Se connecter" name="send" /></td>

                    </tr>
                </tbody><!-- comment -->
            </table>
         </form>
    </body>
</html>
