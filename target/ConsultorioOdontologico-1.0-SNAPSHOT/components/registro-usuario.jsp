
<div class="container flex-center vert">
    <h1>Registro de Usuario</h1>
    <form class="container vert flex-center" action="SvUsuarios" method="post">
        <label for="username">
            <input type="text" id="username" name="username" placeholder="Inserte su nombre de usuario">
        </label>
        <label for="pass-input">
            <input id="pass-input" type="password" name="password" placeholder="Inserte su contraseña">
        </label>
        <label for="rol">
            <select id="rol" name="rol">
                <option value="" disabled selected>Selecciona un rol</option>
                <option value="admin">Administrador</option>
                <option value="paciente">Paciente</option>
                <option value="secretario">Secretario</option>
                <option value="odontologo">Odontólogo</option>
            </select>
        </label>
        <button type="submit" id="btn-submit">Registrar</button>
        <i id="show-pass" class="fa-solid fa-eye"></i>
        <i id="hide-pass" class="inactive fa-solid fa-eye-slash"></i>
    </form>
</div>