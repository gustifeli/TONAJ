<%-- 
    Document   : Admin
    Created on : 17/08/2017, 19:29:55
    Author     : Julieta
--%>

<section>
    <div class="contenedor">
            <h1 id="productos"> Productos<a href="@Url.Action("AddProduct","Admin")" class="btn btn-default"><span class="glyphicon glyphicon-plus-sign"></span> Producto</a></h1>
            <table class="table table-responsive table-hover">
                <tr>
                    <td style="text-align: left; vertical-align: middle; width: 20%;">Imagen</td>
                    <td style="text-align: left; vertical-align: middle; width: 50%;">Descripci�n</td>
                    <td style="text-align: left; vertical-align: middle; width: 30%;">Acciones</td>
                </tr>
                <tr>
                    <td><img id="imgMin" src="~/Image/tona.jpg" class="img-rounded"></td>
                    <td>
                        <input type="text" class="form-control" placeholder="Descripci�n">
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
                    <td><img id="imgMin" src="~/Image/tona1.jpg" class="img-rounded"></td>
                    <td>
                        <input type="text" class="form-control" placeholder="Descripci�n">
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
                    <td><img id="imgMin" src="~/Image/tona2.jpg" class="img-rounded"></td>
                    <td>
                        <input type="text" class="form-control" placeholder="Descripci�n">
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
                    <td><img id="imgMin" src="~/Image/tona.jpg" class="img-rounded"></td>
                    <td>
                        <input type="text" class="form-control" placeholder="Descripci�n">
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
</section>
