<%-- 
    Document   : fibo
    Created on : Sep 24, 2018, 5:49:36 PM
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
        <%
            int a,b,c,i;
            int n=Integer.parseInt(request.getParameter("num"));
            a=0;
            b=1;
            i=0;
            out.println("Fibonacci series of " + n + " as follows:");
            if(n==1)
            out.println(a);
            else
            if(n==2)
            {
                out.println(a);
                out.println(b);
                
            }
            else{
                out.println(a);
                out.println(b);
                while(i<n-2)
                {
                    c=a+b;
                    a=b;
                    b=c;
                    i++;
                    out.println(c);
                
                }
            }
            %>
    </body>
</html>
