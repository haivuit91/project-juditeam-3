<%-- 
    Document   : banner
    Created on : Jun 6, 2014, 10:23:21 AM
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
        <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
            <div class="carousel-inner">
                <!--image1-->
                <div class="item active">
                    <img src="images/banner.png" data-src="holder.js/1170x200/auto/#777:#555/text:First slide" alt="Nông Thôn Mới">
                </div>
                <!--image2-->
                <div class="item">
                    <img src="images/banner1.png" data-src="holder.js/1170x200/auto/#777:#555/text:First slide" alt="Mới Nông Thôn">
                </div>
                <!--image3-->
                <div class="item">
                    <img src="images/banner2.png" data-src="holder.js/1170x200/auto/#777:#555/text:First slide" alt="Nông Mới Thôn">
                </div>
              


            </div>

            <!-- Controls -->
            <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left"></span>
            </a>
            <a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right"></span>
            </a>
        </div>
        <script src="../js/bootstrap.js" type="text/javascript"></script>
    </body>
</html>
