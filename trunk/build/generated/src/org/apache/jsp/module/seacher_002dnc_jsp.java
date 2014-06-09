package org.apache.jsp.module;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class seacher_002dnc_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/module/seach-nc.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"../css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"col-md-10\">\n");
      out.write("            <div class=\"panel panel-primary\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                    TRA CỨU THÔNG TIN\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3 col-sm-offset-9\">\n");
      out.write("                    <p class=\"label label-primary\">Tìm kiếm cơ bản</p>\n");
      out.write("                    <a href=\"#\"class=\"label label-danger\">Tìm kiếm nâng cao</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <form class=\"form-horizontal\">\n");
      out.write("                        <fieldset>\n");
      out.write("                            <legend>Tìm kiếm nâng cao</legend>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"select\" class=\"col-lg-2 control-label\">Tên thông tin</label>\n");
      out.write("                                <div class=\"col-lg-5\">\n");
      out.write("                                    <select class=\"form-control\" id=\"select\">\n");
      out.write("                                        <option>1</option>\n");
      out.write("                                        <option>2</option>\n");
      out.write("                                        <option>3</option>\n");
      out.write("                                        <option>4</option>\n");
      out.write("                                        <option>5</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"select\" class=\"col-lg-2 control-label\">Loại thông tin</label>\n");
      out.write("                                <div class=\"col-lg-5\">\n");
      out.write("                                    <select class=\"form-control\" id=\"select\">\n");
      out.write("                                        <option>1</option>\n");
      out.write("                                        <option>2</option>\n");
      out.write("                                        <option>3</option>\n");
      out.write("                                        <option>4</option>\n");
      out.write("                                        <option>5</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"select\" class=\"col-lg-2 control-label\">Số trang</label>\n");
      out.write("                                <div class=\"col-lg-5\">\n");
      out.write("                                    <select class=\"form-control\" id=\"select\">\n");
      out.write("                                        <option>1</option>\n");
      out.write("                                        <option>2</option>\n");
      out.write("                                        <option>3</option>\n");
      out.write("                                        <option>4</option>\n");
      out.write("                                        <option>5</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"select\" class=\"col-lg-2 control-label\">Tên thông tin</label>\n");
      out.write("                                <div class=\"col-lg-5\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"inputEmail\" placeholder=\"\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"select\" class=\"col-lg-2 control-label\">Người thực hiện</label>\n");
      out.write("                                <div class=\"col-lg-5\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"inputEmail\" placeholder=\"\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"select\" class=\"col-lg-2 control-label\">Ngày tháng năm</label>\n");
      out.write("                                <div class=\"col-lg-5\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"inputEmail\" placeholder=\"\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"col-lg-10 col-lg-offset-2\">\n");
      out.write("                                    <button class=\"btn btn-default\" type=\"reset\">Nhập lại</button>\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-primary\">Tìm kiếm</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </fieldset>\n");
      out.write("                    </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    Ket qua tim kiem\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"../js/bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"../js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
