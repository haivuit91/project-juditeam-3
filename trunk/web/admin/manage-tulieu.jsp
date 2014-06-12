<%-- 
    Document   : manage-tulieu
    Created on : Jun 12, 2014, 4:57:06 PM
    Author     : Welcomes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="alert alert-danger" style="text-align: center"><b>QUẢN LÝ TƯ LIỆU </b></div>
        <div class="panel panel-default">
            <!-- Default panel contents -->
            <div class="panel-heading">
                <a href="/project1/umanage?do=add" class="btn btn-primary btn-sm" >
                    Tạo mới tài khoản
                </a>               
                <div class="row">
                    <div class="col-lg-5 col-lg-push-6">
                        <form action="/project1/umanage?do=search" method="post">
                            <div class="col-md-11">

                                <div class="input-group">

                                    <div class="input-group-btn">
                                        <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                                            <span class="glyphicon glyphicon-search"></span>
                                            <span class="caret"></span></button>

                                    </div><!-- /btn-group -->

                                    <input type="text" name="userName" class="form-control" placeholder="Nhập tên tài khoản muốn tìm...">

                                </div><!-- /input-group -->
                            </div><!-- /input-group -->
                            <div class="col-md-1">
                                <input type="submit" name="submit" value="Tìm kiếm" class="btn btn-default dropdown-toggle" style="background:#3e8f3e;color:#ffffff">
                            </div>
                        </form>
                    </div><!-- /.col-lg-6 -->
                </div><!-- /.row -->
            </div>

            <div class="panel panel-default">
                <div class="col-md-1" style="background: #428bca;padding:5px;font-weight:bold;text-transform: uppercase;color:#ffffff">Mã</div>
                <div class="col-md-2" style="background: #428bca;padding:5px;font-weight:bold;text-transform: uppercase;color:#ffffff">Tên GVHS</div>
                <div class="col-md-2" style="background: #428bca;padding:5px;font-weight:bold;text-transform: uppercase;color:#ffffff">địa chỉ</div>
                <div class="col-md-1" style="background: #428bca;padding:5px;font-weight:bold;text-transform: uppercase;color:#ffffff">Điện thoại</div>
                <div class="col-md-2" style="background: #428bca;padding:5px;font-weight:bold;text-transform: uppercase;color:#ffffff">đơn vị</div>
                <div class="col-md-2" style="background: #428bca;padding:5px;font-weight:bold;text-transform: uppercase;color:#ffffff">Trạng thái</div>
                <div class="col-md-1" style="background: #428bca;padding:5px;font-weight:bold;text-transform: uppercase;color:#ffffff">trình độ</div>
                <div class="col-md-1" style="background: #428bca;padding:5px;font-weight:bold;text-transform: uppercase;color:#ffffff">lựa chọn</div>
            </div>
            <c:forEach items="${tkList}" var="tkList">
                <div class="panel panel-title">
                    <div class="col-md-1" style="text-transform: inherit;padding:5px">1</div>
                    <div class="col-md-2" style="text-transform: inherit;padding:5px" >Nguyễn Ngọc Duy</div>
                    <div class="col-md-2" style="text-transform: inherit;padding:5px">Quảng Nam</div>
                    <div class="col-md-1" style="text-transform: inherit;padding:5px">0906427601</div>
                    <div class="col-md-2" style="text-transform: inherit;padding:5px">
                        <p>Trường THPT Nguyễn Huệ</p>
                    </div>
                    <div class="col-md-2" style="text-transform: inherit;padding:5px">Vui vẻ</div>
                    <div class="col-md-1" style="text-transform: inherit;padding:5px">Đại học</div>
                    <div class="col-md-1" style="text-transform: inherit;padding:5px">
                        <div class="col-md-6">
                            <a href="/project1/umanage?do=edit&id=${tkList.getMaTK()}" class="btn btn-primary btn-sm" >
                                <span class="glyphicon glyphicon-wrench"></span>
                            </a>
                        </div>
                        <div class="col-md-6">
                            <a href="/project1/umanage?do=del&id=${tkList.getMaTK()}" onclick="return confirm('Bạn thực sự muốn xóa: ${tkList.getTenTK()}?')" class="btn btn-primary btn-sm" role="button"><span class="glyphicon glyphicon-trash"></span></a>
                        </div>
                    </div>
                </div>                               
            </c:forEach>                             
        </div>
    </body>
</html>
