<%-- 
    Document   : Galeria
    Created on : 17/08/2017, 19:28:02
    Author     : gusti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<h1 id="galeria">Galería</h1>
<div id="container">
    <div class="row">
        <div class="col-md-6">
            <div class="thumbnail">
                <a href="@Url.Action("Galeriainvierno" ,"Home")"><img class="imgG" src="~/Image/OI.jpg" alt="Otoño-Invierno"/>
                    <div class="caption">
                        <p>Campaña Otoño-Invierno</p>
                    </div>
                </a>
            </div>
        </div>
        <div class="col-md-6">
            <div class="thumbnail">
                <a href="@Url.Action("Galeriaverano" ,"Home")">
                    <img class="imgG" src="~/Image/PV.jpg" alt="Primavera-Verano">
                    <div class="caption">
                        <p>Campaña Primavera-Verano</p>
                    </div>
                </a>
            </div>
        </div>
    </div>
</div>
<!--<center><img id="prox" src="~/Image/prox.jpg" width="611" height="414"/></center>-->
