<%-- 
    Document   : showProducts
    Created on : Apr 30, 2017, 3:09:54 PM
    Author     : shibo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <table border="1">
                <!-- column headers -->
                <tr><td>id</td>
                    <td>name</td> 
                    <td>PRICE</td>
                    <td>desc</td>
                    <td>delete</td>
                    <td>update</td>
                </tr>


                <!-- column data -->

                <c:forEach var="vehicle" items="${list}">
                    <tr>
                         <td><c:out value="${vehicle.id}"  /></td>
                        <td><c:out value="${vehicle.name}"  /></td>
                        <td><c:out value="${vehicle.price}" /></td>
                        
                        <td><c:out value="${vehicle.desc}"  /></td>
                        <td><a href="delete.htm?id=${vehicle.id}"  >delete</a></td>
                        <td><a href="update.htm?id=${vehicle.id}" >update</a></td>
                        
                    </tr>

                </c:forEach>
            </table>

    </body>
</html>
