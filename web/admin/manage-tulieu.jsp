<%-- 
    Document   : manage-tulieu
    Created on : Jun 12, 2014, 4:57:06 PM
    Author     : Welcomes
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                <a href="/project3/umanage?do=add" class="btn btn-primary btn-sm" >
                    Tạo mới tư liệu
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
                <div class="col-md-2" style="background: #428bca;padding:5px;font-weight:bold;text-transform: uppercase;color:#ffffff">Tên TL</div>
                <div class="col-md-3" style="background: #428bca;padding:5px;font-weight:bold;text-transform: uppercase;color:#ffffff">Nội dung</div>
                <div class="col-md-2" style="background: #428bca;padding:5px;font-weight:bold;text-transform: uppercase;color:#ffffff">Loại TL</div>
                <div class="col-md-2" style="background: #428bca;padding:5px;font-weight:bold;text-transform: uppercase;color:#ffffff">Nguồn TL</div>
                <div class="col-md-1" style="background: #428bca;padding:5px;font-weight:bold;text-transform: uppercase;color:#ffffff">Năm</div>
                <div class="col-md-1" style="background: #428bca;padding:5px;font-weight:bold;text-transform: uppercase;color:#ffffff">lựa chọn</div>
            </div>
            <c:forEach items="${requestScope.tulieuList}" var="tlList">
                <div class="panel panel-title">
                    <div class="col-md-1" style="text-transform: inherit;padding:5px">${tlList.getMaTL()}</div>
                    <div class="col-md-2" style="text-transform: inherit;padding:5px" >${tlList.getTenTL()}</div>
                    <div class="col-md-3" style="text-transform: inherit;padding:5px">${tlList.getNoidung()}</div>
                    <div class="col-md-2" style="text-transform: inherit;padding:5px">${tlList.getLoaiTL()}</div>
                    <div class="col-md-2" style="text-transform: inherit;padding:5px">${tlList.getNguonTL()}</div>
                    <div class="col-md-1" style="text-transform: inherit;padding:5px">${tlList.getNam()}</div>
                    <div class="col-md-1" style="text-transform: inherit;padding:5px">
                        <div class="col-md-6">
                            <a href="/project3/tlmamage?do=edit&id=${tlList.getMaTL()}" class="btn btn-primary btn-sm" >
                                <span class="glyphicon glyphicon-wrench"></span>
                            </a>
                        </div>
                        <div class="col-md-6">
                            <a href="/project3/tlmamage?do=del&id=${tlList.getMaTL()}" onclick="return confirm('Bạn thực sự muốn xóa: ${tlList.getTenTL()}?')" class="btn btn-primary btn-sm" role="button"><span class="glyphicon glyphicon-trash"></span></a>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </body>
</html>
