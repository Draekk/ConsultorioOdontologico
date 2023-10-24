
<div class="container flex-center vert">
    <h1>Registrar Odontólogo</h1>
    <form class="container vert flex-center" action="./index.jsp" method="post">
        <%@include file="./super-components/registro-persona.jsp" %>
        <div class="sg-bb"></div>
        <label for="especialidad">
            <select id="especialidad" name="especialidad">
                <option value="" disabled selected>Selecciona tu especialidad</option>
                <option value="especialidad1">especialidad #1</option>
                <option value="especialidad2">especialidad #2</option>
                <option value="especialidad3">especialidad #3</option>
            </select>
        </label>
        <input type="submit" id="btn-submit" value="Registrar">
    </form>
</div>
