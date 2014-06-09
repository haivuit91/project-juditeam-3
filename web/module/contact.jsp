<%-- 
    Document   : contact
    Created on : Jun 6, 2014, 4:28:36 PM
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
        <div class="col-md-10">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <span class="glyphicon glyphicon-retweet"></span>&nbsp;
                    LIÊN HỆ VỚI CHÚNG TÔI
                </div>
                <div class="panel-body">
                
                    <form class="form-horizontal" role="form" action="/project1/contact" method="post">
                        <div class="col-sm-10 col-sm-offset-1">
                            <div class="form-group">

                                <div class="col-sm-2" >
                                    <label>Họ Tên(*)</label>
                                </div>
                                <div class="col-sm-10" >
                                    <input type="text" name="fullName" class="form-control" id="inputEmail3" placeholder="Tên người gửi">
                                </div>
                            </div>    
                            <div class="form-group">
                                <div class="col-sm-2" >
                                    <label>Email(*)</label>
                                </div>
                                <div class="col-sm-10" >
                                    <input type="email" name="email" class="form-control" id="inputEmail3" placeholder="Địa chỉ Email">
                                </div>
                            </div>   
                            <div class="form-group">
                                <div class="col-sm-2" >
                                    <label>Tiêu đề(*)</label>
                                </div>
                                <div class="col-sm-10" >
                                    <input type="text" name="title" class="form-control" id="inputEmail3" placeholder="Tiêu đề">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-2" >
                                    <label>Nội dung(*)</label>
                                </div>
                                <div class="col-sm-10" >
                                    <textarea class="form-control"  name="content" rows="3" placeholder="Nội dung cần gửi"></textarea>

                                </div>
                            </div> 
                            <div class="form-group">
                                <div class="col-sm-4 col-sm-push-8" >
                                    <button type="submit" class="btn btn-primary" name="do">Gửi</button>
                                    &nbsp;
                                    <button type="reset" class="btn btn-default">Làm lại</button>
                                </div>
                            </div>
                        </div>

                    </form>

                </div>
            </div>
        </div>


    <script src="../js/bootstrap.js" type="text/javascript"></script>
</body>
</html>
