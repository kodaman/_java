package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class compute_005fspeed_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"/WEB-INF/error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<link href=\"http://twitter.github.com/bootstrap/assets/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("<title>HIZ HESAPLAMA</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color:#ff9966\">\r\n");
      out.write("\r\n");
 
	Float furlongs = Float.parseFloat(request.getParameter("furlongs"));
	Float fortnights =Float.parseFloat(request.getParameter("fortnights"));
	Float speed = furlongs/fortnights;

      out.write("\r\n");
      out.write("<div style = \"margin-left:-1in;margin-top: 1in\">\r\n");
      out.write("\t<table border=1 align=\"center\" class=\"table table-bordered\" >\r\n");
      out.write("\t\t<tr  style = \"background-color: #ffff66\">\r\n");
      out.write("\t\t\t<th>Parameter Name</th><th>Parameter Value(s)</th>\r\n");
      out.write("\t\t\t<tr ><th>DİSTANCE : <td></b>");
      out.print( furlongs );
      out.write(" furlongs\r\n");
      out.write("\t\t\t<tr ><th> TİME : <td>");
      out.print( fortnights );
      out.write(" fortnights\r\n");
      out.write("\t\t\t<tr ><th> SPEED : <td>");
      out.print( speed );
      out.write(" speed\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
