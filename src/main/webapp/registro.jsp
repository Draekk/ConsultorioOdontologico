
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./styles/login-registro.css">
        <link rel="stylesheet" href="./styles/global.css">
        <title>Consultorio Odontológico - Registro usuario</title>
    </head>
    <body>
        <main>
            <%@include file="./components/mensaje-pop-up.jsp" %>
            <div id="main" class="container flex-center">
                <div class="container main-container">
                    <picture class="container flex-center">
                        <img src="https://images.pexels.com/photos/5668854/pexels-photo-5668854.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2" alt="imagen-odontologo">
                    </picture>
                    <section class="container vert flex-center-bt">
                        <h1>Registro de Usuario</h1>
                        <form class="container vert flex-center" action="SvUsuarios" method="post">
                            <label for="username"></label>
                            <input type="text" id="username" name="username" placeholder="Inserte su nombre de usuario">
                            <label for="pass-input"></label>
                            <input id="pass-input" type="password" name="password" placeholder="Inserte su contraseña">
                            <label for="rol"></label>
                            <select id="rol" name="rol">
                                <option value="" disabled selected>Selecciona un rol</option>
                                <option value="admin">Administrador</option>
                                <option value="paciente">Paciente</option>
                                <option value="secretario">Secretario</option>
                                <option value="odontologo">Odontólogo</option>
                            </select>
                            <button type="submit" id="btn-submit">Registrarse</button>
                            <i id="show-pass" class="fas-r fa-solid fa-eye inactive"></i>
                            <i id="hide-pass" class="fas-r fa-solid fa-eye-slash"></i>
                            <div class="bb-n-80"></div>
                        </form>
                        <div class="container vert flex-center">
                            <a href="login.jsp">Volver</a>
                        </div>
                    </section>
                </div>
            </div>
        </main>
        <script src="https://kit.fontawesome.com/4dba61bd48.js" crossorigin="anonymous"></script>
        <script src="./scripts/hide-show-password.js"></script>
    </body>
</html>
