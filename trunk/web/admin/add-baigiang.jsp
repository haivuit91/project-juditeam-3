<%-- 
    Document   : add-baigiang
    Created on : Jun 12, 2014, 10:26:43 PM
    Author     : Khoa
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../css/bootstrap-theme.min.css" rel="stylesheet"/>
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
        <link href="../css/bootstrap.min.css" rel="stylesheet"/>
        <title>Thêm Bài Giảng</title>
        <style>
            body{
                padding:70px 0px;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-lg-4 col-md-offset-4">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3><span class="glyphicon glyphicon-user"></span>${vb.getMaBG() > 0 ? 'Thay đổi thông tin bài giảng' : 'Thêm mới bài giảng'}</h3>
                        </div>
                        <div class="panel-body">
                            <form class="form-horizontal" role="form" action="/project3/bgmanage?id=${vb.getMaBG()}" method="post">
                                <!-- /.Mã BG -->
                                <div class="form-group">                                    
                                    <div class="col-sm-12" >
                                        <input type="text" name="maBG" value="${vb.getMaBG()}" disabled class="form-control" id="inputEmail3" placeholder="Mã bài giảng">
                                    </div>
                                </div>
                                <!-- /.tên BGB -->
                                <div class="form-group">
                                    <div class="col-sm-12" >
                                        <input type="text" name="tenBG" value="${vb.getTenBG()}" class="form-control" id="inputEmail3" placeholder="Tên bài giảng">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-sm-12" >
                                        <textarea name="noiDung" class="col-md-12 form-control" style="margin-top: 5px" rows="4" id="inputEmail3" placeholder="Nội dung" >${vb.getNoiDung()}</textarea>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-sm-12" >
                                        <input type="text" name="nam" value="${vb.getNam()}" class="form-control" id="inputEmail3" placeholder="Năm phát hành">
                                    </div>
                                </div>
                                <!-- /.Giang vien hoc sinh -->
                                <div class="form-group">
                                    <div class="col-sm-3" >
                                        <label class="label label-info" style="padding: 5px;font-size:13px">Tác Giả</label>
                                    </div>
                                    <div class="col-sm-9" >
                                        <select class="form-control" name="gVienHS">
                                            <c:forEach items="${gvhsList}" var="gvhsList">
                                                <option value="${gvhsList.getGiangVienHocSinh().getTenGVHS()}">${gvhsList.getGiangVienHocSinh().getTenGVHS()}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                </div>
                                <!-- /.Button -->
                                <div class="form-group">
                                    <div class="col-sm-12" >
                                        <input type="submit" ${vb.getMaBG() > 0 ? 'value="Sửa"' : 'value="Thêm mới"'} name="submit" class="btn btn-success"/>
                                        &nbsp;
                                        <button type="reset" class="btn btn-warning">Clear</button>
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