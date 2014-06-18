<%-- 
    Document   : manage-baigiang
    Created on : Jun 12, 2014, 4:56:42 PM
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
        <div class="alert alert-danger" style="text-align: center"><b>QUẢN LÝ BÀI GIẢNG </b></div>
        <div class="panel panel-default">
            <!-- Default panel contents -->
            <div class="panel-heading">
                <a href="/project3/bgmanage?page=add" class="btn btn-primary btn-sm" >
                    Tạo mới bài giảng
                </a>               
                <div class="row">
                    <div class="col-lg-5 col-lg-push-6">
                        <form action="/project3/bgmanage?page=search" method="post">
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
                </div><!-- /.row -->
            </div>
            <table>
                <tr>
                    <td style="background: #428bca;padding:5px;font-weight:bold;font-size: 12px;text-transform: uppercase;color:#ffffff">Mã</td>
                    <td class="col-md-3" style="background: #428bca;padding:5px;font-weight:bold;font-size: 12px;text-transform: uppercase;color:#ffffff">Tên BG</td>
                    <td class="col-md-4" style="background: #428bca;padding:5px;font-weight:bold;font-size: 12px;text-transform: uppercase;color:#ffffff">Nội Dung</td>
                    <td class="col-md-2" style="background: #428bca;padding:5px;font-weight:bold;font-size: 12px;text-transform: uppercase;color:#ffffff">Năm</td>
                    <td class="col-md-2" style="background: #428bca;padding:5px;font-weight:bold;font-size: 12px;text-transform: uppercase;color:#ffffff">Tên GV</td>
                    <td class="col-md-2" style="background: #428bca;padding:5px;font-weight:bold;font-size: 12px;text-transform: uppercase;color:#ffffff">Lựa Chọn</td>
                </tr>
                <c:forEach items="${bgList}" var="bgList">
                    <tr>
                        <td style="text-transform: inherit;padding:5px">${bgList.getMaBG()}</td>
                        <td class="col-md-3" style="text-transform: inherit;padding:5px">${bgList.getTenBG()}</td>
                        <td class="col-md-4" style="text-transform: inherit;padding:5px">${bgList.getNoidung()}</td>
                        <td class="col-md-2" style="text-transform: inherit;padding:5px">${bgList.getNam()}</td>
                        <td class="col-md-2" style="text-transform: inherit;padding:5px">${bgList.getGiangVienHocSinh().getTenGVHS()}</td>
                        <td class="col-md-2" style="text-transform: inherit;padding:5px">
                            <div class="col-md-6">
                                <a href="/project3/bgmanage?page=edit&maBG=${bgList.getMaBG()}" class="btn btn-primary btn-sm" >
                                    <span class="glyphicon glyphicon-wrench"></span>
                                </a>
                            </div>
                            <div class="col-md-6">
                                <a href="/project3/bgmanage?page=delete&maBG=${bgList.getMaBG()}" onclick="return confirm('Bạn thực sự muốn xóa: ${bgList.getTenBG()}?')" class="btn btn-primary btn-sm" role="button"><span class="glyphicon glyphicon-trash"></span></a>
                            </div>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
