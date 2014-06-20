<%-- 
    Document   : navbar
    Created on : Jun 6, 2014, 10:27:21 AM
    Author     : Welcomes
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="../css/bootstrap.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                </div>
                <div class="navbar-collapse collapse">
                    <div class="col-md-12">
                        <ul class="nav navbar-nav">

                            <li><a href="/HeThongTTQL/home.jsp">Trang chủ</a></li>
                            <li><a href="/HeThongTTQL/Page?p=about">Giới Thiệu</a></li>
                            <li><a href="/HeThongTTQL/Page?p=search-cb">Tìm Kiếm</a></li>
                            <li><a href="/HeThongTTQL/Page?p=contact">Liên Hệ</a></li>

                        </ul>
                        <ul class="nav navbar-nav navbar-right">
                            <c:if test="${currentUser == null}">
                            <li><a href="/HeThongTTQL/Page?p=login"><span class="glyphicon glyphicon-new-window"></span>&nbsp; Đăng nhập</a></li>
                            </c:if>
                            <c:if test="${currentUser != null}">
                            <li><a href="/HeThongTTQL/bgmanage?page=manage"><span class="glyphicon glyphicon-new-window"></span>&nbsp; Xin chào: ${currentUser.getTenTK()}</a></li>
                            </c:if>
                        </ul>
                    </div>
                </div><!--/.nav-collapse -->
            </div><!--/.container-fluid -->
        </div>
    </body>
</html>
