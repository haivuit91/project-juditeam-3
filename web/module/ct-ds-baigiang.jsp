<%-- 
    Document   : ct-ds-baigiang
    Created on : Jun 20, 2014, 11:54:35 AM
    Author     : Welcomes
--%>

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
                <p class="alert alert-warning" style="text-align: center;text-transform: uppercase;font-weight: bold">Chi tiết bài giảng</p>
            </div>
            <div class="panel panel-body ">
                <div class="form-group">  
                    <div class="col-md-3 alert-info">
                        Tên Bài Giảng: 
                    </div>
                    <div class="col-md-9 alert-info">
                        ${bg.getTenBG()}
                    </div>
                </div>

                <div class="form-group">  
                    <div class="col-md-3 alert-warning">
                        Năm: 
                    </div>
                    <div class="col-md-9 alert-warning">
                        ${bg.getNam()}
                    </div>
                </div>
                <div class="form-group">  
                    <div class="col-md-3 alert-info">
                        Tên Giảng Viên: 
                    </div>
                    <div class="col-md-9 alert-info">
                        ${bg.getGiangVienHocSinh().getTenGVHS()}
                    </div>
                </div>
                <div class="form-group">  
                    <div class="col-md-12 alert-warning">
                        Nội Dung: 
                    </div>
                    <div class="col-md-12 alert-success">
                        ${bg.getNoidung()}
                    </div>
                </div>
                <div class="form-group">  
                    <div class="col-md-3 alert-info">
                        Tệp đính kèm: 
                    </div>
                    <div class="col-md-9 alert-info">
                        <a href="/HeThongTTQL/files/${bg.getTlThamkhao()}">${bg.getTlThamkhao()}</a>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
