package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Registro</title>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <link type=\"text/css\" href=\"~/Content/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link type=\"text/css\" href=\"~/Content/stylereg.css\" rel=\"stylesheet\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <h2>@ViewBag.Title.</h2>\r\n");
      out.write("\r\n");
      out.write("    @using (Html.BeginForm(\"Register\", \"Account\", FormMethod.Post, new { @class = \"form-horizontal\", role = \"form\" }))\r\n");
      out.write("    {\r\n");
      out.write("        @Html.AntiForgeryToken()\r\n");
      out.write("        <h4>Cree una cuenta nueva.</h4>\r\n");
      out.write("        <hr />\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            @Html.ValidationSummary(\"\", new { @class = \"text-danger\" })\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                @Html.LabelFor(m => m.Email, new { @class = \"col-md-2 control-label\" })\r\n");
      out.write("                <div class=\"col-xs-10 col-md-5\">\r\n");
      out.write("                    @Html.TextBoxFor(m => m.Email, new { @class = \"form-control\" })\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                @Html.LabelFor(m => m.Password, new { @class = \"col-md-2 control-label\" })\r\n");
      out.write("                <div class=\"col-xs-10 col-md-5\">\r\n");
      out.write("                    @Html.PasswordFor(m => m.Password, new { @class = \"form-control\" })\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                @Html.LabelFor(m => m.ConfirmPassword, new { @class = \"col-md-2 control-label\" })\r\n");
      out.write("                <div class=\"col-xs-10 col-md-5\">\r\n");
      out.write("                    @Html.PasswordFor(m => m.ConfirmPassword, new { @class = \"form-control\" })\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <div class=\"col-md-offset-2 col-md-10\">\r\n");
      out.write("                    <input type=\"submit\" class=\"btn btn-default\" value=\"Registrarse\" />\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    }\r\n");
      out.write("    @section Scripts {\r\n");
      out.write("        @Scripts.Render(\"~/bundles/jqueryval\")\r\n");
      out.write("    }\r\n");
      out.write("</body>\r\n");
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
