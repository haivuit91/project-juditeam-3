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
                    <a href="http://localhost:8080/project3/Page?p=seacher-nc"class="label label-default">Tìm kiếm nâng cao</a>

                </div>

                <div class="panel-body">
                    <form class="form-horizontal">
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
                    <c:forEach items="${gvhs}">
                        
                    </c:forEach>
                </div>

            </div>
        </div>
        <script src="../js/bootstrap.js" type="text/javascript"></script>
        <script src="../js/bootstrap.min.js" type="text/javascript"></script>
    </body>
</html>
