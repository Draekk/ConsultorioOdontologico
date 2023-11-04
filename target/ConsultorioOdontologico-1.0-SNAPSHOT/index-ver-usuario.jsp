<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="./styles/index.css">
        <link rel="stylesheet" href="./styles/ver-usuarios.css">
        <title>Consultorio Odontológico</title>
    </head>
    <body>
        <div class="container main-container">
            <%@include file="./components/index-aside.jsp" %>
            <div class="container vert header-main">
                <%@include file="./components/index-header.jsp" %>
                <main>
                    <%@include file="components/ver-usuarios.jsp" %>
                </main>
                <%@include file="./components/index-footer.jsp" %>
            </div>
        </div>
    </body>
    <script src="https://kit.fontawesome.com/4dba61bd48.js" crossorigin="anonymous"></script>
    <script src="./scripts/index.js"></script>
</html>