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

                <div class="panel-body">
                    <c:forEach items="${gvhsList}" var="gvhs">
                        Họ tên: ${gvhs.getTenGVHS()}
                    </c:forEach>
                </div>
            </div>
        </div>
        <div class="col-md-10">
            <div class="panel panel-primary">
                <div class="panel-heading" style="text-align: center">
                    KẾT QUẢ TÌM KIẾM
                </div>
                <div class="panel-body"style="background:#004050;color:wheat;text-transform: uppercase">
                    <div class="col-md-1">mã</div>
                    <div class="col-md-9">Nhãn đề</div>
                    <div class="col-md-1"><span class="glyphicon glyphicon-floppy-disk"></span></div>
                    <div class="col-md-1"><span class="glyphicon glyphicon-ok"></span></div>
                </div>
                <div class="panel-body"style="background:#dadadd">
                    <div class="col-md-1">1</div>
                    <div class="col-md-8">Nguyễn Ngọc Duy</div>
                    <div class="col-md-2"></div>
                    <div class="col-md-1">
                        <a href="#" class="label label-default"><span class="glyphicon glyphicon-ok"></span>&nbsp;Chi tiết</a>
                    </div>
                </div>

                <div class="panel-body"style="background:#f7f6f4">
                    <!---------------------------------------------------->
                    <div class="col-md-2 lert alert-success "style="font-weight:bold;padding: 5px">Họ tên</div>
                    <div class="col-md-10 lert alert-success"style="font-weight: initial;padding: 5px">
                        Họ tên
                    </div>

                    <!---------------------------------------------------->
                    <div class="col-md-2 alert-warning " style="font-weight:bold;padding: 5px">Đơn vị</div>
                    <div class="col-md-10 alert-warning"style="font-weight: initial;padding: 5px" >
                        Khoa cơ bản
                    </div>
                    <!---------------------------------------------------->
                    <div class="col-md-2 alert-success " style="font-weight:bold;padding: 5px">Ngày sinh</div>
                    <div class="col-md-10 alert-success "style="font-weight: initial;padding: 5px">
                        15/06/1990
                    </div>
                    <!---------------------------------------------------->
                    <div class="col-md-2 alert-warning " style="font-weight:bold;padding: 5px">Địa chỉ</div>
                    <div class="col-md-10 alert-warning " style="font-weight: initial;padding: 5px">
                        45 Dũng Sĩ Thanh Khê- Đà Nẵng
                    </div>
                    <!---------------------------------------------------->
                    <div class="col-md-2 alert-success " style="font-weight:bold;padding: 5px">Nội dung</div>
                    <div class="col-md-10 alert-success "style="font-weight: initial;padding: 5px">
                        Nội con mẹ nó dung
                    </div>
                    <!---------------------------------------------------->
                </div>

            </div>

        </div>
        <script src="../js/bootstrap.js" type="text/javascript"></script>
        <script src="../js/bootstrap.min.js" type="text/javascript"></script>
    </body>
</html>
