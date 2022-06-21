package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("    <meta charset=\"UTF-8\">\n");
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
      out.write("                    <li><a href=\"#\">Trang chủ</a></li>\n");
      out.write("                    <li><a href=\"#\">Danh mục</a></li>\n");
      out.write("                    <li><a href=\"#\">Hàng hóa</a></li>\n");
      out.write("                    <li><a href=\"#\">Khách hàng</a></li>\n");
      out.write("                    <li><a href=\"#\">Bình luận</a></li>\n");
      out.write("                    <li><a href=\"#\">Thống kê</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("            <div class=\"tentrang_header\">\n");
      out.write("                 Hàng hóa -Sửa thông tin sản phẩm\n");
      out.write("            </div>\n");
      out.write("            ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            <div class=\"formthem\">\n");
      out.write("                <form action=\"update\" method=\"post\">\n");
      out.write("                    <div class=\"demuc\">\n");
      out.write("                        Tên sản phẩm <br>                 \n");
      out.write("                    <input class=\"nhap\" type=\"text\" name=\"tenSP\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.tenSP}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"demuc\">\n");
      out.write("                        Mã sản phẩm <br>\n");
      out.write("                        <input class=\"nhap\" type=\"text\" name=\"idSanPham\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.idSanPham}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"demuc\">\n");
      out.write("                        Hãng điện thoại <br>\n");
      out.write("                        <input class=\"nhap\" type=\"text\" name=\"hang\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.hang}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"demuc\">\n");
      out.write("                        pin <br>\n");
      out.write("                        <input class=\"nhap\" type=\"text\" name=\"pin\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.pin}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"demuc\">\n");
      out.write("                        Ram <br>\n");
      out.write("                        <input class=\"nhap\" type=\"text\" name=\"ram\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.ram}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"demuc\">\n");
      out.write("                        Rom <br>\n");
      out.write("                        <input class=\"nhap\" type=\"text\" name=\"rom\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.rom}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"demuc\">\n");
      out.write("                        Cpu <br>\n");
      out.write("                        <input class=\"nhap\" type=\"text\" name=\"cpu\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.CPU}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"demuc\">\n");
      out.write("                        Kích thước màn hình <br>\n");
      out.write("                        <input class=\"nhap\" type=\"text\" name=\"KTmanhinh\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.KTmanhinh}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"demuc\">\n");
      out.write("                        Camera trước <br>\n");
      out.write("                        <input class=\"nhap\" type=\"text\" name=\"cameraTruoc\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.cameraTruoc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"demuc\">\n");
      out.write("                        Camera sau <br>\n");
      out.write("                        <input class=\"nhap\" type=\"text\" name=\"cameraSau\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.cameraSau}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"demuc\">\n");
      out.write("                        Giá <br>\n");
      out.write("                        <input class=\"nhap\" type=\"text\" name=\"gia\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.gia}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"demuc\">\n");
      out.write("                        link ảnh <br>\n");
      out.write("                        <input class=\"nhap\" type=\"url\" name=\"linkAnh\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.linkAnh}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        mô tả hình ảnh<br>\n");
      out.write("                        <input class=\"nhap\" type=\"text\" name=\"moTa\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.moTa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <input class=\"submit\" type=\"submit\"  value=\"Xác nhận\">\n");
      out.write("                        <a href=\"list\"><input class=\"submit\" type=\"button\" value=\"quay lại\"></a>\n");
      out.write("                    </div>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("c");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.category}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }
}
