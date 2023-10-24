
<div class="container flex-center vert">
    <h1>Registro de Usuario</h1>
    <form class="container vert flex-center" action="./index.jsp" method="post">
        <label for="username">
            <input type="text" id="username" name="username" placeholder="Inserte su nombre de usuario">
        </label>
        <label for="password">
            <input type="password" id="password" name="password" placeholder="Inserte su contraseña">
        </label>
        <label for="rol">
            <select id="rol" name="rol">
                <option value="" disabled selected>Selecciona tu rol</option>
                <option value="rol1">rol #1</option>
                <option value="rol2">rol #2</option>
                <option value="rol3">rol #3</option>
            </select>
        </label>
        <input type="submit" id="btn-submit" value="Registrar">
    </form>
</div>