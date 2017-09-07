package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PRUEBA_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"cp_widget_a4f7e062-3e06-4194-a94a-13c3a6c7232c\">...</div><script type=\"text/javascript\">\n");
      out.write("var cpo = []; cpo[\"_object\"] =\"cp_widget_a4f7e062-3e06-4194-a94a-13c3a6c7232c\"; cpo[\"_fid\"] = \"AIAAEEufW0s2\";\n");
      out.write("var _cpmp = _cpmp || []; _cpmp.push(cpo);\n");
      out.write("(function() { var cp = document.createElement(\"script\"); cp.type = \"text/javascript\";\n");
      out.write("cp.async = true; cp.src = \"//www.cincopa.com/media-platform/runtime/libasync.js\";\n");
      out.write("var c = document.getElementsByTagName(\"script\")[0];\n");
      out.write("c.parentNode.insertBefore(cp, c); })(); </script><noscript><span>no name</span><span>cameramake</span><span> Canon</span><span>focallength</span><span> 18</span><span>height</span><span> 5472</span><span>fnumber</span><span> 5</span><span>exposuretime</span><span> 0.0125</span><span>orientation</span><span> 8</span><span>flash</span><span> 16</span><span>originaldate</span><span> 5/10/2017 3:23:00 PM</span><span>width</span><span> 3648</span><span>cameramodel</span><span> Canon EOS 70D</span><span>focallength</span><span> 50</span><span>flash</span><span> 16</span><span>cameramake</span><span> Canon</span><span>height</span><span> 4892</span><span>fnumber</span><span> 5.6</span><span>exposuretime</span><span> 0.004</span><span>camerasoftware</span><span> Picasa</span><span>originaldate</span><span> 5/10/2017 3:25:16 PM</span><span>width</span><span> 3262</span><span>cameramodel</span><span> Canon EOS 70D</span><span>cameramake</span><span> Canon</span><span>focallength</span><span> 24</span><span>height</span><span> 5472</span><span>fnumber</span><span> 5.6</span><span>exposuretime</span><span> 0.004</span><span>orientation</span><span> 8</span><span>flash</span><span> 16</span><span>originaldate</span><span> 5/10/2017 3:25:46 PM</span><span>width</span><span> 3648</span><span>cameramodel</span><span> Canon EOS 70D</span><span>cameramake</span><span> Canon</span><span>focallength</span><span> 22</span><span>height</span><span> 5472</span><span>fnumber</span><span> 5.6</span><span>exposuretime</span><span> 0.004</span><span>orientation</span><span> 8</span><span>flash</span><span> 16</span><span>originaldate</span><span> 5/10/2017 3:25:49 PM</span><span>width</span><span> 3648</span><span>cameramodel</span><span> Canon EOS 70D</span></noscript>\n");
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
