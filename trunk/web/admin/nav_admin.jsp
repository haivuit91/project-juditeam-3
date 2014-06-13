<%-- 
    Document   : nav_admin
    Created on : Jun 12, 2014, 4:36:50 PM
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
        <div class="navbar navbar-fixed-top navbar-inverse" role="navigation">
            <div class="container">
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
                <div class="col-md-12">
                    <ul class="nav navbar-nav">
                        <li><a  class="active" href="/project3/GVHSManage?p=manage">ADMINISTRATOR</a></li>
                        <li><a href="/project3/Page?p=about">Thống kê</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li class="active"><a href="/project3/home.jsp">Trang chủ</a></li>
                        <li><a href="/project3/authen?do=logout"><span class="glyphicon glyphicon-th-large"  >Đăng xuất</span></a></li>
                    </ul>
                </div>
            </div><!-- /.container -->
        </div><!-- /.navbar -->
    </body>
</html>
