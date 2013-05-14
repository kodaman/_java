package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class BakedBeanDisplay_002drequest_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\n");
      out.write("<HTML>\n");
      out.write("<HEAD>\n");
      out.write("<TITLE>Baked Bean Values: request-based Sharing</TITLE>\n");
      out.write("<LINK REL=STYLESHEET HREF=\"JSP-Styles.css\" TYPE=\"text/css\">\n");
      out.write("</HEAD>\n");
      out.write("<BODY>\n");
      out.write("\t<H1>Baked Bean Values: request-based Sharing</H1>\n");
      out.write("\t");
      coreservlets.BakedBean requestBean = null;
      synchronized (request) {
        requestBean = (coreservlets.BakedBean) _jspx_page_context.getAttribute("requestBean", PageContext.REQUEST_SCOPE);
        if (requestBean == null){
          requestBean = new coreservlets.BakedBean();
          _jspx_page_context.setAttribute("requestBean", requestBean, PageContext.REQUEST_SCOPE);
        }
      }
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("requestBean"), request);
      out.write("\n");
      out.write("\t<H2>\n");
      out.write("\t\tBean level:\n");
      out.write("\t\t");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((coreservlets.BakedBean)_jspx_page_context.findAttribute("requestBean")).getLevel())));
      out.write("</H2>\n");
      out.write("\t<H2>\n");
      out.write("\t\tDish bean goes with:\n");
      out.write("\t\t");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((coreservlets.BakedBean)_jspx_page_context.findAttribute("requestBean")).getGoesWith())));
      out.write("</H2>\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "BakedBeanDisplay-snippet.jsp", out, false);
      out.write("\n");
      out.write("</BODY>\n");
      out.write("</HTML>\n");
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
