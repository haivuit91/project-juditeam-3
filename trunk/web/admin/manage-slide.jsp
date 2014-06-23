<%-- 
    Document   : manage-slide
    Created on : Jun 12, 2014, 4:56:51 PM
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
        <div class="alert alert-danger" style="text-align: center"><b>QUẢN LÝ SLIDE </b></div>
        <div class="panel panel-default">
            <!-- Default panel contents -->
            <div class="panel-heading">
                <a href="/HeThongTTQL/slidemanage?do=add" class="btn btn-primary btn-sm" >
                    Tạo mới Slide
                </a>               
                <div class="row">
                    <div class="col-lg-5 col-lg-push-6">
                        <form action="/HeThongTTQL/slidemanage?do=search" method="post">
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
                    <td class="col-md-2" style="background: #428bca;padding:5px;font-weight:bold;font-size: 12px;text-transform: uppercase;color:#ffffff">Tên Slide</td>
                    <td class="col-md-2" style="background: #428bca;padding:5px;font-weight:bold;font-size: 12px;text-transform: uppercase;color:#ffffff">Nội Dung</td>
                    <td class="col-md-1" style="background: #428bca;padding:5px;font-weight:bold;font-size: 12px;text-transform: uppercase;color:#ffffff">Năm XB</td>
                    <td class="col-md-2" style="background: #428bca;padding:5px;font-weight:bold;font-size: 12px;text-transform: uppercase;color:#ffffff">Tên Giảng Viên</td>
                    <td class="col-md-2" style="background: #428bca;padding:5px;font-weight:bold;font-size: 12px;text-transform: uppercase;color:#ffffff">Tư Liệu</td>
                    <td class="col-md-2" style="background: #428bca;padding:5px;font-weight:bold;font-size: 12px;text-transform: uppercase;color:#ffffff">Đính Kèm</td>
                    <td class="col-md-2" style="background: #428bca;padding:5px;font-weight:bold;font-size: 12px;text-transform: uppercase;color:#ffffff">Lựa Chọn</td>
                </tr>
                <% int i = 1; %>
                <c:forEach items="${requestScope.slideList}" var="slList">
                    <tr>
                        <td style="text-transform: inherit;padding:5px"><%= i++%></td>
                        <td class="col-md-2" style="text-transform: inherit;padding:5px">${slList.getTenSilde()}</td>
                        <td class="col-md-2" style="text-transform: inherit;padding:5px">${slList.getNoidung()}</td>
                        <td class="col-md-1" style="text-transform: inherit;padding:5px">${slList.getNam()}</td>
                        <td class="col-md-2" style="text-transform: inherit;padding:5px">${slList.getGiangVienHocSinh().getTenGVHS()}</td>
                        <td class="col-md-2" style="text-transform: inherit;padding:5px">${slList.getTuLieu().getTenTL()}</td>
                        <td class="col-md-2" style="text-transform: inherit;padding:5px">${slList.getTlThamkhao()}</td>
                        <td class="col-md-2" style="text-transform: inherit;padding:5px">
                            <div class="col-md-6">
                                <a href="/HeThongTTQL/slidemanage?do=edit&id=${slList.getMaSlide()}" class="btn btn-primary btn-sm" >
                                    <span class="glyphicon glyphicon-wrench"></span>
                                </a>
                            </div>
                            <div class="col-md-6">
                                <a href="/HeThongTTQL/slidemanage?do=del&id=${slList.getMaSlide()}" onclick="return confirm('Bạn thực sự muốn xóa: ${slList.getTenSilde()}?')" class="btn btn-primary btn-sm" role="button"><span class="glyphicon glyphicon-trash"></span></a>
                            </div>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
