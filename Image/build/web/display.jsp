<%-- 
    Document   : display
    Created on : Nov 26, 2018, 9:27:53 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.sql.*" %>
<%@page import ="javax.sql.*" %>
<%@page import ="java.io.*" %>
<!DOCTYPE html>
<%!
 String connectionURL="jdbc:derby://localhost:1527/image";
    Connection connection =null;
    PreparedStatement ps=null;
    ResultSet rs= null;
    %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="displayImage.jsp">
            <%
                try
                {
           Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
          connection=DriverManager.getConnection(connectionURL,"image","image");
          String sql= "select photoName from image";
          ps=connection.prepareStatement(sql);  
          rs=ps.executeQuery();
          
                
                %>
                <p>Select image for dispay
                    <select name="Listofimg">
                        <%while(rs.next())
                        {
                            String name= rs.getString("photoName");
                            %>
                            <option value="<%= name %>"> <%=name %> </option>
                            <%}
%>
                    </select>
                </p>
                <% 
                    }
catch(SQLException sq)
{
out.print(sq);

}
%>
<input type="submit" value="display">
        </form>    </body>
</html>
