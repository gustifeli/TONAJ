package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class GaleriaInvierno_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta name=\"viewport\" content=\"width=device-width\" initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"Content/stylegeneral.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"Content/stylegalerias.css\">\r\n");
      out.write("        <link type=\"text/css\" href=\"Content/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\"/>\r\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"Image/imgsolapa.png\" />\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"Image/imgsolapa.png\" type=\"image/png\"/>\r\n");
      out.write("        <!-- least.js CSS-file -->\r\n");
      out.write("<link href=\"css/least.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("<!-- jQuery libary -->\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-latest.js\" defer=\"defer\"></script>\r\n");
      out.write("<!-- least.js JS-file -->\r\n");
      out.write("<script src=\"js/least.min.js\" defer=\"defer\"></script>\r\n");
      out.write("<!-- Lazyload JS-file -->\r\n");
      out.write("<script src=\"js/jquery.lazyload.min.js\" defer=\"defer\"></script>\r\n");
      out.write("        <title>Galería</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
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
      out.write("        <h1 id=\"encabezado\">CAMPAÑA OTOÑO-INVIERNO</h1>\r\n");
      out.write("        <ul id=\"gallery\">\r\n");
      out.write("        <li id=\"fullPreview\"></li>\r\n");
      out.write("\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"img/full/1.jpg\"></a>\r\n");
      out.write("            <img data-original=\"img/thumb/1.jpg\" src=\"img/effects/white.gif\" width=\"240\" height=\"150\" alt=\"Ocean\" />\r\n");
      out.write("\r\n");
      out.write("            <div class=\"overLayer\"></div>\r\n");
      out.write("            <div class=\"infoLayer\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <h2>\r\n");
      out.write("                            Ocean\r\n");
      out.write("                        </h2>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <p>\r\n");
      out.write("                            View Picture\r\n");
      out.write("                        </p>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"projectInfo\">\r\n");
      out.write("                <strong>\r\n");
      out.write("                    Day, Month, Year:\r\n");
      out.write("                </strong> sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum.\r\n");
      out.write("            </div>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <div>\r\n");
      out.write("        <footer class=\"footer\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <nav id=\"nav\" class=\" navbar-inverse navbar-fixed-bottom\">\r\n");
      out.write("                    <div id=\"txtfooter\">\r\n");
      out.write("                        <p class=\"text-center credit txtbtn\">- TONA - Santa Eufemia, Cordoba, Argentina</p>\r\n");
      out.write("                        <div class=\"text-center img\">\r\n");
      out.write("                            <a href=\"https://www.instagram.com/t.o.n.aa/?hl=es\"> <img src=\"Image/Instagram.png\"></a>\r\n");
      out.write("                            <a href=\"https://www.facebook.com/TONAAOFICIAL/?pnref=story\"> <img src=\"Image/facebook.png\"></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"Scripts/bootstrap.min.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("    $(document).ready(function(){\r\n");
      out.write("    $('#gallery').least();\r\n");
      out.write("});\r\n");
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
