<%-- 
    Document   : dynamicTable.jsp
    Created on : Sep 27, 2018, 3:16:21 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dynamic Table</title>
    </head>
    <body>
    <center>
        <h1> Colorful and Dynamic Table </h1>
        <form method ="POST" action ="dynamicTable.jsp">
            Table Width (<16) = <input type ="text" name ="width"  value =5 size = 2>
            Table Height (<16) = <input type ="text" name ="height"  value =5 size = 2>
            <input type ="submit" value ="DO IT" >
        </form>
        <hr>
        <% 
            String w = request.getParameter("width");
            String h = request.getParameter("height");
            if(w==null) w="5";
            if(h==null) h="15";
            int width = Integer.parseInt(w);
            int height = Integer.parseInt (h);
            if (width >15 ) width = 15;
            if (width <0) width=0;
            if(height >15) height = 15;
            if(height< 0) height =0;
            String[] colorArray = { "00" , "11","22" , "33",
                                    "44" ,"55","66","77", 
                                    "88","99","AA","BB",
                                    "CC","DD","EE","FF" }; 
                                             
            %>                      
            <table border =0 cellpadding =0 cellspacing =0 >
                <%
                   for (int x=0; x<=width;x++){
                %>
                <tr>
                    <%
                        for (int y=0;y<=height ; y++)
                        {
                            String bgColor = "AA" +colorArray[y] + colorArray[x];  %>
                            <td BGCOLOR=<%=bgColor%>>
                            (<%=x%> , <%=y%>)
                            </td>
                        <% } %>
                        
                    
                    </tr>
                <% } %>
                </table>
                <hr>
    </center>
    </body>
</html>
