<%-- 
    Document   : ds-tulieu
    Created on : Jun 20, 2014, 11:47:02 AM
    Author     : Welcomes
--%>

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
                <p class="alert alert-warning" style="text-align: center;text-transform: uppercase;font-weight: bold">danh sách tư liệu</p>
            </div>
            <div class="panel-heading">
                <div class="row">
                    <div class="col-lg-5 col-lg-push-6">
                        <form action="/HeThongTTQL/search?by=tl" method="post">
                            <div class="col-md-11">

                                <div class="input-group">

                                    <div class="input-group-btn">
                                        <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                                            <span class="glyphicon glyphicon-search"></span>
                                            <span class="caret"></span></button>

                                    </div><!-- /btn-group -->

                                    <input type="text" name="tukhoa" class="form-control" placeholder="Nhập tên thông tin muốn tìm...">

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
                    <td class="col-md-2">Tên tư liệu</td>
                    <td class="col-md-2">Loại</td>
                    <td class="col-md-2">Nguồn</td>
                    <td class="col-md-1">Năm</td>
                    <td class="col-md-4">Tóm tắt nội dung</td>
                    <td class="col-md-1"></td>
                </tr>
            </table>
            <table class="col-md-12 table-hover">
                <c:forEach items="${tlList}" var="tl">
                    <tr style="border-bottom: #acb6c0 solid thin">
                        <td class="col-md-2">${tl.getTenTL()}</td>
                        <td class="col-md-2">${tl.getLoaiTL()}</td>
                        <td class="col-md-2">${tl.getNguonTL()}</td>
                        <td class="col-md-1">${tl.getNam()}</td>
                        <td class="col-md-4">${tl.getNoidung()}</td>
                        <td class="col-md-1"><a href="/HeThongTTQL/show?details=tl&id=${tl.getMaTL()}" class="label label-default">Chi tiết</a></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
