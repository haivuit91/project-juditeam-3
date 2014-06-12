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
                
                <c:if test="${page == null}">
                    <%@include file="admin/nav_admin.jsp" %>    
                    <%@include file="admin/manage.jsp" %>
                </c:if>
                <c:if test="${page == 'manage-gvhs'}">
                    <%@include file="admin/nav_admin.jsp" %>    
                    <%@include file="/admin/manage-gv-hs.jsp" %>
                </c:if>
                <c:if test="${page == 'manage-bg'}">
                    <%@include file="admin/nav_admin.jsp" %>    
                    <%@include file="/admin/manage-baigiang.jsp" %>
                </c:if>
                <c:if test="${page == 'manage-dcct'}">
                    <%@include file="admin/nav_admin.jsp" %>    
                    <%@include file="/admin/manage-decuongchitiet.jsp" %>
                </c:if>
                <c:if test="${page == 'manage-sl'}">
                    <%@include file="admin/nav_admin.jsp" %>    
                    <%@include file="/admin/manage-slide.jsp" %>
                </c:if>
                <c:if test="${page == 'manage-tl'}">
                    <%@include file="admin/nav_admin.jsp" %>    
                    <%@include file="/admin/manage-tulieu.jsp" %>
                </c:if>
            </div>
        </div>

        <script src="js/bootstrap.js" type="text/javascript"></script>
    </body>
</html>
