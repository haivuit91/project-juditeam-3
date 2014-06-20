<%-- 
    Document   : ct-ds-dccthp
    Created on : Jun 20, 2014, 4:21:08 PM
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
                <p class="alert alert-info" style="text-align: center;text-transform: uppercase;font-weight: bold">ĐỀ CƯƠNG CHI TIẾT HỌC PHẦN</p>
            </div>
            <div class="panel panel-body ">
                <div class="form-group">  
                    <div class="col-md-2 alert-info">
                        Tên ĐC chi tiết: 
                    </div>
                    <div class="col-md-10 alert-info">
                        ${dc.getTenDC()}
                    </div>
                </div>
                <div class="form-group">  
                    <div class="col-md-2 alert-warning">
                        Người thực hiện: 
                    </div>
                    <div class="col-md-10 alert-warning">
                        ${dc.getGiangVienHocSinh().getTenGVHS()}
                    </div>
                </div>
                <div class="form-group">  
                    <div class="col-md-2 alert-info">
                        Năm: 
                    </div>
                    <div class="col-md-10 alert-info">
                        ${dc.getNam()}
                    </div>
                </div>
                <div class="form-group">  
                    <div class="col-md-2 alert-warning">
                        Đơn vị học trình: 
                    </div>
                    <div class="col-md-10 alert-warning">
                        ${dc.getDvhoctrinh()}
                    </div>
                </div>
                <div class="form-group">  
                    <div class="col-md-12 alert-info">
                        Nội Dung: 
                    </div>
                    <div class="col-md-12 alert-success">
                        ${dc.getNoidung()}
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
