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
    </section>
