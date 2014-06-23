<%-- 
    Document   : ct-ds-slide
    Created on : Jun 20, 2014, 4:29:47 PM
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
                <p class="alert alert-info" style="text-align: center;text-transform: uppercase;font-weight: bold">Chi tiết Slide</p>
            </div>
            <div class="panel panel-body ">
                <div class="form-group">  
                    <div class="col-md-2 alert-info">
                        Tên slide: 
                    </div>
                    <div class="col-md-10 alert-info">
                        ${sl.getTenSilde()}
                    </div>
                </div>

                <div class="form-group">  
                    <div class="col-md-2 alert-warning">
                        Người thực hiện:  
                    </div>
                    <div class="col-md-10 alert-warning">
                        ${sl.getGiangVienHocSinh().getTenGVHS()}
                    </div>
                </div>
                <div class="form-group">  
                    <div class="col-md-2 alert-info">
                        Tư liệu
                    </div>
                    <div class="col-md-10 alert-info">
                        ${sl.getTuLieu().getTenTL()}
                    </div>
                </div>
                <div class="form-group">  
                    <div class="col-md-2 alert-warning">
                        Năm: 
                    </div>
                    <div class="col-md-10 alert-warning">
                        ${sl.getNam()}
                    </div>
                </div>
                <div class="form-group">  
                    <div class="col-md-12 alert-warning">
                        Nội Dung: 
                    </div>
                    <div class="col-md-12 alert-success">
                        ${sl.getNoidung()}
                    </div>
                </div>
                <div class="form-group">  
                    <div class="col-md-2 alert-info">
                        Tệp đính kèm: 
                    </div>
                    <div class="col-md-10 alert-info">
                        <a href="/HeThongTTQL/files/${sl.getTlThamkhao()}">${sl.getTlThamkhao()}</a>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
