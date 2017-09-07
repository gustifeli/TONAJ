<%-- 
    Document   : Admin
    Created on : 17/08/2017, 19:29:55
    Author     : Julieta
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" http-equiv="Content-type" content="text/html">
        <meta name="viewport" content="width=device-width" initial-scale=1.0">
        <link rel="stylesheet" href="Content/stylegeneral.css">
        <link rel="stylesheet" href="Content/styleAddProducto.css">
        <link type="text/css" href="Content/bootstrap.css" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"/>
        <link rel="icon" type="image/png" href="Image/imgsolapa.png" />
        <link rel="shortcut icon" href="Image/imgsolapa.png" type="image/png"/>
        <title>All Products</title>
    </head>
    <body background="Image/prueba.jpg">
        <nav id="nav" class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a id="btnMenu" class="navbar-collapse pull-right" data-toggle="collapse" href="#collapse1"><img src="Image/menu_Sandwich.png"></a>
                    <!--                @Html.ActionLink("TONA", "tona", "Home", new { area = "" }, new { @id = "TONA", @class = "navbar-brand" })-->
                    <a href="Tona.jsp" id="TONA" class="navbar-brand">TONA</a>
                    <a href="Login.jsp"><img id="img" src="Image/maniqui.png"></a>
                </div>
                <div class="navbar-collapse" id="myNavbar">
<!--                    <ul class="nav navbar-nav navbar-right">
                        <li id="drop" class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown"><b id="txt" href="#"><img src="Image/ic_user.png">@Html.Encode(User.Identity.Name)</b></a>

                            <ul class="dropdown-menu">
                                <li>

                                    @using (Html.BeginForm("LogOff", "Account", FormMethod.Post, new { id = "logoutForm" }))
                                    {
                                    @Html.AntiForgeryToken()
                                    <a href="javascript:document.getElementById('logoutForm').submit()">Cerrar sesión</a>
                                    }
                                </li>
                            </ul>

                        </li>
                        </ul>-->
                </div>
                <div id="collapse1" class="txtbtn panel-collapse collapse pull-right">
                    <div id="aMenu">
                        <a class="aTxtColor" href="Galeria.jsp">Galeria</a>

                    </div>
                    <div id="aMenu">
                        <a class="aTxtColor" href="Contactos.jsp">Contacto</a>
                    </div>

                </div>

            </div>
        </nav>
        <div class="contenedor">
            <h1 id="productos"> Productos<a href="AddProduct.jsp" class="btn btn-default"><span class="glyphicon glyphicon-plus-sign"></span> Producto</a></h1>
            <table class="table table-responsive table-hover">
                <tr>
                    <td style="text-align: left; vertical-align: middle; width: 20%;">Imagen</td>
                    <td style="text-align: left; vertical-align: middle; width: 50%;">Descripción</td>
                    <td style="text-align: left; vertical-align: middle; width: 30%;">Acciones</td>
                </tr>
                <tr>
                    <td><img id="imgMin" src="Image/tona.jpg" class="img-rounded"></td>
                    <td>
                        <input type="text" class="form-control" placeholder="Descripción">
                    </td>
                    <td>
                        <button type="button" class="btn btn-link">
                            <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                            Editar
                        </button>
                        <button type="button" class="btn btn-link">
                            <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
                            Borrar
                        </button>
                    </td>
                </tr>
                <tr>
                    <td><img id="imgMin" src="Image/tona1.jpg" class="img-rounded"></td>
                    <td>
                        <input type="text" class="form-control" placeholder="Descripción">
                    </td>
                    <td>
                        <button type="button" class="btn btn-link">
                            <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                            Editar
                        </button>
                        <button type="button" class="btn btn-link">
                            <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
                            Borrar
                        </button>
                    </td>
                </tr>
                <tr>
                    <td><img id="imgMin" src="Image/tona2.jpg" class="img-rounded"></td>
                    <td>
                        <input type="text" class="form-control" placeholder="Descripción">
                    </td>
                    <td>
                        <button type="button" class="btn btn-link">
                            <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                            Editar
                        </button>
                        <button type="button" class="btn btn-link">
                            <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
                            Borrar
                        </button>
                    </td>
                </tr>
                <tr>
                    <td><img id="imgMin" src="Image/tona.jpg" class="img-rounded"></td>
                    <td>
                        <input type="text" class="form-control" placeholder="Descripción">
                    </td>
                    <td>
                        <button type="button" class="btn btn-link">
                            <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                            Editar
                        </button>
                        <button type="button" class="btn btn-link">
                            <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
                            Borrar
                        </button>
                    </td>
                </tr>
            </table>
        </div>
        <div>
            <footer class="footer">
                <div>
                    <nav id="nav" class=" navbar-inverse navbar-fixed-bottom">
                        <div id="txtfooter">
                            <p class="text-center credit txtbtn">- TONA - Santa Eufemia, Cordoba, Argentina</p>
                            <div class="text-center img">
                                <!--                            <a href="https://www.instagram.com/t.o.n.aa/?hl=es"> <img src="Image/Instagram.png"></a>
                                                            <a href="https://www.facebook.com/TONAAOFICIAL/?pnref=story"> <img src="Image/facebook.png"></a>-->
                            </div>
                        </div>
                    </nav>
                </div>
            </footer>
        </div>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="Scripts/bootstrap.min.js"></script>
    </body>
</html>
