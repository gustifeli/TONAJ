package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_t_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_t_if_test.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      //  t:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_t_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_t_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_t_if_0.setPageContext(_jspx_page_context);
      _jspx_th_t_if_0.setParent(null);
      _jspx_th_t_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope['sessionUser']!= null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_t_if_0 = _jspx_th_t_if_0.doStartTag();
      if (_jspx_eval_t_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    ");
 response.sendRedirect("Login.jsp");
          out.write('\r');
          out.write('\n');
          int evalDoAfterBody = _jspx_th_t_if_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_t_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_t_if_test.reuse(_jspx_th_t_if_0);
        return;
      }
      _jspx_tagPool_t_if_test.reuse(_jspx_th_t_if_0);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Registro</title>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <link type=\"text/css\" href=\"~/Content/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link type=\"text/css\" href=\"~/Content/stylereg.css\" rel=\"stylesheet\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h4>Cree una cuenta nueva.</h4>\r\n");
      out.write("        <hr/>\r\n");
      out.write("        <div class=\"contenido\">\r\n");
      out.write("            <p style=\"color: #d43f3a\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope['error']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("            <form action=\"Register\" method=\"post\">\r\n");
<<<<<<< HEAD
      out.write("                <div class=\"form-group \">\r\n");
=======
      out.write("                <div class=\"form-group\">\r\n");
>>>>>>> master
      out.write("                    <label>Usuario</label>\r\n");
      out.write("                    <div class=\"col-lg-offset-3 col-lg-6\">\r\n");
      out.write("                        <input type=\"text\"  name=\"name\" placeholder=\"Ingrese su usuario\" class=\"form-control\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
<<<<<<< HEAD
      out.write("\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    </br><label>Contraseña</label>\r\n");
      out.write("                    <div class=\"col-lg-offset-3 col-lg-6\">\r\n");
      out.write("                        <input type=\"text\" name=\"pass\" placeholder=\"Ingrese su Contraseña\" class=\"form-control\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    </br><label>Confirmar contraseña</label>\r\n");
      out.write("                    <div class=\"col-lg-offset-3 col-lg-6\">\r\n");
      out.write("                        <input type=\"text\" name=\"pass2\" placeholder=\"Confirme su Contraseña\" class=\"form-control\">\r\n");
      out.write("                        </br>\r\n");
      out.write("\r\n");
=======
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label>Contraseña</label>\r\n");
      out.write("                    <div class=\"col-xs-10 col-md-5\">\r\n");
      out.write("                        <input type=\"text\" name=\"pass\" placeholder=\"Ingrese su Contraseña\" class=\"form-control\"\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label>Confirmar contraseña</label>\r\n");
      out.write("                    <div class=\"col-xs-10 col-md-5\">\r\n");
      out.write("                        <input type=\"text\" name=\"Confpass\" placeholder=\"Confirme su Contraseña\" class=\"form-control\"\r\n");
>>>>>>> master
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"col-lg-offset-3 col-lg-6 text-center\">\r\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-default\" value=\"Registrarse\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                </br>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"col-lg-offset-3 col-lg-6 text-center\">\r\n");
      out.write("                        <p class=\"btn btn-default\"><a href=\"Login.jsp\"> Iniciar Sesion</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
<<<<<<< HEAD
      out.write("\r\n");
=======
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <p><a href=\"Login.jsp\"> Iniciar Session</p>\r\n");
      out.write("            </div>\r\n");
>>>>>>> master
      out.write("        </div>\r\n");
      out.write("        }\r\n");
      out.write("        @section Scripts {\r\n");
      out.write("        @Scripts.Render(\"~/bundles/jqueryval\")\r\n");
      out.write("        }\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
