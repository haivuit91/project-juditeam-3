<%-- 
    Document   : admin
    Created on : Jun 12, 2014, 4:33:49 PM
    Author     : Welcomes
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrator</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <style>
            body{
                padding:70px 0px;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <%@include file="admin/nav_admin.jsp" %>    
                <%@include file="admin/manage.jsp" %>
            </div>
        </div>

        <script src="js/bootstrap.js" type="text/javascript"></script>
    </body>
</html>
