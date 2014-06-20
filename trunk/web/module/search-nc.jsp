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
                    <a href="/HeThongTTQL/Page?p=search-cb" class="label label-warning">Tìm kiếm cơ bản</a>
                </div>

                <div class="panel-body">
                    <form class="form-horizontal" action="/HeThongTTQL/search?do=search-nc" method="post">
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
                                        <option value="deCuong">Đề cương</option>
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
                                    <input type="text" name="nam" value="2014" class="form-control" id="inputEmail" placeholder="">
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
                    <div class="col-md-2">HỌ TÊN</div>
                    <div class="col-md-2">LOẠI THÔNG TIN</div>
                    <div class="col-md-3">TÊN</div>
                    <div class="col-md-5">NỘI DUNG</div>
                </div> 
                <c:if test="${gvhsList != null}">
                    <c:forEach items="${gvhsList}" var="gvhs">
                        <div class="panel-body">
                            <c:if test="${type == 'deCuong'}" >
                                <c:forEach items="${gvhs.getDecuongList()}" var="dc">
                                    <c:if test="${dc.getNoidung().toUpperCase().contains(noiDung)}">
                                        <div class="col-md-2">
                                            ${gvhs.getTenGVHS()} <br>
                                        </div>
                                        <div class="col-md-2">
                                            Đề cương
                                        </div>
                                        <div class="col-md-3">
                                            ${dc.getTenDC()}
                                        </div>
                                        <div class="col-md-5">
                                            ${dc.getNoidung()}&nbsp;<a href="/HeThongTTQL/search?do=details&maGV=${gvhs.getMaGVHS()}&maDC=${dc.getMaDC()}"><span class="glyphicon glyphicon-share-alt"></span></a><br>
                                        </div>
                                    </c:if></c:forEach>
                            </c:if>
                            <c:if test="${type == 'slide'}" >
                                <c:forEach items="${gvhs.getSlideList()}" var="sl">
                                    <c:if test="${sl.getNoidung().toUpperCase().contains(noiDung)}">
                                        <div class="col-md-2">
                                            ${gvhs.getTenGVHS()} <br>
                                        </div>
                                        <div class="col-md-2">
                                            Slide
                                        </div>
                                        <div class="col-md-3">
                                            ${sl.getTenSilde()}
                                        </div>
                                        <div class="col-md-5">
                                            ${sl.getNoidung()}&nbsp;<a href="/HeThongTTQL/search?do=details&maGV=${gvhs.getMaGVHS()}&maSL=${sl.getMaSlide()}"><span class="glyphicon glyphicon-share-alt"></span></a><br>
                                        </div>
                                    </c:if></c:forEach>
                            </c:if>
                            <c:if test="${type == 'baiGiang'}" >
                                <c:forEach items="${gvhs.getBaigiangList()}" var="bg">
                                    <c:if test="${bg.getNoidung().toUpperCase().contains(noiDung)}">
                                        <div class="col-md-2">
                                            ${gvhs.getTenGVHS()} <br>
                                        </div>
                                        <div class="col-md-2">
                                            Bài giảng
                                        </div>
                                        <div class="col-md-3">
                                            ${bg.getTenBG()}
                                        </div>
                                        <div class="col-md-5">
                                            ${bg.getNoidung()}&nbsp;<a href="/HeThongTTQL/search?do=details&maGV=${gvhs.getMaGVHS()}&maDC=${bg.getMaBG()}"><span class="glyphicon glyphicon-share-alt"></span></a><br>
                                        </div>
                                    </c:if></c:forEach>
                            </c:if>
                            <c:if test="${type == 'all'}" >
                                <c:forEach items="${gvhs.getDecuongList()}" var="dc">
                                    <c:if test="${dc.getNoidung().toUpperCase().contains(noiDung)}">
                                        <div class="col-md-2">
                                            ${gvhs.getTenGVHS()} <br>
                                        </div>
                                        <div class="col-md-2">
                                            Đề cương
                                        </div>
                                        <div class="col-md-3">
                                            ${dc.getTenDC()}
                                        </div>
                                        <div class="col-md-5">
                                            ${dc.getNoidung()}&nbsp;<a href="/HeThongTTQL/search?do=details&maGV=${gvhs.getMaGVHS()}&maDC=${dc.getMaDC()}"><span class="glyphicon glyphicon-share-alt"></span></a><br>
                                        </div>
                                    </c:if></c:forEach>
                                <c:forEach items="${gvhs.getSlideList()}" var="sl">
                                    <c:if test="${sl.getNoidung().toUpperCase().contains(noiDung)}">
                                        <div class="col-md-2">
                                            ${gvhs.getTenGVHS()} <br>
                                        </div>
                                        <div class="col-md-2">
                                            Slide
                                        </div>
                                        <div class="col-md-3">
                                            ${sl.getTenSilde()}
                                        </div>
                                        <div class="col-md-5">
                                            ${sl.getNoidung()}&nbsp;<a href="/HeThongTTQL/search?do=details&maGV=${gvhs.getMaGVHS()}&maSL=${sl.getMaSlide()}"><span class="glyphicon glyphicon-share-alt"></span></a><br>
                                        </div>
                                    </c:if></c:forEach>
                                <c:forEach items="${gvhs.getBaigiangList()}" var="bg">
                                    <c:if test="${bg.getNoidung().toUpperCase().contains(noiDung)}">
                                        <div class="col-md-2">
                                            ${gvhs.getTenGVHS()} <br>
                                        </div>
                                        <div class="col-md-2">
                                            Bài giảng
                                        </div>
                                        <div class="col-md-3">
                                            ${bg.getTenBG()}
                                        </div>
                                        <div class="col-md-5">
                                            ${bg.getNoidung()}&nbsp;<a href="/HeThongTTQL/search?do=details&maGV=${gvhs.getMaGVHS()}&maDC=${bg.getMaBG()}"><span class="glyphicon glyphicon-share-alt"></span></a><br>
                                        </div>
                                    </c:if></c:forEach>
                            </c:if>
                        </div>
                    </c:forEach>
                </c:if>

                <div class="panel-body" style="background:#f7f6f4">
                    <c:if test="${currentDC != null}">
                        <div class="panel-body" style="background:#f7f6f4">
                            <div class="col-md-2 lert alert-success "  style="font-weight:bold;padding: 5px">Họ tên</div>
                            <div class="col-md-10 lert alert-success" style="font-weight: initial;padding: 5px">
                                ${currentGVHS.getTenGVHS()}
                            </div>

                            <div class="col-md-2 alert-warning " style="font-weight:bold;padding: 5px">Đơn vị</div>
                            <div class="col-md-10 alert-warning" style="font-weight: initial;padding: 5px" >
                                ${currentGVHS.getDonvi()}
                            </div>
                            <div class="col-md-2 alert-success " style="font-weight:bold;padding: 5px">Ngày sinh</div>
                            <div class="col-md-10 alert-success " style="font-weight: initial;padding: 5px">
                                ${currentGVHS.getNgaysinh()}
                            </div>
                            <div class="col-md-2 alert-warning " style="font-weight:bold;padding: 5px">Địa chỉ</div>
                            <div class="col-md-10 alert-warning " style="font-weight: initial;padding: 5px">
                                ${currentGVHS.getDiachi()}
                            </div>
                            <div class="col-md-2 alert-success " style="font-weight:bold;padding: 5px">Tên đề cương</div>
                            <div class="col-md-10 alert-success " style="font-weight: initial;padding: 5px">
                                ${currentDC.getTenDC()}
                            </div>
                            <div class="col-md-2 alert-success " style="font-weight:bold;padding: 5px">Nội dung</div>
                            <div class="col-md-10 alert-success " style="font-weight: initial;padding: 5px">
                                ${currentDC.getNoidung()}
                            </div>
                        </c:if>
                        <c:if test="${currentSL != null}">
                            <div class="panel-body" style="background:#f7f6f4">
                                <div class="col-md-2 lert alert-success "  style="font-weight:bold;padding: 5px">Họ tên</div>
                                <div class="col-md-10 lert alert-success" style="font-weight: initial;padding: 5px">
                                    ${currentGVHS.getTenGVHS()}
                                </div>

                                <div class="col-md-2 alert-warning " style="font-weight:bold;padding: 5px">Đơn vị</div>
                                <div class="col-md-10 alert-warning" style="font-weight: initial;padding: 5px" >
                                    ${currentGVHS.getDonvi()}
                                </div>
                                <div class="col-md-2 alert-success " style="font-weight:bold;padding: 5px">Ngày sinh</div>
                                <div class="col-md-10 alert-success " style="font-weight: initial;padding: 5px">
                                    ${currentGVHS.getNgaysinh()}
                                </div>
                                <div class="col-md-2 alert-warning " style="font-weight:bold;padding: 5px">Địa chỉ</div>
                                <div class="col-md-10 alert-warning " style="font-weight: initial;padding: 5px">
                                    ${currentGVHS.getDiachi()}
                                </div>
                                <div class="col-md-2 alert-success " style="font-weight:bold;padding: 5px">Tên Slide</div>
                                <div class="col-md-10 alert-success " style="font-weight: initial;padding: 5px">
                                    ${currentSL.getTenSilde()}
                                </div>
                                <div class="col-md-2 alert-success " style="font-weight:bold;padding: 5px">Nội dung</div>
                                <div class="col-md-10 alert-success " style="font-weight: initial;padding: 5px">
                                    ${currentSL.getNoidung()}
                                </div>
                            </c:if>
                            <c:if test="${currentBG != null}">
                                <div class="panel-body" style="background:#f7f6f4">
                                    <div class="col-md-2 lert alert-success "  style="font-weight:bold;padding: 5px">Họ tên</div>
                                    <div class="col-md-10 lert alert-success" style="font-weight: initial;padding: 5px">
                                        ${currentGVHS.getTenGVHS()}
                                    </div>

                                    <div class="col-md-2 alert-warning " style="font-weight:bold;padding: 5px">Đơn vị</div>
                                    <div class="col-md-10 alert-warning" style="font-weight: initial;padding: 5px" >
                                        ${currentGVHS.getDonvi()}
                                    </div>
                                    <div class="col-md-2 alert-success " style="font-weight:bold;padding: 5px">Ngày sinh</div>
                                    <div class="col-md-10 alert-success " style="font-weight: initial;padding: 5px">
                                        ${currentGVHS.getNgaysinh()}
                                    </div>
                                    <div class="col-md-2 alert-warning " style="font-weight:bold;padding: 5px">Địa chỉ</div>
                                    <div class="col-md-10 alert-warning " style="font-weight: initial;padding: 5px">
                                        ${currentGVHS.getDiachi()}
                                    </div>
                                    <div class="col-md-2 alert-success " style="font-weight:bold;padding: 5px">Tên bài giảng</div>
                                    <div class="col-md-10 alert-success " style="font-weight: initial;padding: 5px">
                                        ${currentBG.getTenBG()}
                                    </div>
                                    <div class="col-md-2 alert-success " style="font-weight:bold;padding: 5px">Nội dung</div>
                                    <div class="col-md-10 alert-success " style="font-weight: initial;padding: 5px">
                                        ${currentBG.getNoidung()}
                                    </div>
                                </c:if>
                            </div>
                        </div>
                    </div>
                    <script src="../js/bootstrap.js" type="text/javascript"></script>
                    <script src="../js/bootstrap.min.js" type="text/javascript"></script>
                </div></div></div>
    </body>
</html>
