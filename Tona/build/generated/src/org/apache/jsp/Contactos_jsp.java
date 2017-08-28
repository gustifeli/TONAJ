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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\" http-equiv=\"Content-type\" content=\"text/html\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"Content/stylegeneral.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"Content/stylecontacto.css\">\r\n");
      out.write("        <link type=\"text/css\" href=\"Content/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\"/>\r\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"Image/imgsolapa.png\" />\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"Image/imgsolapa.png\" type=\"image/png\"/>\r\n");
      out.write("        <title>Contacto</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body background=\"Image/prueba.jpg\">\r\n");
      out.write("        <!--        <script type=\"text/javascript\">\r\n");
      out.write("                    window.onload = function () {\r\n");
      out.write("                        alert(\"El mensaje se envio con exito\");\r\n");
      out.write("                    };\r\n");
      out.write("                </script>-->\r\n");
      out.write("        <div id=\"nav\" class=\"navbar navbar-inverse\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <a id=\"btnMenu\" class=\"navbar-collapse pull-right\" data-toggle=\"collapse\" href=\"#collapse1\"><img src=\"Image/menu_Sandwich.png\"></a>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <!--                    @Html.ActionLink(\"TONA\", \"tona\", \"Home\", new { area = \"\" }, new { @id = \"TONA\", @class = \"navbar-brand\" })-->\r\n");
      out.write("                        <a href=\"Tona.jsp\" id=\"TONA\" class=\"navbar-brand\">TONA</a>\r\n");
      out.write("                        <a href=\"Login.jsp\"><img id=\"img\" src=\"Image/maniqui.png\"></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"navbar-collapse collapse\">\r\n");
      out.write("                    <div class=\"pull-right\">\r\n");
      out.write("                        <!--                        @*<a id=\"btnMenu\"  href=\"#collapse1\"><img src=\"Image/menu_Sandwich.png\"></a>*@-->\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"collapse1\" class=\"txtbtn panel-collapse collapse pull-right\">\r\n");
      out.write("                    <div id=\"aMenu\">\r\n");
      out.write("                        <a class=\"aTxtColor\" href=\"Galeria.jsp\">Galeria</a>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"aMenu\">\r\n");
      out.write("                        <a class=\"aTxtColor\" href=\"Contactos.jsp\">Contacto</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <h1 id=\"contacto\">Contacto</h1>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <form method=\"post\" action=\"@Url.Action(\"Contact\",\"Home\")\">\r\n");
      out.write("                  <div class=\"col-md-6\" id=\"tabla1\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <br />\r\n");
      out.write("                        <label>\r\n");
      out.write("                            <span class=\"txt-label\">* Nombre: <input type=\"text\" name=\"nombre\" id=\"nombre\" class=\"form-control\" autofocus /></span>\r\n");
      out.write("                        </label><br /><label>\r\n");
      out.write("                            <span class=\"tex-label\">* Apellido: <input type=\"text\" name=\"apellido\" id=\"apellido\" class=\"form-control\" /></span>\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <br />\r\n");
      out.write("                        <label>\r\n");
      out.write("                            <span class=\"tex-label\">\r\n");
      out.write("                                * E-mail:\r\n");
      out.write("                                <input type=\"text\" name=\"email\" id=\"email\" class=\"form-control\" />\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <br />\r\n");
      out.write("                        <label>\r\n");
      out.write("                            * Telefono:\r\n");
      out.write("                            <input type=\"text\" name=\"telefono\" id=\"telefono\" class=\"form-control\" />\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <br />\r\n");
      out.write("                        <label>\r\n");
      out.write("                            * Localidad:\r\n");
      out.write("                            <input type=\"text\" name=\"localidad\" id=\"localidad\" class=\"form-control\" />\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <br />\r\n");
      out.write("                        <p>* Datos obligatorios</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <br />\r\n");
      out.write("                        <label>\r\n");
      out.write("                            <span class=\"form-group\">\r\n");
      out.write("                                Mensaje:\r\n");
      out.write("                                <textarea class=\"form-control\" name=\"comentario\" rows=\"7\" cols=\"40\" id=\"comentario\"></textarea>\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <div id=\"clear\">\r\n");
      out.write("                            <input name=\"sumbit\" type=\"submit\" onclick=\"send()\" class=\"button boton\" id=\"sumbit_contacto\" value=\"ENVIAR\" />\r\n");
      out.write("                            <p class=\"ocultar\">\r\n");
      out.write("                                Para comunicarte,completá el formulario, o envianos un mail a la siguiente dirección:\r\n");
      out.write("                                <a href=\"mailto:tonaoficial@hotmail.com\" class=\"linea\">tonaoficial@hotmail.com</a>\r\n");
      out.write("                            </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div>\r\n");
      out.write("            <footer class=\"footer\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <nav id=\"nav\" class=\" navbar-inverse navbar-fixed-bottom\">\r\n");
      out.write("                        <div id=\"txtfooter\">\r\n");
      out.write("                            <p class=\"text-center credit txtbtn\"><time datetime=\"fechaISO\">2017</time> - TONA - Santa Eufemia, Cordoba, Argentina</p>\r\n");
      out.write("                            <div class=\"text-center img\">\r\n");
      out.write("                                <a href=\"https://www.instagram.com/t.o.n.aa/?hl=es\"> <img src=\"Image/Instagram.png\"></a>\r\n");
      out.write("                                <a href=\"https://www.facebook.com/TONAAOFICIAL/?pnref=story\"> <img src=\"Image/facebook.png\"></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                </div>\r\n");
      out.write("            </footer>\r\n");
      out.write("        </div>\r\n");
      out.write("            <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"Scripts/bootstrap.min.js\"></script>\r\n");
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
