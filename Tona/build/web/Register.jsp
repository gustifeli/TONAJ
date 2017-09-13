<%-- 
    Document   : Register
    Created on : 17/08/2017, 19:04:12
    Author     : gusti
--%>
<%@taglib prefix="t" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<t:if test="${sessionScope['sessionUser']!= null}">
    <% response.sendRedirect("Login.jsp");%>
</t:if>

<!DOCTYPE html>

<html>
    <head>
        <title>Registro</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link type="text/css" href="Content/bootstrap.css" rel="stylesheet">
        <link type="text/css" href="Content/styleLogReg.css" rel="stylesheet" />
    </head>
    <body>
    <center><h4>Cree una cuenta nueva</h4></center>
    <hr/>
    <div class="contenido">
        <p style="color: #d43f3a">${sessionScope['error']}</p>
        <form action="Register" method="post">
            <div class="form-group ">
                <label>Usuario</label>
                <div class="col-lg-offset-3 col-lg-6">
                    <input type="text"  name="name" placeholder="Ingrese su usuario" class="form-control">
                </div>
            </div>

            <div class="form-group">
                </br><label>Contraseña</label>
                <div class="col-lg-offset-3 col-lg-6">
                    <input type="password" name="pass" placeholder="Ingrese su Contraseña" class="form-control">
                </div>
            </div>
            <div class="form-group">
                </br><label>Confirmar contraseña</label>
                <div class="col-lg-offset-3 col-lg-6">
                    <input type="text" name="pass2" placeholder="Confirme su Contraseña" class="form-control">
                    </br>

                </div>
            </div>
            <div class="form-group">
                <div class="col-lg-offset-3 col-lg-6 text-center">
                    </br><input type="submit" class="btn btn-default" value="Registrarse" />
                </div>
            </div>
            <div class="form-group">
                <div class="col-lg-offset-3 col-lg-6 text-center">
                    </br><p class="btn btn-default"><a href="Login.jsp"> Iniciar Sesion</a></p>
                </div>
            </div>
        </form>
    </div>
</body>
</html>
