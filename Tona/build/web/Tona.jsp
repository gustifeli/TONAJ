<%-- 
    Document   : Tona
    Created on : 17/08/2017, 19:32:36
    Author     : Julieta
--%>
<!DOCTYPE html>
<html>
<head >
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="~/Content/bootstrap.min.css">
    <link rel="stylesheet" href="~/"
    <link type="text/css" href="~/Content/bootstrap.css" rel="stylesheet">
    <title>@ViewBag.Title TONA</title>
</head>
<body>
    <div id="nav" class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a id="btnMenu" class="navbar-collapse pull-right" data-toggle="collapse" href="#collapse1"><img src="~/Image/menu_Sandwich.png"></a>
                <div>
                    @Html.ActionLink("TONA", "tona", "Home", new { area = "" }, new { @id = "TONA", @class = "navbar-brand" })
                    <a href="@Url.Action("Login","Account")"><img id="img" src="~/Image/maniqui.png"></a>
                </div>
            </div>
            <div class="navbar-collapse collapse">
                <div class="pull-right">
                    @*<a id="btnMenu"  href="#collapse1"><img src="~/Image/menu_Sandwich.png"></a>*@
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
    <div>
<div>
    <div id="jmb" class="jumbotron">
        <div id="myCarousel" class="carousel slide" data-ride="carousel">
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1"></li>
                <li data-target="#myCarousel" data-slide-to="2"></li>
            </ol>
            <div class="carousel-inner" role="listbox">
                <div class="item active">
                    <img src="~/Image/tona.jpg">
                </div>
                <div class="item">
                    <img src="~/Image/tona1.jpg">
                </div>
                <div class="item">
                    <img src="~/Image/tona2.jpg">
                </div>
            </div>
            <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>
    </div>
</div>