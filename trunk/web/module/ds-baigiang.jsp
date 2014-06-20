<%-- 
    Document   : ds-baigiang
    Created on : Jun 20, 2014, 11:37:42 AM
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
        <div class="col-md-10">
            <div class="col-md-12">
                <p class="alert alert-warning" style="text-align: center;text-transform: uppercase;font-weight: bold">danh sách bài giảng</p>
            </div>
            <div class="panel-heading">
                <div class="row">
                    <div class="col-lg-5 col-lg-push-6">
                        <form action="/HeThongTTQL/search?by=bg" method="post">
                            <div class="col-md-11">

                                <div class="input-group">

                                    <div class="input-group-btn">
                                        <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                                            <span class="glyphicon glyphicon-search"></span>
                                            <span class="caret"></span></button>

                                    </div><!-- /btn-group -->

                                    <input type="text" name="tenBG" class="form-control" placeholder="Nhập tên bài giảng muốn tìm...">

                                </div><!-- /input-group -->
                            </div><!-- /input-group -->
                            <div class="col-md-1">
                                <input type="submit" name="submit" value="Tìm kiếm" class="btn btn-default dropdown-toggle" style="background:#3e8f3e;color:#ffffff">
                            </div>
                        </form>
                    </div><!-- /.col-lg-6 -->
                </div>
            </div>
            <table class="col-md-12"style="font-weight: bold;color:wheat;background:#4986bd;text-transform: uppercase">
                <tr >
                    <td class="col-md-2">Tên bài giảng</td>
                    <td class="col-md-2">Tên giảng viên</td>
                    <td class="col-md-1">Năm</td>
                    <td class="col-md-6">Nội dung</td>
                    <td class="col-md-1"></td>
                </tr>
            </table>
            <table class="col-md-12 table-hover">
                <c:forEach items="${bgList}" var="bg">
                    <tr style="border-bottom: #acb6c0 solid thin">
                        <td class="col-md-2">${bg.getTenBG()}</td>
                        <td class="col-md-2">${bg.getGiangVienHocSinh().getTenGVHS()}</td>
                        <td class="col-md-1">${bg.getNam()}</td>
                        <td class="col-md-6">${bg.getNoidung()}</td>
                        <td class="col-md-1"><a href="/HeThongTTQL/show?details=bg&id=${bg.getMaBG()}" class="label label-default">Chi tiết</a></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
