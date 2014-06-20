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
                            <h3><span class="glyphicon glyphicon-user"></span>${gvhs.getMaGVHS() > 0 ? 'Thay đổi thông tin GV-HS' : 'Thêm mới GV-HS'}</h3>
                        </div>
                        <div class="panel-body">
                            <form class="form-horizontal" role="form" action="/HeThongTTQL/GVHSManage?id=${gvhs.getMaGVHS()}" method="post">
                                <!-- /.UserName -->
                                <div class="form-group">                                    
                                    <div class="col-sm-12" >
                                        <input type="text" name="maGVHS" value="${gvhs.getMaGVHS()}" disabled class="form-control" id="inputEmail3">
                                    </div>
                                </div>
                                <!-- /.UserName -->
                                <div class="form-group">

                                    <div class="col-sm-12" >
                                        <input type="text" name="tenGVHS" value="${gvhs.getTenGVHS()}" class="form-control" id="inputEmail3" placeholder="Tên giáo viên hoặc học sinh">
                                    </div>
                                </div>
                                <!-- /.Password -->
                                <div class="form-group">

                                    <div class="col-sm-12" >
                                        <input type="text" name="diaChi" value="${gvhs.getDiachi()}" class="form-control" id="inputEmail3" placeholder="Địa chỉ">
                                    </div>
                                </div>
                                <!-- /.FullName -->
                                <div class="form-group">

                                    <div class="col-sm-12" >
                                        <input type="text" name="dienThoai" value="${gvhs.getDienthoai()}" class="form-control" id="inputEmail3" placeholder="Số điện thoại">
                                    </div>
                                </div>
                                <!-- /.Email -->
                                <div class="form-group">

                                    <div class="col-sm-12" >
                                        <input type="text" name="ngaySinh" value="${ns}" class="form-control" id="inputEmail3" placeholder="ngày-tháng-năm">
                                    </div>
                                </div>
                                <!-- /.Phone -->
                                <div class="form-group">
                                    <div class="col-sm-12" >
                                        <input type="text" name="donVi" value="${gvhs.getDonvi()}" class="form-control" id="inputEmail3" placeholder="Đơn vị">
                                    </div>
                                </div>
                                <!--Trinh do-->
                                <div class="form-group">

                                    <div class="col-sm-12" >
                                        <select name="trinhDo" class="form-control" id="inputEmail3" >
                                            <option value="1" ${gvhs.getTrinhdo() == 1?'selected':''}>Giảng viên</option>
                                            <option value="0" ${gvhs.getTrinhdo() == 0?'selected':''}>Sinh viên</option>
                                        </select>
                                        
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-sm-8 col-md-offset-4" >
                                        <input type="submit" ${gvhs.getMaGVHS() > 0 ? 'value="Sửa"' : 'value="Thêm mới"'} name="submit" class="btn btn-success"/>
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
