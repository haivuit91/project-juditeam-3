<%-- 
    Document   : add_giangvien
    Created on : Jun 13, 2014, 7:38:00 AM
    Author     : Welcomes
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
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-lg-4 col-md-offset-4">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3><span class="glyphicon glyphicon-user"></span>${dcct.getMaDC() > 0 ? 'Thay đổi thông tin ĐCCT' : 'Thêm mới ĐCCT'}</h3>
                        </div>
                        <div class="panel-body">
                            <form class="form-horizontal" role="form" action="/project3/dcctmamage?maDC=${dcct.getMaDC()}" method="post">
                                <!-- /.UserName -->
                                <div class="form-group">                                    
                                    <div class="col-sm-12" >
                                        <input type="text" name="maDC" value="${dcct.getMaDC()}" disabled class="form-control" id="inputEmail3" placeholder="Mã đề cương">
                                    </div>
                                </div>
                                <!-- /.UserName -->
                                <div class="form-group">

                                    <div class="col-sm-12" >
                                        <input type="text" name="tenDC" value="${dcct.getTenDC()}" ${dcct.getMaDC() > 0 ? 'disabled' : ''} class="form-control" id="inputEmail3" placeholder="Tên  đề cương chi tiết">
                                    </div>
                                </div>
                                <!-- /.Password -->
                                <div class="form-group">

                                    <div class="col-sm-12" >
                                        <input type="text" name="dvhoctrinh" value="${dcct.getDvhoctrinh()}" class="form-control" id="inputEmail3" placeholder="Đơn vị học trình">
                                    </div>
                                </div>
                                <!-- /.FullName -->
                                <div class="form-group">

                                    <div class="col-sm-12" >
                                        <input type="text" name="thoigian" value="${dcct.getThoigian()}" class="form-control" id="inputEmail3" placeholder="Thời gian">
                                    </div>
                                </div>
                                <!-- /.Email -->
                                <div class="form-group">

                                    <div class="col-sm-12" >
                                        <input type="text" name="dieukien" value="${dcct.getDieukien()}" class="form-control" id="inputEmail3" placeholder="điều kiện">
                                    </div>
                                </div>
                                <!-- /.Phone -->
                                <div class="form-group">

                                    <div class="col-sm-12" >
                                        <input type="text" name="muctieu" value="${dcct.getMuctieu()}" class="form-control" id="inputEmail3" placeholder="Mục tiêu">
                                    </div>
                                </div>
                                <!--Trinh do-->
                                <div class="form-group">
                                    <div class="col-sm-12" >
                                        <textarea name="noiDung" class="col-md-12 form-control" style="margin-top: 5px" rows="4" id="inputEmail3" placeholder="Nội dung" >${dcct.getNoidung()}</textarea>
                                    </div>
                                </div>
                                <!--Trinh do-->
                                <div class="form-group">

                                    <div class="col-sm-12" >
                                        <input type="text" name="tieuchuan" value="${dcct.getTieuchuan()}" class="form-control" id="inputEmail3" placeholder="tieuchuan">
                                    </div>
                                </div>
                                <!--Trinh do-->
                                <div class="form-group">

                                    <div class="col-sm-12" >
                                        <input type="text" name="nam" value="${dcct.getNam()}" class="form-control" id="inputEmail3" placeholder="Năm">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-sm-3" >
                                        <label class="label label-info" style="padding: 5px;font-size:13px">Tác Giả</label>
                                    </div>
                                    <div class="col-sm-9" >
                                        <select class="form-control" name="gVienHS">
                                            <c:forEach items="${gvhsList}" var="gvhsList">
                                                <option value="${gvhsList.getMaGVHS()}">${gvhsList.getTenGVHS()}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-sm-8 col-md-offset-4" >
                                        <input type="submit" ${dcct.getMaDC() > 0 ? 'value="Sửa"' : 'value="Thêm mới"'} name="submit" class="btn btn-success"/>
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
