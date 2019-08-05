<%-- 
    Document   : usercount
    Created on : Oct 4, 2018, 3:27:59 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Application counter in JSP</title>
    </head>
    <body>
   <% 

Integer hitsCount = (Integer)application.getAttribute("hitCounter");
if(hitsCount == null || hitsCount == 0)
{
    out.println("Welcome to my website");
    hitsCount = 1;
    
}
else
{
    out.println("<b>Welcome back to my website </b>");
    hitsCount +=1;
    
}
application.setAttribute("hitCounter",hitsCount);


%>
    <center>
        <p><b>Total no of visits : <%=hitsCount %> </p></b>
    </center>
    </body>
</html>
