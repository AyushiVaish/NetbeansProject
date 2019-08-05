<%-- 
    Document   : array
    Created on : Sep 24, 2018, 4:46:10 PM
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
            
        int [] orderedQuantities = new int [3];
        int [] inStockQuantities = {1,2,2};
        String[] productNames = {"Screen House" , "Rain Flyer" ,"Tent"};
        String[] productDescriptions = getDescriptions();
        double[] productPrices = {149.99,29.99,129.99};
        String[] getDescriptions()
        {
            String[] descriptions = {"Description 1", "Description 2", "Description 3"};
            return descriptions;
            
        }
            %>
            <% for (int j = 0;j<3 ; j++)  { %> <hr>
            <br>Name : <%= productNames[j] %>
            <br>Description : <%= productDescriptions[j] %>
            <br> Price : <%= productPrices[j] %>
            <br> In Order : <%= orderedQuantities[j] %>
            <br> In Stock : <%= inStockQuantities[j] %>
            
            <% }
%>
    </body>
</html>
