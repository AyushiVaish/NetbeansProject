<%-- 
    Document   : power
    Created on : Sep 24, 2018, 5:44:37 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h2>Behold the power of 2</h2>
        <table border = "2" align ="center">
            <th>Exponent</th><th>2^Exponent </th>
            <% for (int i=0;i<10;i++) { %>
            <tr><td><%= i %></td>
                <td><%= Math.pow(2,i) %> </td>
            </tr>
            <% } %>
            
        </table>
    </center>
    </body>
</html>
