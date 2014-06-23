<%-- 
    Document   : ct-ds-tulieu
    Created on : Jun 20, 2014, 4:32:28 PM
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
                <p class="alert alert-warning" style="text-align: center;text-transform: uppercase;font-weight: bold">chi tiết tư liệu</p>
            </div>
            <div class="panel panel-body ">
                <div class="form-group">  
                    <div class="col-md-2 alert-info">
                        Tên tư liệu: 
                    </div>
                    <div class="col-md-10 alert-info">
                        ${tl.getTenTL()}
                    </div>
                </div>

                <div class="form-group">  
                    <div class="col-md-2 alert-warning">
                        Loại: 
                    </div>
                    <div class="col-md-10 alert-warning">
                        ${tl.getLoaiTL()}
                    </div>
                </div>
                <div class="form-group">  
                    <div class="col-md-2 alert-info">
                        Nguồn
                    </div>
                    <div class="col-md-10 alert-info">
                        ${tl.getNguonTL()}
                    </div>
                </div>
                <div class="form-group">  
                    <div class="col-md-2 alert-warning">
                        Năm
                    </div>
                    <div class="col-md-10 alert-warning">
                        ${tl.getNam()}
                    </div>
                </div>

                <div class="form-group">  
                    <div class="col-md-12 alert-info">
                        Nội Dung
                    </div>
                    <div class="col-md-12 alert-success">
                        ${tl.getNoidung()}
                    </div>
                </div>
                <div class="form-group">  
                    <div class="col-md-3 alert-info">
                        Tệp đính kèm: 
                    </div>
                    <div class="col-md-9 alert-info">
                        <a href="/HeThongTTQL/files/${tl.getTlThamkhao()}">${tl.getTlThamkhao()}</a>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
