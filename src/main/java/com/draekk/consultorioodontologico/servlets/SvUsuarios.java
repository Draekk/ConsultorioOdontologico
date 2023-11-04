package com.draekk.consultorioodontologico.servlets;

import com.draekk.consultorioodontologico.logica.Controladora;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Drakkseid
 */
@WebServlet(name = "SvUsuarios", urlPatterns = {"/SvUsuarios"})
public class SvUsuarios extends HttpServlet {

	Controladora control = new Controladora();

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List usuarios = control.getUsuarios();

		HttpSession miSesion = request.getSession();
		miSesion.setAttribute("usuarios", usuarios);

		response.sendRedirect("index-ver-usuario.jsp");

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String rol = request.getParameter("rol");
		HttpSession miSession = request.getSession();

		try {
			control.crearUsuario(username, password, rol);
			miSession.setAttribute("message", "Usuario registrado con éxito");
			response.sendRedirect("index.jsp");

		} catch (Exception e) {
			miSession.setAttribute("message", e.getMessage());
			response.sendRedirect("index.jsp");
		}

	}

	@Override
	public String getServletInfo() {
		return "Short description";
	}// </editor-fold>

}
