<% String mensaje = (String) session.getAttribute("message");
	if (mensaje != null) { %>
<div class="pop-up container flex-center">
    <p><%=mensaje%></p>
    <button id="pop-up-close" title="close">
        <i class="fa-solid fa-x"></i>
    </button>
</div>
<%} %>
<% session.setAttribute("message", null); %>
<link rel="stylesheet" href="./styles/mensaje-pop-up.css">
<script src="./scripts/mensaje-pop-up.js"></script>
