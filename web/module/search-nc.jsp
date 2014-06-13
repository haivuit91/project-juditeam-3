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
                            </div>



                            <div class="form-group">
                                <div class="col-lg-10 col-lg-offset-2">                                    
                                    <input type="submit" name="submit" value="Tìm kiếm" class="btn btn-primary">
                                    <input value="Nhập lại" class="btn btn-default" type="reset">
                                </div>
                            </div>
                        </fieldset>
                    </form>
                </div>
                <div class="panel-body">
                    <c:if test="${gvhsList != null}">
                        Kết quả:
                        <c:forEach items="${gvhsList}" var="gvhs">
                            Họ tên: ${gvhs.getTenGVHS()}<br>
                            Bài giảng: 
                            <c:forEach items="${gvhs.getDecuongList()}" var="dc">
                                <c:if test="${dc.getNoidung().contains(noiDung)}">
                                    ${dc.getNoidung()}
                                </c:if>
                            </c:forEach><br>
                        </c:forEach>
                    </c:if>


                </div>

            </div>
        </div>
        <script src="../js/bootstrap.js" type="text/javascript"></script>
        <script src="../js/bootstrap.min.js" type="text/javascript"></script>
    </body>
</html>
