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
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link type="text/css" href="~/Content/bootstrap.css" rel="stylesheet">
    <link type="text/css" href="~/Content/stylelogin.css" rel="stylesheet" />
</head>
<body>
    <div id="table">
        <div id="">
            <div id="">
                    @using (Html.BeginForm(new { ReturnUrl = ViewBag.ReturnUrl }))
                    {
                        @Html.AntiForgeryToken()
                        @Html.ValidationSummary(true, "", new { @class = "text-danger" })

                        <img src="~/Image/TONAlogin.png" >
                        <div class="form-group">
                            @Html.LabelFor(m => m.Email, new { @class = "col-md-12 control-label text-center" })
                            <div class="col-lg-12">
                                @Html.TextBoxFor(m => m.Email, new { @class = "form-control" })
                                @Html.ValidationMessageFor(m => m.Email, "", new { @class = "text-danger" })
                            </div>
                        </div>
                        <div class="form-group">
                            @Html.LabelFor(m => m.Password, new { @class = "col-md-12 control-label" })
                            <div class="col-md-12">
                                @Html.PasswordFor(m => m.Password, new { @class = "form-control" })
                                @Html.ValidationMessageFor(m => m.Password, "", new { @class = "text-danger" })
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-offset-2 col-md-10">
                                <div class="checkbox">
                                    @Html.CheckBoxFor(m => m.RememberMe)
                                    @Html.LabelFor(m => m.RememberMe)
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-offset-2 col-md-10 text-center">
                                <input type="submit" value="Iniciar sesión" class="btn btn-danger" />
                            </div>
                        </div>
                        <!--<p>
                                @Html.ActionLink("Registrar como nuevo usuario", "Register")
                            </p>
                         Habilite esta opción después de habilitar la confirmación de la cuenta para la función de restablecimiento de contraseña
                            <p>
                                @Html.ActionLink("¿Ha olvidado su contraseña?", "ForgotPassword")
                            </p>-->
                    }
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



@section Scripts {
    @Scripts.Render("~/bundles/jqueryval")
}
