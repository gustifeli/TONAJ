package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\" http-equiv=\"Content-type\" content=\"text/html\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width\" initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"Content/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Content/bootstrap.css\" >\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"Content/stylegeneral.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"Content/styleAddProducto.css\">\r\n");
      out.write("<!--        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\"/>-->\r\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"Image/imgsolapa.png\" />\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"Image/imgsolapa.png\" type=\"image/png\"/>\r\n");
      out.write("        <title>+ - Producto</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body background=\"Image/prueba.jpg\">\r\n");
      out.write("        <div id=\"nav\" class=\"navbar navbar-inverse\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <a id=\"btnMenu\" class=\"navbar-collapse pull-right\" data-toggle=\"collapse\" href=\"#collapse1\"><img src=\"Image/menu_Sandwich.png\"></a>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <!--@Html.ActionLink(\"TONA\", \"tona\", \"Home\", new { area = \"\" }, new { @id = \"TONA\", @class = \"navbar-brand\" })-->\r\n");
      out.write("                        <a href=\"Tona.jsp\" id=\"TONA\" class=\"navbar-brand\">TONA</a>\r\n");
      out.write("                        <a href=\"Login.jsp\"><img id=\"img\" src=\"Image/maniqui.png\"></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"navbar-collapse collapse\">\r\n");
      out.write("                    <div class=\"pull-right\">\r\n");
      out.write("                        <!--                        @*<a id=\"btnMenu\"  href=\"#collapse1\"><img src=\"~/Image/menu_Sandwich.png\"></a>*@-->\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"collapse1\" class=\"txtbtn panel-collapse collapse pull-right\">\r\n");
      out.write("                    <div id=\"aMenu\">\r\n");
      out.write("                        <a class=\"aTxtColor\" href=\"Galeria.jsp\">Galeria</a>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"aMenu\">\r\n");
      out.write("                        <a class=\"aTxtColor\" href=\"Contacto.jsp\">Contacto</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-xs-0 col-md-3\"></div>\r\n");
      out.write("            <div id=\"cont\" class=\"col-xs-12 col-md-6\">\r\n");
      out.write("                <form method=\"post\" action=\"@Url.Action(\"AddProduct\", \"Admin\")\">\r\n");
      out.write("                      <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"titulo\" style=\"font-size: 2em;\"><strong>Producto:</strong></label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"titulo\">Descripcion</label>\r\n");
      out.write("                        <textarea class=\"form-control\" rows=\"3\" placeholder=\"Descripción\"></textarea>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"titulo\">Imagen</label>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <table class=\"table\">\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <th style=\"text-align: left; vertical-align: middle; width: 20%;\">\r\n");
      out.write("                                        <!--                                    @*<p><label ty class=\"btn btn-warning\"><span class=\"glyphicon glyphicon-arrow-up\" aria-hidden=\"true\"></span>\r\n");
      out.write("                                                                                <input type=\"file\"/></label>\r\n");
      out.write("                                                                            </p>*@-->\r\n");
      out.write("                                        <input type=\"file\"/>\r\n");
      out.write("                                        <label class=\"checkbox-inline\"><input type=\"checkbox\" value=\"0\">Primavera-Verano</label>\r\n");
      out.write("                                        <label class=\"checkbox-inline\"><input type=\"checkbox\" value=\"1\">Otoño-Invierno</label>\r\n");
      out.write("                                    </th>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </table>\r\n");
      out.write("                            <center><div>\r\n");
      out.write("                                    <p><img id=\"imgMin\" src=\"Image/tona.jpg\" class=\"img-rounded\"></p>\r\n");
      out.write("                                </div></center>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <table class=\"table\">\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <th style=\"text-align: center; vertical-align: middle; width: 50%;\">\r\n");
      out.write("                                        <p><button type=\"submit\" class=\"btn btn-ttc\">Cargar Producto</button></p>\r\n");
      out.write("                                    </th>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </table>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div>\r\n");
      out.write("            <footer class=\"footer\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <nav id=\"nav\" class=\" navbar-inverse navbar-fixed-bottom\">\r\n");
      out.write("                        <div id=\"txtfooter\">\r\n");
      out.write("                            <p class=\"text-center credit txtbtn\"> - TONA - Santa Eufemia, Cordoba, Argentina</p>\r\n");
      out.write("                            <div class=\"text-center img\">\r\n");
      out.write("                                <!--                                <a href=\"https://www.instagram.com/t.o.n.aa/?hl=es\"> <img src=\"Image/Instagram.png\"></a>\r\n");
      out.write("                                                                <a href=\"https://www.facebook.com/TONAAOFICIAL/?pnref=story\"> <img src=\"Image/facebook.png\"></a>-->\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                </div>\r\n");
      out.write("            </footer>\r\n");
      out.write("        </div>\r\n");
      out.write("            <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"Scripts/bootstrap.min.js\"></script>           \r\n");
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
