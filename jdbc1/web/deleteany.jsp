<%-- 
    Document   : deleteany
    Created on : Oct 29, 2018, 11:01:13 AM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<%! String connectionURL="jdbc:derby://localhost:1527/emp";
Connection connection=null;
PreparedStatement statement=null;
ResultSet rs=null;
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <form method="get" action="deleteData.jsp">
                  <%
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
                    connection = DriverManager.getConnection(connectionURL,"emp","emp");
                    String sql="select id from emp";
                     statement=connection.prepareStatement(sql);
                    rs=statement.executeQuery();
                    %>
                    <p>Select roll no
                    <select name="ListOfRollNo">
                            <%
                    while(rs.next())
                    {
                            int id=rs.getInt("id");
                            %>
                            <option value="<%=id %>"> <%=id %> </option>
                            

<% } %>
                    </select>
                </p>
<%
}
catch(SQLException se)
{
out.print(se);
}
%>
<input type="submit" value="Delete">
</form>
    </body>
</html>
