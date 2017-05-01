<%-- 
    Document   : update
    Created on : Apr 30, 2017, 4:04:59 PM
    Author     : shibo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <form  action="addProduct.htm">
            <input type="number" placeholder="enter product id "  name="id" /><br/>
            <input type="text"  placeholder="enter the product name" name="name" /><br/>
            <input type="text"  placeholder="enter the product price" name="price" /><br/>
            <input type="text"  placeholder="enter the product desc" name="desc" />   <br/>
            <input type="submit" value="update"/>

        </form>
        ${message}
    </body>
</html>
