<%-- 
    Document   : Register
    Created on : 17/08/2017, 19:04:12
    Author     : gusti
--%>

<!DOCTYPE html>

<html>
<head>
    <title>Registro</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link type="text/css" href="~/Content/bootstrap.css" rel="stylesheet">
    <link type="text/css" href="~/Content/stylereg.css" rel="stylesheet" />
</head>
<body>
    <h2>@ViewBag.Title.</h2>

    @using (Html.BeginForm("Register", "Account", FormMethod.Post, new { @class = "form-horizontal", role = "form" }))
    {
        @Html.AntiForgeryToken()
        <h4>Cree una cuenta nueva.</h4>
        <hr />
        <div class="container">
            @Html.ValidationSummary("", new { @class = "text-danger" })
            <div class="form-group">
                @Html.LabelFor(m => m.Email, new { @class = "col-md-2 control-label" })
                <div class="col-xs-10 col-md-5">
                    @Html.TextBoxFor(m => m.Email, new { @class = "form-control" })
                </div>
            </div>
            <div class="form-group">
                @Html.LabelFor(m => m.Password, new { @class = "col-md-2 control-label" })
                <div class="col-xs-10 col-md-5">
                    @Html.PasswordFor(m => m.Password, new { @class = "form-control" })
                </div>
            </div>
            <div class="form-group">
                @Html.LabelFor(m => m.ConfirmPassword, new { @class = "col-md-2 control-label" })
                <div class="col-xs-10 col-md-5">
                    @Html.PasswordFor(m => m.ConfirmPassword, new { @class = "form-control" })
                </div>
            </div>
            <div class="form-group">
                <div class="col-md-offset-2 col-md-10">
                    <input type="submit" class="btn btn-default" value="Registrarse" />
                </div>
            </div>
        </div>
    }
    @section Scripts {
        @Scripts.Render("~/bundles/jqueryval")
    }
</body>
</html>
