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
                            <h3><span class="glyphicon glyphicon-user"></span>${tk.getMaTK() > 0 ? 'Thay đổi thông tin ĐCCT' : 'Thêm mới ĐCCT'}</h3>
                        </div>
                        <div class="panel-body">
                            <form class="form-horizontal" role="form" action="/project1/umanage?id=${tk.getMaTK()}" method="post">
                                <!-- /.UserName -->
                                <div class="form-group">                                    
                                    <div class="col-sm-12" >
                                        <input type="text" name="maDC" value="${tk.getMaTK()}" disabled class="form-control" id="inputEmail3">
                                    </div>
                                </div>
                                <!-- /.UserName -->
                                <div class="form-group">

                                    <div class="col-sm-12" >
                                        <input type="text" name="tenDC" value="${tk.getTenTK()}" ${tk.getMaTK() > 0 ? 'disabled' : ''} class="form-control" id="inputEmail3" placeholder="Tên  đề cương chi tiết">
                                    </div>
                                </div>
                                <!-- /.Password -->
                                <div class="form-group">

                                    <div class="col-sm-12" >
                                        <input type="text" name="dvhoctrinh" value="${tk.getMatkhau()}" class="form-control" id="inputEmail3" placeholder="Đơn vị học trình">
                                    </div>
                                </div>
                                <!-- /.FullName -->
                                <div class="form-group">

                                    <div class="col-sm-12" >
                                        <input type="text" name="thoigian" value="${tk.getHoTen()}" class="form-control" id="inputEmail3" placeholder="Thời gian">
                                    </div>
                                </div>
                                <!-- /.Email -->
                                <div class="form-group">

                                    <div class="col-sm-12" >
                                        <input type="email" name="dieukien" value="${tk.getEmail()}" class="form-control" id="inputEmail3" placeholder="điều kiện">
                                    </div>
                                </div>
                                <!-- /.Phone -->
                                <div class="form-group">

                                    <div class="col-sm-12" >
                                        <input type="text" name="muctieu" value="${tk.getSDT()}" class="form-control" id="inputEmail3" placeholder="Mục tiêu">
                                    </div>
                                </div>
                                <!--Trinh do-->
                                <div class="form-group">

                                    <div class="col-sm-12" >
                                        <input type="text" name="noidung" value="${tk.getSDT()}" class="form-control" id="inputEmail3" placeholder="Nội dung">
                                    </div>
                                </div>
                                <!--Trinh do-->
                                <div class="form-group">

                                    <div class="col-sm-12" >
                                        <input type="text" name="tieuchuan" value="${tk.getSDT()}" class="form-control" id="inputEmail3" placeholder="tieuchuan">
                                    </div>
                                </div>
                                <!--Trinh do-->
                                <div class="form-group">

                                    <div class="col-sm-12" >
                                        <input type="text" name="nam" value="${tk.getSDT()}" class="form-control" id="inputEmail3" placeholder="Năm">
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
