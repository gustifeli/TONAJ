<%-- 
    Document   : AddProduct
    Created on : 17/08/2017, 19:26:45
    Author     : Julieta
--%>

<section>
    <div class="row">
        <div class="col-xs-0 col-md-3"></div>
        <div id="cont" class="col-xs-12 col-md-6">
            <form method="post" action="@Url.Action("AddProduct", "Admin")">
                <div class="form-group">
                    <label for="titulo" style="font-size: 2em;"><strong>Producto:</strong></label>
                </div>
                <div class="form-group">
                    <label for="titulo">Descripcion</label>
                    <textarea class="form-control" rows="3" placeholder="Descripci�n"></textarea>
                </div>
                <div class="form-group">
                    <label for="titulo">Imagen</label>
                    <div>
                        <table class="table">
                            <tr>
                                <th style="text-align: left; vertical-align: middle; width: 20%;">
                                    @*<p><label ty class="btn btn-warning"><span class="glyphicon glyphicon-arrow-up" aria-hidden="true"></span>
                                        <input type="file"/></label>
                                    </p>*@
                                    <input type="file"/>
                                    <label class="checkbox-inline"><input type="checkbox" value="0">Primavera-Verano</label>
                                    <label class="checkbox-inline"><input type="checkbox" value="1">Oto�o-Invierno</label>
                                </th>
                                <th style="text-align: left; vertical-align: middle; width: 80%;">
                                    <p><img id="imgMin" src="~/Image/tona1.jpg" class="img-rounded"></p>
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
</section>
