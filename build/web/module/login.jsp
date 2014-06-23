<%-- 
    Document   : login
    Created on : Jun 6, 2014, 4:07:18 PM
    Author     : Welcomes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="../css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <style>

        </style>
    </head>
    <body>
        <div class="col-sm-4 col-sm-offset-3">

            <div class="panel panel-primary">
                <div class="panel-heading">
                    <span class="glyphicon glyphicon-lock"></span>&nbsp;
                    ĐĂNG NHẬP HỆ THỐNG
                </div>
                <div class="panel-body">
                    <form role="form" action="/HeThongTTQL/authen?do=login" method="POST">
                        <div class="form-group">
                            <span class="glyphicon glyphicon-user"></span> <label for="exampleInputEmail1">Tên đăng nhập</label>
                            <input type="text" name="tenTK" class="form-control" id="exampleInputEmail1" placeholder="">
                        </div>
                        <div class="form-group">
                            <span class="glyphicon glyphicon-heart"></span> <label for="exampleInputPassword1">Mật khẩu</label>
                            <input type="password" name="matkhau" class="form-control" id="exampleInputPassword1" placeholder="">
                        </div>

                        <input type="submit" class="btn btn-primary" value="Đăng nhập"/>
                    </form>
                </div>
            </div>

        </div>



        <script src="../js/bootstrap.js" type="text/javascript"></script>
    </body>
</html>
