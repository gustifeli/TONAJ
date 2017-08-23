package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Contactos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<section>\r\n");
      out.write("    @if (ViewBag.Message == \"sent\")\r\n");
      out.write("    {\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            window.onload = function () {\r\n");
      out.write("                alert(\"El mensaje se envio con exito\");\r\n");
      out.write("            };\r\n");
      out.write("        </script>\r\n");
      out.write("    }\r\n");
      out.write("    <h1 id=\"contacto\">Contacto</h1>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <form method=\"post\" action=\"@Url.Action(\"Contact\",\"Home\")\">\r\n");
      out.write("            <div class=\"col-xs-9 col-sm-4\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <br />\r\n");
      out.write("                    <label>\r\n");
      out.write("                        <span class=\"txt-label\">* Nombre: <input type=\"text\" name=\"nombre\" id=\"nombre\" class=\"form-control\" autofocus /></span>\r\n");
      out.write("                    </label><br /><label>\r\n");
      out.write("                        <span class=\"tex-label\">* Apellido: <input type=\"text\" name=\"apellido\" id=\"apellido\" class=\"form-control\" /></span>\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <br />\r\n");
      out.write("                    <label>\r\n");
      out.write("                        <span class=\"tex-label\">\r\n");
      out.write("                            * E-mail:\r\n");
      out.write("                            <input type=\"text\" name=\"email\" id=\"email\" class=\"form-control\" />\r\n");
      out.write("                        </span>\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <br />\r\n");
      out.write("                    <label>\r\n");
      out.write("                        * Telefono:\r\n");
      out.write("                        <input type=\"text\" name=\"telefono\" id=\"telefono\" class=\"form-control\" />\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <br />\r\n");
      out.write("                    <label>\r\n");
      out.write("                        * Localidad:\r\n");
      out.write("                        <input type=\"text\" name=\"localidad\" id=\"localidad\" class=\"form-control\" />\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <br />\r\n");
      out.write("                    <p>* Datos obligatorios</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-sm-3 col-md-4\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <br />\r\n");
      out.write("                    <label>\r\n");
      out.write("                        <span class=\"form-group\">\r\n");
      out.write("                            Mensaje:\r\n");
      out.write("                            <textarea class=\"form-control\" name=\"comentario\" rows=\"7\" cols=\"40\" id=\"comentario\"></textarea>\r\n");
      out.write("                        </span>\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <div id=\"clear\">\r\n");
      out.write("                        <input name=\"sumbit\" type=\"submit\" onclick=\"send()\" class=\"button boton\" id=\"sumbit_contacto\" value=\"ENVIAR\" />\r\n");
      out.write("                        <p class=\"ocultar\">\r\n");
      out.write("                            Para comunicarte, @*completá*@ el formulario, o envianos un mail a la siguiente dirección:\r\n");
      out.write("                            <a href=\"mailto:tonaoficial@hotmail.com\" class=\"linea\">tonaoficial@hotmail.com</a>\r\n");
      out.write("                        </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
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
