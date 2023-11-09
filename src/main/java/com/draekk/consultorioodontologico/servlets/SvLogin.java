
package com.draekk.consultorioodontologico.servlets;

import com.draekk.consultorioodontologico.logica.Controladora;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SvLogin", urlPatterns = {"/SvLogin"})
public class SvLogin extends HttpServlet {
	
	Controladora control = new Controladora();

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String username = (String)request.getParameter("username");
		String password = (String)request.getParameter("password");
		
		boolean isValid = control.comprobarIngreso(username, password);
		
		if(isValid) {
			HttpSession miSesion = request.getSession(true);
			miSesion.setMaxInactiveInterval(600);
			miSesion.setAttribute("username", username);
			miSesion.setAttribute("message", "¡Bienvenido " + username + "!");
			response.sendRedirect("index.jsp");
		} else {
			HttpSession miSesion = request.getSession(true);
			miSesion.setAttribute("message", "Credenciales inválidas");
			response.sendRedirect("login.jsp");
		}
		
	}

	@Override
	public String getServletInfo() {
		return "Short description";
	}// </editor-fold>

}
