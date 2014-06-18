<%-- 
    Document   : home
    Created on : Jun 5, 2014, 6:47:13 PM
    Author     : Welcomes
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cao Đẳng Thương Mại</title>
        <link href="css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <!--------------------------------BANNER-------------------------------->
        <div class="container">
            <div class="row">
                <%@include file="module/banner.jsp" %>
            </div>
        </div>
        <!--------------------------------NAV-------------------------------->
        <div class="navbar-wrapper">
            <div class="container">
                <div class="row">
                    <%@include file="module/navbar.jsp" %>
                </div>
            </div>
        </div>
        <!--------------------------------CONTENT SUM-------------------------------->
        <div class="container ">
            <div class="row">
                <!--------------------------------CONTENT LEFT-------------------------------->
                <%@include file="module/content-left.jsp" %>
                <!--------------------------------CONTENT RIGHT-------------------------------->

                <c:if test="${page == 'search-cb'}">
                    <%@include file="module/search-cb.jsp" %>
                </c:if>
                <c:if test="${page == 'search-nc'}">
                    <%@include file="module/search-nc.jsp" %>
                </c:if>
                <c:if test="${page == 'login'}">
                    <%@include file="module/login.jsp" %>
                </c:if>
                <c:if test="${page == 'contact'}">
                    <%@include file="module/contact.jsp" %>
                </c:if>
                <c:if test="${page == 'about'}">
                    <%@include file="module/about.jsp" %>
                </c:if>
                <c:if test="${page == null}">
                    <%@include file="module/content-right.jsp" %>
                </c:if>



            </div>

        </div>
        <!--------------------------------FOOTER-------------------------------->
        <div class="container">
            <div class="row panel panel-warning" style="background:#4986bd;color:white">
                <footer style="text-align: center">
                    <p>Hỗ trợ bài giảng và học tập HTTQL Trường Cao đẳng Thương Mại</p>
                    <p>Địa chỉ:45 Dũng Sĩ Thanh Khê, Đà Nẵng</p>
                    <p>Design by Judi Team</p>
                </footer>
            </div>
        </div>
        <!--------------------------------END-------------------------------->


        <script src="js/bootstrap.min.js" type="text/javascript"></script>
    </body>
</html>
