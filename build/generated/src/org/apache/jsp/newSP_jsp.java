package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newSP_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<head>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/sanphamAdmin.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <div class=\"thanhdautien\">\n");
      out.write("            <div class=\"tieude\">\n");
      out.write("                <h1>admin</h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"menu\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"#\">Trang ch???</a></li>\n");
      out.write("                    <li><a href=\"#\">Danh m???c</a></li>\n");
      out.write("                    <li><a href=\"#\">H??ng h??a</a></li>\n");
      out.write("                    <li><a href=\"#\">Kh??ch h??ng</a></li>\n");
      out.write("                    <li><a href=\"#\">B??nh lu???n</a></li>\n");
      out.write("                    <li><a href=\"#\">Th???ng k??</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("            <div class=\"tentrang_header\">\n");
      out.write("                 H??ng h??a -Th??m m???i\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"formthem\">\n");
      out.write("                <form action =\"newSP\" method=\"get\">\n");
      out.write("                    <div class=\"demuc\">\n");
      out.write("                        T??n s???n ph???m <br>                 \n");
      out.write("                    <input class=\"nhap\" type=\"text\" name=\"tenSP\" >\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"demuc\">\n");
      out.write("                        M?? s???n ph???m <br>\n");
      out.write("                        <input class=\"nhap\" type=\"text\" name=\"id\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"demuc\">\n");
      out.write("                        H??ng ??i???n tho???i <br>\n");
      out.write("                        <input class=\"nhap\" type=\"text\" name=\"hang\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"demuc\">\n");
      out.write("                        pin <br>\n");
      out.write("                        <input class=\"nhap\" type=\"text\" name=\"pin\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"demuc\">\n");
      out.write("                        Ram <br>\n");
      out.write("                        <input class=\"nhap\" type=\"text\" name=\"ram\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"demuc\">\n");
      out.write("                        Rom <br>\n");
      out.write("                        <input class=\"nhap\" type=\"text\" name=\"rom\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"demuc\">\n");
      out.write("                        Cpu <br>\n");
      out.write("                        <input class=\"nhap\" type=\"text\" name=\"cpu\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"demuc\">\n");
      out.write("                        K??ch th?????c m??n h??nh <br>\n");
      out.write("                        <input class=\"nhap\" type=\"text\" name=\"KTmanhinh\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"demuc\">\n");
      out.write("                        Camera tr?????c <br>\n");
      out.write("                        <input class=\"nhap\" type=\"text\" name=\"cameraTruoc\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"demuc\">\n");
      out.write("                        Camera sau <br>\n");
      out.write("                        <input class=\"nhap\" type=\"text\" name=\"cameraSau\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"demuc\">\n");
      out.write("                        Gi?? <br>\n");
      out.write("                        <input class=\"nhap\" type=\"text\" name=\"gia\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"demuc\">\n");
      out.write("                        link ???nh <br>\n");
      out.write("                        <input class=\"nhap\" type=\"url\" name=\"linkAnh\">\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        m?? t??? h??nh ???nh<br>\n");
      out.write("                        <input class=\"nhap\" type=\"text\" name=\"moTa\">\n");
      out.write("                    </div>\n");
      out.write("                    <h5> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h5>\n");
      out.write("                    <div>\n");
      out.write("                        <input class=\"submit\" type=\"submit\"  value=\"th??m m???i\">\n");
      out.write("                        <input class=\"submit\" type=\"reset\" value=\"nh???p l???i\">\n");
      out.write("                        <a href=\"list.jsp\"><input class=\"submit\" type=\"button\" value=\"danh s??ch\"></a>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("    \n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
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
