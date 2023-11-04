<% String status = (String) session.getAttribute("status");
	if (status != null) { 
            if(status.equals("1")){%>
<div class="pop-up container flex-center">
    <p>Usuario registrado con éxito</p>
    <button id="pop-up-close">
        <i class="fas fa-solid fa-x"></i>
    </button>
</div>
<%} else if (status.equals("0")) {
	String error = (String) session.getAttribute("error");%>
<div class="pop-up container flex-center">
    <p>
        <b>error:</b>
        <br>
        <%=error%>
    </p>
    <button id="pop-up-close">
        <i class="fas fa-solid fa-x"></i>
    </button>
</div>
<%}
}%>
