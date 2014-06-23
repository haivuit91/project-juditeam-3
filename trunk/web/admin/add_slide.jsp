<%-- 
    Document   : add_giangvien
    Created on : Jun 13, 2014, 7:38:00 AM
    Author     : Welcomes
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>quản lý Slide</title>
        <link href="../css/bootstrap.min.css" rel="stylesheet"/>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-lg-4 col-md-offset-4">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3><span class="glyphicon glyphicon-user"></span>${sl.getMaSlide() > 0 ? 'Thay đổi thông tin slide' : 'Thêm mới slide'}</h3>
                        </div>
                        <div class="panel-body">
                            <form class="form-horizontal" role="form" action="/HeThongTTQL/slidemanage?id=${sl.getMaSlide()}" method="post">
                                <div class="form-group">                                    
                                    <div class="col-sm-12" >
                                        <input type="text" name="maSlide" value="${sl.getMaSlide()}" disabled class="form-control" id="inputEmail3" placeholder="Mã slide">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-sm-12" >
                                        <input type="text" name="tenSlide" value="${sl.getTenSilde()}" class="form-control" id="inputEmail3" placeholder="Tên slide">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-sm-12" >
                                        <textarea name="noidung" class="col-md-12 form-control" style="margin-top: 5px" rows="4" id="inputEmail3" placeholder="Nội dung" >${sl.getNoidung()}</textarea>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-sm-12" >
                                        <input type="text" name="nam" value="${sl.getNam()}" class="form-control" id="inputEmail3" placeholder="Năm">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-sm-12" >
                                        <select class="form-control" name="gvhs">
                                            <option value="${sl.getGiangVienHocSinh().getMaGVHS()}">${sl.getGiangVienHocSinh().getMaGVHS()} - ${sl.getGiangVienHocSinh().getTenGVHS()}</option>
                                            <c:forEach items="${requestScope.GV}" var="GV">
                                                <c:if test="${GV.getMaGVHS() != sl.getGiangVienHocSinh().getMaGVHS()}">
                                                    <c:if test="${GV.getTrinhdo() != 0}">
                                                        <option value="${GV.getMaGVHS()}">${GV.getMaGVHS()} - ${GV.getTenGVHS()}</option>
                                                    </c:if>
                                                </c:if>
                                            </c:forEach>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-sm-12" >
                                        <select class="form-control" name="tulieu">
                                            <option value="${sl.getTuLieu().getMaTL()}">${sl.getTuLieu().getTenTL()}</option>
                                            <c:forEach items="${requestScope.tl}" var="tl">
                                                <c:if test="${tl.getMaTL() != sl.getTuLieu().getMaTL()}">
                                                    <option value="${tl.getMaTL()}">${tl.getTenTL()}</option>
                                                </c:if>
                                            </c:forEach>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-sm-3">
                                        <label class="label label-info" style="padding: 5px;font-size:13px">Đính kèm</label>
                                    </div>
                                    <div class="col-sm-9" >
                                        <input type="file" name="file" class="btn btn-default" style="width: 273px"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-sm-8 col-md-offset-4" >
                                        <input type="submit" ${sl.getMaSlide() > 0 ? 'value="Sửa"' : 'value="Thêm mới"'} name="submit" class="btn btn-success"/>
                                        &nbsp;
                                        <button type="reset" class="btn btn-warning">Nhập lại</button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script type="text/javascript" src="../js/jquery-1.11.1.min.js"></script>
        <script type="text/javascript" src="../js/bootstrap.min.js"></script>
    </body>
</html>
