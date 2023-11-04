<%@page import="com.draekk.consultorioodontologico.logica.Usuario"%>
<%@page import="java.util.List"%>
<h1>Ver usuarios</h1>

<table id="tabla-usuarios">
    <caption>Lista de usuarios registrados</caption>
    <thead>
        <tr>
            <th class="width-s">ID</th>
            <th class="width-l">Nombre usuario</th>
            <th class="width-m">Rol</th>
            <th class="width-s">Acción</th>
        </tr>
    </thead>
    
    <% List<Usuario> usuarios = (List)request.getSession().getAttribute("usuarios"); %>
    
    <tbody>
        <% for(Usuario u : usuarios) {%>
        <tr>
            <td class="width-s" title="<%=u.getId()%>"><%=u.getId()%></td>
            <td class="width-l" title="<%=u.getUsername()%>"><%=u.getUsername()%></td>
            <td class="width-m" title="<%=u.getRol()%>"><%=u.getRol()%></td>
            <td class="width-s container flex-center accion">
                <form action="SvEditarUsuarios" method="POST">
                    <button title="Editar" type="submit">
                        <i class="fas fa-solid fa-pen-to-square"></i>
                    </button>
                    <input type="hidden" name="id" value="${u.getId()}">
                </form>
                <form action="SvEliminarUsuarios" method="POST">
                    <button title="Eliminar" type="submit">
                        <i class="fas fa-solid fa-trash"></i>
                    </button>
                    <input type="hidden" name="id" value="${u.getId()}">
                </form>
            </td>
        </tr>
        <%}%>
    </tbody>
    <tfoot>
        <tr>
            <th class="width-s">ID</th>
            <th class="width-l">Nombre usuario</th>
            <th class="width-m">Rol</th>
            <th class="width-s">Acción</th>
        </tr>
    </tfoot>
</table>
