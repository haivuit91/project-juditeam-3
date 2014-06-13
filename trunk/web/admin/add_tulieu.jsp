<%-- 
    Document   : add_giangvien
    Created on : Jun 13, 2014, 7:38:00 AM
    Author     : Welcomes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="../css/bootstrap.min.css" rel="stylesheet"/>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-lg-4 col-md-offset-4">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3><span class="glyphicon glyphicon-user"></span>${tk.getMaTK() > 0 ? 'Thay đổi thông tin tư liệu' : 'Thêm mới tư liệu'}</h3>
                        </div>
                        <div class="panel-body">
                            <form class="form-horizontal" role="form" action="/project1/umanage?id=${tk.getMaTK()}" method="post">
                                <!-- /.UserName -->
                                <div class="form-group">                                    
                                    <div class="col-sm-12" >
                                        <select class="form-control">
                                            <option>mã tư liệu 1</option>
                                            <option>mã tư liệu 2</option>
                                            <option>mã tư liệu 3</option>
                                        </select>
                                    </div>
                                </div>
                                <!-- /.UserName -->
                                <div class="form-group">
                                    <div class="col-sm-12" >
                                        <select class="form-control">
                                            <option>ten tư liệu 1</option>
                                            <option>ten tư liệu 2</option>
                                            <option>ten tư liệu 3</option>
                                        </select>
                                    </div>
                                </div>
                                <!-- /.Password -->
                                <div class="form-group">

                                    <div class="col-sm-12" >
                                        <input type="text" name="noidung" value="${tk.getMatkhau()}" class="form-control" id="inputEmail3" placeholder="Nội dung">
                                    </div>
                                </div>
                                     <div class="form-group">
                                    <div class="col-sm-12" >
                                        <select class="form-control">
                                            <option>Nguồn tư liệu 1</option>
                                            <option>Nguồn tư liệu 2</option>
                                            <option>Nguồn tư liệu 3</option>
                                        </select>
                                    </div>
                                </div>
                               
                                <div class="form-group">
                                    <div class="col-sm-8 col-md-offset-4" >
                                        <input type="submit" ${tk.getMaTK() > 0 ? 'value="Sửa"' : 'value="Thêm mới"'} name="submit" class="btn btn-success"/>
                                        &nbsp;
                                        <button type="reset" class="btn btn-warning">Clear</button>
                                    </div>
                                </div>

                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script type="text/javascript" src="../js/jquery-1.11.1.min.js"></script>
        <script type="text/javascript" src="../js/bootstrap.min.js"></script>
    </body>
</html>
