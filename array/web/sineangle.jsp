<%-- 
    Document   : sineangle
    Created on : Sep 24, 2018, 4:56:56 PM
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
        <%!
            int angles[] = {0,30,45,75,90}; %>
            <table border =" 2" align =" center">
                <th>Angle </th><th>Sine of Angle</th>
                <% for (int i=0;i<5;i++) { %>
                <tr> <td><%=angles[i] %> </td>
                    <td><%=Math.sin(Math.toRadians(angles[i]))%>
                </tr>
                <%}
            %>
            </table>
            
    </body>
</html>
