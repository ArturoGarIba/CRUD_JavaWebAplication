package org.apache.jsp.Productos;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class nuevo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Almacen</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2 style=\"text-align: center\">Nuevo Registro</h2>\n");
      out.write("\n");
      out.write("        <br></br>\n");
      out.write("\n");
      out.write("        <form action=\"\" method=\"\" autocomplete=\"off\">\n");
      out.write("            <p>Código</p>\n");
      out.write("            <input id=\"codigo\" name=\"codigo\" type=\"text\">\n");
      out.write("            <p>Nombre</p>\n");
      out.write("            <input id=\"nombre\" name=\"nombre\" type=\"text\">\n");
      out.write("            <p>Precio</p>\n");
      out.write("            <input id=\"precio\" name=\"precio\" type=\"number\">\n");
      out.write("            <p>Existencia</p>\n");
      out.write("            <input id=\"existencia\" name=\"existencia\" type=\"number\">\n");
      out.write("            \n");
      out.write("            <input id=\"guardar\" type=\"submit\" value=\"Guardar\" name=\"guardar\" />\n");
      out.write("        </form>\n");
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
