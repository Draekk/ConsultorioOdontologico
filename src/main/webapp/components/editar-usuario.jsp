<%@page import="com.draekk.consultorioodontologico.logica.Usuario"%>
<%
    Usuario usuario = (Usuario)session.getAttribute("usuario");
%>

<div class="container flex-center vert">
    <h1>Edici�n de Usuario</h1>
    <form class="container vert flex-center" action="SvEditarUsuario" method="post">
        <label for="username">
            <input type="text" id="username" name="username" value="<%=usuario.getUsername()%>" placeholder="Inserte nombre de usuario">
        </label>
        <label for="pass-input">
            <input id="pass-input" type="password" name="password" value="<%=usuario.getPassword()%>" placeholder="Inserte su contrase�a">
        </label>
        <label for="rol">
            <select id="rol" name="rol">
                
                <%switch(usuario.getRol()) {
                case "admin":%>
                <option value="admin" selected>Administrador</option>
                <option value="paciente">Paciente</option>
                <option value="secretario">Secretario</option>
                <option value="odontologo">Odont�logo</option>
                <%break;
                
                case "paciente":%>
                <option value="admin">Administrador</option>
                <option value="paciente" selected>Paciente</option>
                <option value="secretario">Secretario</option>
                <option value="odontologo">Odont�logo</option>
                <%break;
                
                case "secretario":%>
                <option value="admin">Administrador</option>
                <option value="paciente">Paciente</option>
                <option value="secretario" selected>Secretario</option>
                <option value="odontologo">Odont�logo</option>
                <%break;
                
                case "odontologo":%>
                <option value="admin">Administrador</option>
                <option value="paciente">Paciente</option>
                <option value="secretario">Secretario</option>
                <option value="odontologo" selected>Odont�logo</option>
                <%break;
                
                default:%>
                <option value="admin">Administrador</option>
                <option value="paciente">Paciente</option>
                <option value="secretario">Secretario</option>
                <option value="odontologo">Odont�logo</option>
                <%break;
                
                }%>
            </select>
        </label>
        <input type="hidden" name="id" value="<%=usuario.getId()%>">
        <button type="submit" id="btn-submit">Guardar</button>
        <i id="show-pass" class="fa-solid fa-eye"></i>
        <i id="hide-pass" class="inactive fa-solid fa-eye-slash"></i>
    </form>
</div>