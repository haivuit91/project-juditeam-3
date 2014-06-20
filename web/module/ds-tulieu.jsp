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
                        <td class="col-md-1"><a href="/HeThongTTQL/show?details=slide&id=${tl.getMaTL()}" class="label label-default">Chi tiết</a></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
