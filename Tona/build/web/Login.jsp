<%-- 
    Document   : Login
    Created on : 17/08/2017, 18:51:13
    Author     : gusti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link type="text/css" href="Content/bootstrap.css" rel="stylesheet">
        <link type="text/css" href="Content/styleLogReg.css" rel="stylesheet">

    </head>
    <body>
        <div id="table">
            <div id="">
                <div id="">
                    <img src="Image/TONAlogin.png" >
                    <form action="" method="post">
                        <div class="form-group">
                            <label>Usuario </label>
                            <div class="col-lg-12">
                                <input type="text"  name="username" placeholder="Ingrese su usuario" class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
                            <label>Contraseña </label>
                            <div class="col-md-12">
                                <input type="text" name="pass" placeholder="Ingrese su Contraseña" class="form-control"
                            </div>
                        </div>
                        <!--                        <div class="form-group">
                                                    <div class="col-md-offset-2 col-md-10">
                                                        <div class="checkbox">
                                                            @Html.CheckBoxFor(m => m.RememberMe)
                                                            @Html.LabelFor(m => m.RememberMe)
                                                        </div>
                                                    </div>
                                                </div>-->
                        <div class="form-group">
                            <div class="col-md-offset-1 col-md-10 text-center">
                                <input type="submit" value="Iniciar sesión" class="btn btn-danger" />
                            </div>
                        </div>
                    </form>
                    <!--<p>
                            @Html.ActionLink("Registrar como nuevo usuario", "Register")
                        </p>
                     Habilite esta opción después de habilitar la confirmación de la cuenta para la función de restablecimiento de contraseña
                        <p>
                            @Html.ActionLink("¿Ha olvidado su contraseña?", "ForgotPassword")
                        </p>-->

                </div>
            </div>
            <!--<div class="col-md-4">
                    <section id="socialLoginForm">
                        @Html.Partial("_ExternalLoginsListPartial", new ExternalLoginListViewModel { ReturnUrl = ViewBag.ReturnUrl })
                    </section>
                </div>-->
        </div>


    </body>

</html>

