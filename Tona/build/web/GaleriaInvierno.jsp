<%-- 
    Document   : GaleriaInvierno
    Created on : 17/08/2017, 19:31:06
    Author     : gusti
--%>

<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html"/>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="~/Content/bootstrap.min.css">
    <link rel="stylesheet" href="~/Content/stylegeneral.css">
    <link rel="stylesheet" href="~/Content/stylegalerias.css">
    <link type="text/css" href="~/Content/bootstrap.css" rel="stylesheet">
    <title>TONA</title>
</head>
<body>
    <div id="nav" class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a id="btnMenu" class="navbar-collapse pull-right" data-toggle="collapse" href="#collapse1"><img src="~/web/Image/menu_Sandwich.png"></a>
                <div>
                    @Html.ActionLink("TONA", "tona", "Home", new { area = "" }, new { @id = "TONA", @class = "navbar-brand" })
                    <a href="@Url.Action("Login","Account")"><img id="img" src="~/web/Image/maniqui.png"></a>
                </div>
            </div>
            <div class="navbar-collapse collapse">
                <div class="pull-right">
                    <!--<a id="btnMenu"  href="#collapse1"><img src="~/Image/menu_Sandwich.png"></a>-->
                </div>
            </div>
            <div id="collapse1" class="txtbtn panel-collapse collapse pull-right">
                <div id="aMenu">
                    <a class="aTxtColor" href="@Url.Action("Galeria", "Home")">Galeria</a>

                </div>
                <div id="aMenu">
                    <a class="aTxtColor" href="@Url.Action("Contact","Home")">Contacto</a>
                </div>

            </div>
        </div>
    </div>
    <h1 id="encabezado">CAMPA?A OTO?O-INVIERNO</h1>
    <div>
        @RenderBody()
        <footer class="footer">
            <div>
                <nav id="nav" class=" navbar-inverse navbar-fixed-bottom">
                    <div id="txtfooter">
                        <p class="text-center credit txtbtn">&copy; @DateTime.Now.Year -TONA - Santa Eufemia, Cordoba, Argentina</p>
                        <div class="text-center img">
                            <a href="https://www.instagram.com/t.o.n.aa/?hl=es"> <img src="~/Image/Instagram.png"></a>
                            <a href="https://www.facebook.com/TONAAOFICIAL/?pnref=story"> <img src="~/Image/facebook.png"></a>
                        </div>
                    </div>
                </nav>
            </div>
        </footer>
    </div>


    @Scripts.Render("~/bundles/jquery")
    @Scripts.Render("~/bundles/bootstrap")
    @RenderSection("scripts", required: false)
</body>
</html>