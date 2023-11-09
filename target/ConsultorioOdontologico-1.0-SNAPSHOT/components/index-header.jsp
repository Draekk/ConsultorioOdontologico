
<header>
    <nav class="container nav-bar">
        <div class="container flex-center">
            <%
                    String uName = (String)request.getSession().getAttribute("username");
                    if(uName != null) {
            %>
            <a href="#"><%=uName%></a>
            <%
                } else {
            %>
            <a href="#">unknown_user</a>
            <%
                }
            %>
            <picture class="container">
                <img src="https://i.ibb.co/R31p3G5/hombre.png" alt="hombre" border="0">
            </picture>
        </div>
    </nav>
</header>
