<%
	
        HttpSession miSesion = request.getSession();
        String username = (String) miSesion.getAttribute("username");
	
        if (username == null) {
                response.sendRedirect("login.jsp");
        }
	
%>
