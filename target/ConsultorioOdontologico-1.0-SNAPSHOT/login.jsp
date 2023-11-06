
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./styles/login.css">
        <link rel="stylesheet" href="./styles/global.css">
        <title>Consultorio Odontológico - Login page</title>
    </head>
    <body>
        <main class="container flex-center">
            <div class="container main-container">
                <picture class="container flex-center">
                    <img src="https://images.pexels.com/photos/3779705/pexels-photo-3779705.jpeg" alt="imagen-odontologo">
                </picture>
                <section class="container vert flex-center-bt">
                    <h1>¡Bienvenido!</h1>
                    <form class="container vert flex-center" action="" method="POST">
                        <label for="username"></label>
                        <input type="text" id="username" name="username" placeholder="Nombre de usuario">
                        <label for="pass-input"></label>
                        <input type="password" id="pass-input" name="password" placeholder="Contraseña">
                        <button type="submit" id="btn-submit">Conectarse</button>
                        <i id="show-pass" class="fas fa-solid fa-eye"></i>
                        <i id="hide-pass" class="fas inactive fa-solid fa-eye-slash"></i>
                        <div class="bb-n-80"></div>
                    </form>
                    <div class="container vert flex-center">
                        <a href="">¿Olvidaste la contraseña?</a>
                        <p>¿No tienes cuenta? <a href="index-reg-usuario.jsp">¡Registrate!</a></p>
                    </div>
                </section>
            </div>
        </main>
        <script src="https://kit.fontawesome.com/4dba61bd48.js" crossorigin="anonymous"></script>
        <script src="./scripts/hide-show-password.js"></script>
    </body>
</html>
