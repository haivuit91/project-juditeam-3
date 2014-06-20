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
                    <a href="/project3/Page?p=search-nc"class="label label-default">Tìm kiếm nâng cao</a>

                </div>

                <div class="panel-body">
                    <form class="form-horizontal" action="/project3/search?do=search-cb" method="post">
                        <fieldset>
                            <legend>Tìm kiếm cơ bản</legend>
                            <div class="form-group">
                                <label for="select" class="col-lg-2 control-label">Tên thông tin</label>
                                <div class="col-lg-5">
                                    <input type="text" name="keyWord" class="form-control" id="inputEmail" placeholder="">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-lg-10 col-lg-offset-2">
                                    <input type="submit" name="submit" value="Tìm kiếm" class="btn btn-primary" />
                                </div>
                            </div>
                        </fieldset>
                    </form>
                </div>
            </div>
        </div>
        <div class="col-md-10">
            <div class="panel panel-primary">
                <div class="panel-heading" style="text-align: center">
                    KẾT QUẢ TÌM KIẾM
                </div>
                <c:if test="${gvhsList.size() < 1 || gvhsList == null && currentDC == null && currentSL == null && currentBG == null}">
                    <p>Không có bản ghi nào được tìm thấy!</p>
                </c:if>
                <c:if test="${gvhsList.size() > 0}">
                    <div class="panel-body" style="background:#004050;color:wheat">
                        <div class="col-md-1">MÃ</div>
                        <div class="col-md-2">TÊN GVHS</div>
                        <div class="col-md-3">TÊN ĐỀ CƯƠNG CHI TIẾT</div>
                        <div class="col-md-3">TÊN SLIDE</div>
                        <div class="col-md-3">TÊN BÀI GIẢNG</div>

                    </div>
                    <c:forEach items="${gvhsList}" var="gvhs">
                        <div class="panel-body" style="background:#dadadd">
                            <div class="col-md-1">${gvhs.getMaGVHS()}</div>
                            <div class="col-md-2"> ${gvhs.getTenGVHS()}<br>
                            </div>
                            <div class="col-md-3">
                                <c:if test="${gvhs.getDecuongList().size() > 0}">
                                    <c:forEach items="${gvhs.getDecuongList()}" var="dc">
                                        ${dc.getTenDC()}&nbsp;<a href="/project3/search?do=details&maGV=${gvhs.getMaGVHS()}&maDC=${dc.getMaDC()}"><span class="glyphicon glyphicon-share-alt"></span></a><br>
                                        </c:forEach>
                                    </c:if>
                            </div>
                            <div class="col-md-3">
                                <c:if test="${gvhs.getSlideList().size() > 0}">
                                    <c:forEach items="${gvhs.getSlideList()}" var="sl">
                                        ${sl.getTenSilde()}&nbsp;<a href="/project3/search?do=details&maGV=${gvhs.getMaGVHS()}&maSL=${sl.getMaSlide()}"><span class="glyphicon glyphicon-share-alt"></span></a><br>
                                        </c:forEach>
                                    </c:if>
                            </div>
                            <div class="col-md-3">
                                <c:if test="${gvhs.getBaigiangList().size() > 0}">
                                    <c:forEach items="${gvhs.getBaigiangList()}" var="bg">
                                        ${bg.getTenBG()}&nbsp;<a href="/project3/search?do=details&maGV=${gvhs.getMaGVHS()}&maBG=${bg.getMaBG()}"><span class="glyphicon glyphicon-share-alt"></span></a><br>
                                        </c:forEach>
                                    </c:if>
                            </div>
                        </div>
                    </c:forEach>

                </c:if>
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
                            <div class="col-md-2 alert-warning " style="font-weight:bold;padding: 5px">Nội dung</div>
                            <div class="col-md-10 alert-warning " style="font-weight: initial;padding: 5px">
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
                                <div class="col-md-2 alert-warning " style="font-weight:bold;padding: 5px">Nội dung</div>
                                <div class="col-md-10 alert-warning " style="font-weight: initial;padding: 5px">
                                    ${currentBG.getNoidung()}
                                </div>
                            </c:if>
                        </div>

                    </div>

                </div>
                <script src="../js/bootstrap.js" type="text/javascript"></script>
                <script src="../js/bootstrap.min.js" type="text/javascript"></script>
                </body>
                </html>
