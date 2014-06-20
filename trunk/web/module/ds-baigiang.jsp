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
