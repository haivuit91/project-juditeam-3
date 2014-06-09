<%-- 
    Document   : navbar
    Created on : Jun 6, 2014, 10:27:21 AM
    Author     : Welcomes
--%>

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
                    <div class="col-md-8">
                        <ul class="nav navbar-nav">

                            <li class="active"><a href="/project3/home.jsp">Trang chủ</a></li>
                            <li><a href="/project3/Page?p=about">Giới Thiệu</a></li>
                            <li><a href="/project3/Page?p=login">Đăng Nhập</a></li>
                            <li><a href="/project3/Page?p=seacher-cb">Tìm Kiếm</a></li>
                            <li><a href="/project3/Page?p=contact">Liên Hệ</a></li>

                        </ul>
                    </div>
                </div><!--/.nav-collapse -->
            </div><!--/.container-fluid -->
        </div>
    </body>
</html>
