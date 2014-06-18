<%-- 
    Document   : manage-decuongchitiet
    Created on : Jun 12, 2014, 4:57:33 PM
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
        <div class="alert alert-danger" style="text-align: center"><b>QUẢN LÝ ĐỀ CƯƠNG CHI TIẾT </b></div>
        <div class="panel panel-default">
            <!-- Default panel contents -->
            <div class="panel-heading">
                <a href="/project3/dcctmamage?do=add" class="btn btn-primary btn-sm" >
                    Tạo mới đề cương chi tiết
                </a>               
                <div class="row">
                    <div class="col-lg-5 col-lg-push-6">
                        <form action="/project3/dcctmamage?do=search" method="post">
                            <div class="col-md-11">

                                <div class="input-group">

                                    <div class="input-group-btn">
                                        <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                                            <span class="glyphicon glyphicon-search"></span>
                                            <span class="caret"></span></button>

                                    </div><!-- /btn-group -->

                                    <input type="text" name="tukhoa" class="form-control" placeholder="Nhập từ khóa muốn tìm...">

                                </div><!-- /input-group -->
                            </div><!-- /input-group -->
                            <div class="col-md-1">
                                <input type="submit" name="submit" value="Tìm kiếm" class="btn btn-default dropdown-toggle" style="background:#3e8f3e;color:#ffffff">
                            </div>
                        </form>
                    </div><!-- /.col-lg-6 -->
                </div><!-- /.row -->
            </div>
            <table>
                <tr>
                    <td style="background: #428bca;padding:5px;font-weight:bold;font-size: 12px;text-transform: uppercase;color:#ffffff">Mã</td>
                    <td class="col-md-2" style="background: #428bca;padding:5px;font-weight:bold;font-size: 12px;text-transform: uppercase;color:#ffffff">Tên ĐC</td>
                    <td class="col-md-1" style="background: #428bca;padding:5px;font-weight:bold;font-size: 12px;text-transform: uppercase;color:#ffffff">ĐV Học Trình</td>
                    <td class="col-md-1" style="background: #428bca;padding:5px;font-weight:bold;font-size: 12px;text-transform: uppercase;color:#ffffff">Thời Gian</td>
                    <td class="col-md-1" style="background: #428bca;padding:5px;font-weight:bold;font-size: 12px;text-transform: uppercase;color:#ffffff">Điều Kiện</td>
                    <td class="col-md-1" style="background: #428bca;padding:5px;font-weight:bold;font-size: 12px;text-transform: uppercase;color:#ffffff">Mục Tiêu</td>
                    <td class="col-md-2" style="background: #428bca;padding:5px;font-weight:bold;font-size: 12px;text-transform: uppercase;color:#ffffff">Nội Dung</td>
                    <td class="col-md-1" style="background: #428bca;padding:5px;font-weight:bold;font-size: 12px;text-transform: uppercase;color:#ffffff">Tiêu Chuẩn</td>
                    <td class="col-md-1" style="background: #428bca;padding:5px;font-weight:bold;font-size: 12px;text-transform: uppercase;color:#ffffff">Năm</td>
                    <td class="col-md-1" style="background: #428bca;padding:5px;font-weight:bold;font-size: 12px;text-transform: uppercase;color:#ffffff">Giảng Viên</td>
                    <td class="col-md-2" style="background: #428bca;padding:5px;font-weight:bold;font-size: 12px;text-transform: uppercase;color:#ffffff">Lựa Chọn</td>
                </tr>
                <c:forEach items="${dcctList}" var="dcctList">
                    <tr>
                        <td style="text-transform: inherit;padding:5px">${dcctList.getMaDC()}</td>
                        <td class="col-md-2" style="text-transform: inherit;padding:5px">${dcctList.getTenDC()}</td>
                        <td class="col-md-1" style="text-transform: inherit;padding:5px">${dcctList.getDvhoctrinh()}</td>
                        <td class="col-md-1" style="text-transform: inherit;padding:5px">${dcctList.getThoigian()}</td>
                        <td class="col-md-1" style="text-transform: inherit;padding:5px">${dcctList.getDieukien()}</td>
                        <td class="col-md-1" style="text-transform: inherit;padding:5px">${dcctList.getMuctieu()}</td>
                        <td class="col-md-2" style="text-transform: inherit;padding:5px">${dcctList.getNoidung()}</td>
                        <td class="col-md-1" style="text-transform: inherit;padding:5px">${dcctList.getTieuchuan()}</td>
                        <td class="col-md-1" style="text-transform: inherit;padding:5px">${dcctList.getNam()}</td>
                        <td class="col-md-1" style="text-transform: inherit;padding:5px">${dcctList.getGiangVienHocSinh().getTenGVHS()}</td>
                        <td class="col-md-2" style="text-transform: inherit;padding:5px">
                            <div class="col-md-6">
                                <a href="/project3/dcctmamage?do=edit&maDC=${dcctList.getMaDC()}" class="btn btn-primary btn-sm" >
                                    <span class="glyphicon glyphicon-wrench"></span>
                                </a>
                            </div>
                            <div class="col-md-6">
                                <a href="/project3/dcctmamage?do=delete&maDC=${dcctList.getMaDC()}" onclick="return confirm('Bạn thực sự muốn xóa: ${dcctList.getTenDC()}?')" class="btn btn-primary btn-sm" role="button"><span class="glyphicon glyphicon-trash"></span></a>
                            </div>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
