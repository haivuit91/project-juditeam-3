<%-- 
    Document   : ds-gvhs
    Created on : Jun 20, 2014, 11:31:26 AM
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
                <p class="alert alert-success" style="text-align: center;text-transform: uppercase;font-weight: bold">danh sách học sinh</p>
            </div>
            <div class="panel-heading">
                <div class="row">
                    <div class="col-lg-5 col-lg-push-6">
                        <form action="/HeThongTTQL/search?by=hs" method="post">
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
                <tr>
                    <td class="col-md-1">STT</td>
                    <td class="col-md-2">Tên sinh viên</td>
                    <td class="col-md-4">Địa chỉ</td>
                    <td class="col-md-2">Ngày sinh</td>
                    <td class="col-md-1">SĐT</td>
                    <td class="col-md-2">Đơn vị</td>
                </tr>
            </table>
            <table class="col-md-12 table-hover">
                <% int i = 1;%>
                <c:forEach items="${hsList}" var="gvhs">
                    <c:if test="${gvhs.getTrinhdo() == 0 && gvhs.getTrangthai() == 1}">
                        <tr style="border-bottom: #acb6c0 solid thin">
                            <td class="col-md-1"><%= i++%></td>
                            <td class="col-md-2">${gvhs.getTenGVHS()}</td>
                            <td class="col-md-4">${gvhs.getDiachi()}</td>
                            <td class="col-md-2">${gvhs.getNgaysinh()}</td>
                            <td class="col-md-2">${gvhs.getDienthoai()}</td>
                            <td class="col-md-2">${gvhs.getDonvi()}</td>
                        </tr>
                    </c:if>
                </c:forEach>
            </table>
        </div>
    </body>
</html>