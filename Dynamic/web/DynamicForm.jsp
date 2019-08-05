<%-- 
    Document   : DynamicForm.jsp
    Created on : Sep 27, 2018, 3:43:17 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dynamic Form</title>
    </head>
    <body>
        <B>form </B>
        <form action="DynamicForm.jsp" method ="POST">
            <table border =0 cellspacing =0 cellpadding =0>
                <% 
                String [] textFields = {"FirstName" ,"LastName" , "Address" ,"City" ,"Zip"};
                for(int j=0;j<textFields.length ; j++) {
                %>
                <tr> <td> <%=textFields[j] %>:
                    <td><input type = text name = <%=textFields[j]%>></td>
           
                </tr>
                <% } %>
                <tr>
                    <td>State </td>
                    <td><select name =" State" >
                        <% String[] states = {"AA" ,"CA","NM","MA" ,"..."};
                        for (int s=0;s<states.length;s++) { %>
                        <option > <%=states[s] %> </option>
                        <% } %>
                        </select></td>
                </tr>
                <tr> <td>Card Number </td>
                    <td><select name = CardType>
                        <% String[] cTypes = {"Amex" , "Master Card", "Discovery" , "..."};
                        for (int t=0; t<cTypes.length;t++) { %>
                        <option><%=cTypes[t] %></option>
                        <% } %>
                        </select></td>
                </tr>
            </table>
                        <input type ="submit" value ="submit">
        </form>
        <hr>
        <b>Form Content </b> <br>
        <table>
            <% java.util.Enumeration parameters = request.getParameterNames();
            while (parameters.hasMoreElements()) {
                String parameterName = (String)parameters.nextElement();
                String parameterValue = request.getParameter(parameterName);
                    
            %>
            <tr>
                <td><%=parameterName %></td>
                <td><%=parameterValue %></td>
            </tr>
            <% } %>
        </table>
            
    </body>
</html>
