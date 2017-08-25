<%-- 
    Document   : AddProduct
    Created on : 17/08/2017, 19:26:45
    Author     : Julieta
--%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" http-equiv="Content-type" content="text/html">
        <meta name="viewport" content="width=device-width" initial-scale=1.0">
        <link rel="stylesheet" href="Content/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="Content/bootstrap.css" >
        <link rel="stylesheet" href="Content/stylegeneral.css">
        <link rel="stylesheet" href="Content/styleAddProducto.css">

    </head>
    <body background="Image/prueba.jpg">
        <div id="nav" class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a id="btnMenu" class="navbar-collapse pull-right" data-toggle="collapse" href="#collapse1"><img src="Image/menu_Sandwich.png"></a>
                    <div>
                        <!--@Html.ActionLink("TONA", "tona", "Home", new { area = "" }, new { @id = "TONA", @class = "navbar-brand" })-->
                        <a href="Tona.jsp" id="TONA" class="navbar-brand">TONA</a>
                        <a href="Login.jsp"><img id="img" src="Image/maniqui.png"></a>
                    </div>
                </div>
                <div class="navbar-collapse collapse">
                    <div class="pull-right">
<!--                        @*<a id="btnMenu"  href="#collapse1"><img src="~/Image/menu_Sandwich.png"></a>*@-->
                    </div>
                </div>
                <div id="collapse1" class="txtbtn panel-collapse collapse pull-right">
                    <div id="aMenu">
                        <a class="aTxtColor" href="Galeria.jsp">Galeria</a>

                    </div>
                    <div id="aMenu">
                        <a class="aTxtColor" href="Contacto.jsp">Contacto</a>
                    </div>

                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-xs-0 col-md-3"></div>
            <div id="cont" class="col-xs-12 col-md-6">
                <form method="post" action="@Url.Action("AddProduct", "Admin")">
                      <div class="form-group">
                        <label for="titulo" style="font-size: 2em;"><strong>Producto:</strong></label>
                    </div>
                    <div class="form-group">
                        <label for="titulo">Descripcion</label>
                        <textarea class="form-control" rows="3" placeholder="Descripción"></textarea>
                    </div>
                    <div class="form-group">
                        <label for="titulo">Imagen</label>
                        <div>
                            <table class="table">
                                <tr>
                                    <th style="text-align: left; vertical-align: middle; width: 20%;">
                                        <!--                                    @*<p><label ty class="btn btn-warning"><span class="glyphicon glyphicon-arrow-up" aria-hidden="true"></span>
                                                                                <input type="file"/></label>
                                                                            </p>*@-->
                                        <input type="file"/>
                                        <label class="checkbox-inline"><input type="checkbox" value="0">Primavera-Verano</label>
                                        <label class="checkbox-inline"><input type="checkbox" value="1">Otoño-Invierno</label>
                                    </th>
                                    <th style="text-align: left; vertical-align: middle; width: 80%;">
                                        <p><img id="imgMin" src="Image/tona.jpg" class="img-rounded"></p>
                                    </th>
                                </tr>
                            </table>
                        </div>
                    </div>
                    <div class="form-group">
                        <div>
                            <table class="table">
                                <tr>
                                    <th style="text-align: center; vertical-align: middle; width: 50%;">
                                        <p><button type="submit" class="btn btn-ttc">Cargar Producto</button></p>
                                    </th>
                                </tr>
                            </table>
                        </div>
                    </div>
                </form>
            </div>
        </div>
        <div>
            <footer class="footer">
                <div>
                    <nav id="nav" class=" navbar-inverse navbar-fixed-bottom">
                        <div id="txtfooter">
                            <p class="text-center credit txtbtn"> - TONA - Santa Eufemia, Cordoba, Argentina</p>
                            <div class="text-center img">
<!--                                <a href="https://www.instagram.com/t.o.n.aa/?hl=es"> <img src="Image/Instagram.png"></a>
                                <a href="https://www.facebook.com/TONAAOFICIAL/?pnref=story"> <img src="Image/facebook.png"></a>-->
                            </div>
                        </div>
                    </nav>
                </div>
            </footer>
        </div>
        <script src="Scripts/jquery-1.10.2.min.js"/>
        <script src="Scripts/bootstrap.js"/>            
    </body>
</html>
