<%-- 
    Document   : date
    Created on : Sep 24, 2018, 6:00:04 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" import="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!
            int month=1,day=1,year= 2000;
            void setTodayDate(int mm,int dd,int yyyy) {
            month= mm;
            day=dd;
            year=yyyy;
        }
            void setTodayDate(int mm,int dd){
            month = mm;
            day =dd;
        
        }
            %>
            <% 
            setTodayDate(11,23,2012);
            out.println("<b> This is the method with three parameter" + "<br>");
            out.println(month + "<br>" );
            out.println(day + "<br>");
            out.println(year + "<br>");
            out.println("<b> This is the method with two parameter" + "<br>");
            setTodayDate(11,9);
            out.println(month + "<br>" );
            out.println(day + "<br>");
            
            %>
    </body>
</html>
