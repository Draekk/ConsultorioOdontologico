
<div class="container flex-center vert">
    <h1>Registro de Usuario</h1>
    <form class="container vert flex-center" action="SvUsuarios" method="post">
        <label for="username">
            <input type="text" id="username" name="username" placeholder="Inserte su nombre de usuario">
        </label>
        <label for="password">
            <input type="password" id="password" name="password" placeholder="Inserte su contraseña">
        </label>
        <label for="rol">
            <select id="rol" name="rol">
                <option value="" disabled selected>Selecciona tu rol</option>
                <option value="paciente">Paciente</option>
                <option value="secretario">Secretario</option>
                <option value="odontologo">Odontólogo</option>
            </select>
        </label>
        <input type="submit" id="btn-submit" value="Registrar">
    </form>
</div>