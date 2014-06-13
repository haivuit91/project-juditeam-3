<%-- 
    Document   : seacher
    Created on : Jun 6, 2014, 10:30:37 AM
    Author     : Welcomes
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
            <div class="panel panel-primary">
                <div class="panel-heading">
                    TRA CỨU THÔNG TIN
                </div>
                <div class="col-sm-2 col-sm-offset-10">
                    <a href="/project3/Page?p=search-cb" class="label label-warning">Tìm kiếm cơ bản</a>
                </div>

                <div class="panel-body">
                    <form class="form-horizontal" action="/project3/search?do=search-nc" method="post">
                        <fieldset>
                            <legend>Tìm kiếm nâng cao</legend>

                            <div class="form-group">
                                <label for="select" class="col-lg-2 control-label">Tên thông tin</label>
                                <div class="col-lg-5">
                                    <input type="text" name="tenTT" class="form-control" id="inputEmail" placeholder="">
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="select" class="col-lg-2 control-label">Loại thông tin</label>
                                <div class="col-lg-5">
                                    <select name="loaiTT" class="form-control" id="select">
                                        <option value="all">Tất cả</option>
                                        <option value="slide">Slide</option>
                                        <option value="baiGiang">Bài giảng</option>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="select" class="col-lg-2 control-label">Người thực hiện</label>
                                <div class="col-lg-5">
                                    <input type="text" name="nguoiThucHien" class="form-control" id="inputEmail" placeholder="">
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="select" class="col-lg-2 control-label">Ngày tháng năm</label>
                                <div class="col-lg-5">
                                    <input type="text" name="nam" class="form-control" id="inputEmail" placeholder="">
                                </div>
                            </div><div class="form-group">
                                <div class="col-lg-10 col-lg-offset-2">                                    
                                    <input type="submit" name="submit" value="Tìm kiếm" class="btn btn-primary">
                                    <input value="Nhập lại" class="btn btn-default" type="reset">
                                </div>
                            </div>
                        </fieldset>
                    </form>
                </div>
                <div class="panel-body" style="background:#004050;color:wheat">
                    <div class="col-md-3">HỌ TÊN</div>
                    <div class="col-md-9">NỘI DUNG</div>
                </div> 
                <c:if test="${gvhsList != null}">
                      <c:forEach items="${gvhsList}" var="gvhs">
                        <div class="panel-body">
                            <div class="col-md-3">
                                ${gvhs.getTenGVHS()} <br>
                            </div>
                            <div class="col-md-9">
                                <c:forEach items="${gvhs.getDecuongList()}" var="dc">
                                    <c:if test="${dc.getNoidung().contains(noiDung)}">
                                        ${dc.getNoidung()}&nbsp;<a href="#"><span class="glyphicon glyphicon-share-alt"></span></a><br>
                                    </c:if>
                                </c:forEach><br>

                            </div>
                        </div>
                    </c:forEach>
                </c:if>

                <div class="panel-body" style="background:#f7f6f4">
                    <!---------------------------------------------------->
                    <div class="col-md-2 lert alert-success "  style="font-weight:bold;padding: 5px">Họ tên</div>
                    <div class="col-md-10 lert alert-success" style="font-weight: initial;padding: 5px">
                        Họ tên
                    </div>

                    <!---------------------------------------------------->
                    <div class="col-md-2 alert-warning " style="font-weight:bold;padding: 5px">Đơn vị</div>
                    <div class="col-md-10 alert-warning" style="font-weight: initial;padding: 5px" >
                        Khoa cơ bản
                    </div>
                    <!---------------------------------------------------->
                    <div class="col-md-2 alert-success " style="font-weight:bold;padding: 5px">Ngày sinh</div>
                    <div class="col-md-10 alert-success " style="font-weight: initial;padding: 5px">
                        15/06/1990
                    </div>
                    <!---------------------------------------------------->
                    <div class="col-md-2 alert-warning " style="font-weight:bold;padding: 5px">Địa chỉ</div>
                    <div class="col-md-10 alert-warning " style="font-weight: initial;padding: 5px">
                        45 Dũng Sĩ Thanh Khê- Đà Nẵng
                    </div>
                    <!---------------------------------------------------->
                    <div class="col-md-2 alert-success " style="font-weight:bold;padding: 5px">Nội dung</div>
                    <div class="col-md-10 alert-success " style="font-weight: initial;padding: 5px">
                        Nội dung cần hiển thị
                    </div>
                    <!---------------------------------------------------->
                </div>
            </div>
        </div>
        <script src="../js/bootstrap.js" type="text/javascript"></script>
        <script src="../js/bootstrap.min.js" type="text/javascript"></script>
    </body>
</html>
