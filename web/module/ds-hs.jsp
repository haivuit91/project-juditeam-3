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
            <table class="col-md-12"style="font-weight: bold;color:wheat;background:#4986bd;text-transform: uppercase">
                <tr>
                    <td class="col-md-2">Tên học sinh</td>
                    <td class="col-md-4">Địa chỉ</td>
                    <td class="col-md-2">Ngày sinh</td>
                    <td class="col-md-2">Điện thoại</td>
                    <td class="col-md-2">Đơn vị</td>
                </tr>
            </table>
            <table class="col-md-12 table-hover">
                <c:forEach items="${hsList}" var="gvhs">
                    <c:if test="${gvhs.getTrinhdo() == 0 && gvhs.getTrangthai() == 1}">
                        <tr style="border-bottom: #acb6c0 solid thin">
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
