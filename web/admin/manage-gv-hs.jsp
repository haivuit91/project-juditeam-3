<%-- 
    Document   : manage-giangvien
    Created on : Jun 12, 2014, 4:56:30 PM
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
        <div class="alert alert-danger" style="text-align: center"><b>QUẢN LÝ GIẢNG VIÊN HỌC SINH </b></div>
        <div class="panel panel-default">
            <!-- Default panel contents -->
            <div class="panel-heading">
                <a href="/project3/GVHSManage?do=add" class="btn btn-primary btn-sm" >
                    Tạo mới tài khoản
                </a>               
                <div class="row">
                    <div class="col-lg-5 col-lg-push-6">
                        <form action="/project3/GVHSManage?do=search" method="post">
                            <div class="col-md-11">

                                <div class="input-group">

                                    <div class="input-group-btn">
                                        <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                                            <span class="glyphicon glyphicon-search"></span>
                                            <span class="caret"></span></button>

                                    </div><!-- /btn-group -->

                                    <input type="text" name="tenGVHS" class="form-control" placeholder="Nhập tên muốn tìm...">

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
                <div class="col-md-2" style="background: #428bca;padding:5px;font-weight:bold;text-transform: uppercase;color:#ffffff">Địa chỉ</div>
                <div class="col-md-1" style="background: #428bca;padding:5px;font-weight:bold;text-transform: uppercase;color:#ffffff">Điện thoại</div>
                <div class="col-md-2" style="background: #428bca;padding:5px;font-weight:bold;text-transform: uppercase;color:#ffffff">Ngày sinh</div>
                <div class="col-md-2" style="background: #428bca;padding:5px;font-weight:bold;text-transform: uppercase;color:#ffffff">Đơn vị</div>
                <div class="col-md-1" style="background: #428bca;padding:5px;font-weight:bold;text-transform: uppercase;color:#ffffff">Trình độ</div>
                <div class="col-md-1" style="background: #428bca;padding:5px;font-weight:bold;text-transform: uppercase;color:#ffffff">Lựa chọn</div>
            </div>
            <c:forEach items="${gvhsList}" var="gvhs">
                <div class="panel panel-title">
                    <div class="col-md-1" style="text-transform: inherit;padding:5px">${gvhs.getMaGVHS()}</div>
                    <div class="col-md-2" style="text-transform: inherit;padding:5px">${gvhs.getTenGVHS()}</div>
                    <div class="col-md-2" style="text-transform: inherit;padding:5px">${gvhs.getDiachi()}</div>
                    <div class="col-md-1" style="text-transform: inherit;padding:5px">${gvhs.getDienthoai()}</div>
                    <div class="col-md-2" style="text-transform: inherit;padding:5px">${gvhs.getNgaysinh()}</div>
                    <div class="col-md-2" style="text-transform: inherit;padding:5px">${gvhs.getDonvi()}</div>
                    <div class="col-md-1" style="text-transform: inherit;padding:5px">${gvhs.getTrinhdo() == 1?'Giảng viên':'Sinh viên'}</div>
                    <div class="col-md-1" style="text-transform: inherit;padding:5px">
                        <div class="col-md-6">
                            <a href="/project3/GVHSManage?do=edit&id=${gvhs.getMaGVHS()}" class="btn btn-primary btn-sm" >
                                <span class="glyphicon glyphicon-wrench"></span>
                            </a>
                        </div>
                        <div class="col-md-6">
                            <a href="/project3/GVHSManage?do=del&id=${gvhs.getMaGVHS()}" onclick="return confirm('Bạn thực sự muốn xóa: ${gvhs.getTenGVHS()} ?')" class="btn btn-primary btn-sm" role="button"><span class="glyphicon glyphicon-trash"></span></a>
                        </div>
                    </div>
                </div>  </c:forEach>                             
        </div>
    </body>
</html>
