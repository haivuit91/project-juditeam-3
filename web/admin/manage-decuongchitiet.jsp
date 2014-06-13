<%-- 
    Document   : manage-decuongchitiet
    Created on : Jun 12, 2014, 4:57:33 PM
    Author     : Welcomes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="alert alert-danger" style="text-align: center"><b>QUẢN LÝ ĐỀ CƯƠNG CHI TIẾT </b></div>
        <div class="panel panel-default">
            <!-- Default panel contents -->
            <div class="panel-heading">
                <a href="/project3/dcctmamage?page=add" class="btn btn-primary btn-sm" >
                    Tạo mới đề cương chi tiết
                </a>               
                <div class="row">
                    <div class="col-lg-5 col-lg-push-6">
                        <form action="/project3/dcctmamage?page=search" method="post">
                            <div class="col-md-11">

                                <div class="input-group">

                                    <div class="input-group-btn">
                                        <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                                            <span class="glyphicon glyphicon-search"></span>
                                            <span class="caret"></span></button>

                                    </div><!-- /btn-group -->

                                    <input type="text" name="tenDC" class="form-control" placeholder="Nhập tên tài khoản muốn tìm...">

                                </div><!-- /input-group -->
                            </div><!-- /input-group -->
                            <div class="col-md-1">
                                <input type="submit" name="submit" value="Tìm kiếm" class="btn btn-default dropdown-toggle" style="background:#3e8f3e;color:#ffffff">
                            </div>
                        </form>
                    </div><!-- /.col-lg-6 -->
                </div><!-- /.row -->
            </div>

            <div class="panel panel-default">
                <div class="col-md-1" style="background: #428bca;padding:5px;font-weight:bold;font-size: 12px;text-transform: uppercase;color:#ffffff">Mã</div>
                <div class="col-md-1" style="background: #428bca;padding:5px;font-weight:bold;font-size: 12px;text-transform: uppercase;color:#ffffff">Tên ĐC</div>
                <div class="col-md-1" style="background: #428bca;padding:5px;font-weight:bold;font-size: 12px;text-transform: uppercase;color:#ffffff">DV Học Trinh</div>
                <div class="col-md-1" style="background: #428bca;padding:5px;font-weight:bold;font-size: 12px;text-transform: uppercase;color:#ffffff">Thời gian</div>
                <div class="col-md-1" style="background: #428bca;padding:5px;font-weight:bold;font-size: 12px;text-transform: uppercase;color:#ffffff">Điều kiện</div>
                <div class="col-md-1" style="background: #428bca;padding:5px;font-weight:bold;font-size: 12px;text-transform: uppercase;color:#ffffff">Mục tiêu</div>
                <div class="col-md-1" style="background: #428bca;padding:5px;font-weight:bold;font-size: 12px;text-transform: uppercase;color:#ffffff">Nôi dung</div>
                <div class="col-md-1" style="background: #428bca;padding:5px;font-weight:bold;font-size: 12px;text-transform: uppercase;color:#ffffff">Tiêu chuẩn</div>
                <div class="col-md-1" style="background: #428bca;padding:5px;font-weight:bold;font-size: 12px;text-transform: uppercase;color:#ffffff">Năm</div>
                <div class="col-md-1" style="background: #428bca;padding:5px;font-weight:bold;font-size: 12px;text-transform: uppercase;color:#ffffff">Tên GViên HSinh</div>
                <div class="col-md-1" style="background: #428bca;padding:5px;font-weight:bold;font-size: 12px;text-transform: uppercase;color:#ffffff">Trạng thái</div>
                <div class="col-md-1" style="background: #428bca;padding:5px;font-weight:bold;font-size: 12px;text-transform: uppercase;color:#ffffff">Lựa chọn</div>
            </div>
            <div class="panel panel-title">
                <div class="col-md-1" style="text-transform: inherit;padding:5px">${dcctList.getMaDC()}</div>
                <div class="col-md-1" style="text-transform: inherit;padding:5px">${dcctList.getTenDC()}</div>
                <div class="col-md-1" style="text-transform: inherit;padding:5px">${dcctList.getDvhoctrinh()}</div>
                <div class="col-md-1" style="text-transform: inherit;padding:5px">${dcctList.getThoigian()}</div>
                <div class="col-md-1" style="text-transform: inherit;padding:5px">${dcctList.getDieukien()}</div>
                <div class="col-md-1" style="text-transform: inherit;padding:5px">${dcctList.getMuctieu()}</div>
                <div class="col-md-1" style="text-transform: inherit;padding:5px">${dcctList.getNoidung()}</div>
                <div class="col-md-1" style="text-transform: inherit;padding:5px">${dcctList.getTieuchuan()}</div>
                <div class="col-md-1" style="text-transform: inherit;padding:5px">${dcctList.getNam()}</div>
                <div class="col-md-1" style="text-transform: inherit;padding:5px">${dcctList.getGiangVienHocSinh().getTenGVHS()}</div>
                <div class="col-md-1" style="text-transform: inherit;padding:5px">${dcctList.isTrangthai()}</div>
                <div class="col-md-1" style="text-transform: inherit;padding:5px">
                    <div class="col-md-6">
                        <a href="/project3/dcctmamage?page=edit&maDC=${dcctList.getMaDC()}" class="btn btn-primary btn-sm" >
                            <span class="glyphicon glyphicon-wrench"></span>
                        </a>
                    </div>
                    <div class="col-md-6">
                        <a href="/project3/dcctmamage?page=delete&maDC=${dcctList.getMaDC()}" onclick="return confirm('Bạn thực sự muốn xóa: ${dcctList.getTenDC()}?')" class="btn btn-primary btn-sm" role="button"><span class="glyphicon glyphicon-trash"></span></a>
                    </div>
                </div>
            </div>                               
        </div>
    </body>
</html>
