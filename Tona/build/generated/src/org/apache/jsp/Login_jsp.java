package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Login</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <link type=\"text/css\" href=\"Content/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link type=\"text/css\" href=\"Content/styleLogReg.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"table\">\r\n");
      out.write("            <div id=\"\">\r\n");
      out.write("                <div id=\"\">\r\n");
      out.write("                    <img src=\"Image/TONAlogin.png\" >\r\n");
      out.write("                    <form action=\"\" method=\"post\">\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label>Usuario </label>\r\n");
      out.write("                            <div class=\"col-lg-12\">\r\n");
      out.write("                                <input type=\"text\"  name=\"username\" placeholder=\"Ingrese su usuario\" class=\"form-control\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label>Contraseña </label>\r\n");
      out.write("                            <div class=\"col-md-12\">\r\n");
      out.write("                                <input type=\"text\" name=\"pass\" placeholder=\"Ingrese su Contraseña\" class=\"form-control\"\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!--                        <div class=\"form-group\">\r\n");
      out.write("                                                    <div class=\"col-md-offset-2 col-md-10\">\r\n");
      out.write("                                                        <div class=\"checkbox\">\r\n");
      out.write("                                                            @Html.CheckBoxFor(m => m.RememberMe)\r\n");
      out.write("                                                            @Html.LabelFor(m => m.RememberMe)\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>-->\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <div class=\"col-md-offset-1 col-md-10 text-center\">\r\n");
      out.write("                                <input type=\"submit\" value=\"Iniciar sesión\" class=\"btn btn-danger\" />\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    <!--<p>\r\n");
      out.write("                            @Html.ActionLink(\"Registrar como nuevo usuario\", \"Register\")\r\n");
      out.write("                        </p>\r\n");
      out.write("                     Habilite esta opción después de habilitar la confirmación de la cuenta para la función de restablecimiento de contraseña\r\n");
      out.write("                        <p>\r\n");
      out.write("                            @Html.ActionLink(\"¿Ha olvidado su contraseña?\", \"ForgotPassword\")\r\n");
      out.write("                        </p>-->\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--<div class=\"col-md-4\">\r\n");
      out.write("                    <section id=\"socialLoginForm\">\r\n");
      out.write("                        @Html.Partial(\"_ExternalLoginsListPartial\", new ExternalLoginListViewModel { ReturnUrl = ViewBag.ReturnUrl })\r\n");
      out.write("                    </section>\r\n");
      out.write("                </div>-->\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
