<%-- 
    Document   : content-left
    Created on : Jun 6, 2014, 10:28:26 AM
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
        <div class="col-lg-2 col-md-2 col-sm-2">

            <div class="panel panel-primary">
                <div class="panel panel-heading">Danh Mục</div>
                <ul class="list-group"style="background:#4986bd">
                    <li class="list-group-item">
                        <span class="glyphicon glyphicon-bookmark"></span>
                        <a href="#"> Đề cương CTHP</a>
                    </li>
                    <li class="list-group-item">
                        <span class="glyphicon glyphicon-bookmark"></span>
                        <a href="#">Bài giảng</a>
                    </li>
                    <li class="list-group-item">
                        <span class="glyphicon glyphicon-bookmark"></span>
                        <a href="#">Slide giảng dạy</a>
                    </li>
                    <li class="list-group-item">
                        <span class="glyphicon glyphicon-bookmark"></span>
                        <a href="#">Tư liệu</a>
                    </li>
                    <li class="list-group-item">
                        <span class="glyphicon glyphicon-bookmark"></span>
                        <a href="#">Thông tin giảng viên</a>
                    </li>
                    <li class="list-group-item">
                        <span class="glyphicon glyphicon-bookmark"></span>
                        <a href="#"> Thông tin học sinh</a>
                    </li>
                </ul>
            </div>


            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title">Liên kết Website</h3>
                </div>
                <div class="panel-body">

                    <select id="Select1"onchange="window.open(this.options[this.selectedIndex].value, '_blank');
                            this.options[0].selected = true"  class="alert-link" name="select" >
                        <option selected="selected">Liên kết Web</option>
                        <option value="about:Tabs">--------------------------</option> 
                        <option value="http://ngoisao.net">Ngoi Sao</option>
                        <option value="http://vnexpress.net">Vnexpress</option>
                        <option value="http://vietnamnet.vn">Vietnamnet</option>
                        <option value="http://www.thanhnien.com.vn">Thanh niên</option>
                        <option value="http://www.hanoimoi.com.vn">HN mới</option>
                        <option value="http://www.nhandan.com.vn">Nhân dân</option>
                        <option value="http://www.tuoitre.vn/">Tuổi trẻ</option>
                        <option value="http://www.tienphong.vn">Tiền phong</option>
                        <option value="http://www.dantri.com.vn">Dân trí;</option>
                    </select>
                </div>
            </div>

            <div class="panel panel-primary">
                <div class="panel panel-heading">Hổ trợ Online</div>
                <div class="panel panel-body">
                    <script src="../js/skypeCheck.js" type="text/javascript"></script>
                     <font color="#027dd1" ><b>Skype<br></b></font>
                    <a href="skype:ngocduycit?call"><img src="http://mystatus.skype.com/balloon/ngocduycit" style="border: none;" width="160" height="35" alt="My status" /></a><br>


                    <div align="left"> 
                        <font color="#027dd1" ><b>Hổ trợ 1<br></b></font>
                        <a href="ymsgr:sendim?ID_YAHOO">
                            <img border="0" src="http://opi.yahoo.com/online?u=ID_YAHOO&m=g&t=2"><br></a>
                        <font color="#027dd1" ><b>Hổ trợ 2<br></b></font>
                        <a href="ymsgr:sendim?ID_YAHOO">
                            <img border="0" src="http://opi.yahoo.com/online?u=ID_YAHOO&m=g&t=2"></a>
                        <br>
                    </div>


                </div>

            </div>


        </div>
    </body>
</html>
