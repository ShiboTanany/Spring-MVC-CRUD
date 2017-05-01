<%-- 
    Document   : home
    Created on : Apr 30, 2017, 3:05:50 PM
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
    <center>
        <form  action="addProduct.htm">
            <input type="number" placeholder="enter product id "  name="id" /><br/>
            <input type="text"  placeholder="enter the product name" name="name" /><br/>
            <input type="text"  placeholder="enter the product price" name="price" /><br/>
            <input type="text"  placeholder="enter the product desc" name="desc" />   <br/>
            <input type="submit" value="save"/>

        </form>
        ${message}
        <a href="showProduct.htm">show products</a>
    </center>
</body>
</html>
