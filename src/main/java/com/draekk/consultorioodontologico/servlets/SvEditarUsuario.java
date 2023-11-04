package com.draekk.consultorioodontologico.servlets;

import com.draekk.consultorioodontologico.logica.Controladora;
import com.draekk.consultorioodontologico.logica.Usuario;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SvEditarUsuario", urlPatterns = {"/SvEditarUsuario"})
public class SvEditarUsuario extends HttpServlet {
	
	Controladora control = new Controladora();

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		
		Usuario usuario = control.buscarUsuario(id);
		HttpSession miSesion = request.getSession();
		
		if (usuario != null){
			
			miSesion.setAttribute("usuario", usuario);
			response.sendRedirect("index-edit-usuario.jsp");
			
		} else {
			
			miSesion.setAttribute("message", "Usuario inexistente");
			response.sendRedirect("SvUsuarios");
			
		}

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Usuario usuario = new Usuario(
				Integer.parseInt(request.getParameter("id")),
				(String)request.getParameter("username"),
				(String)request.getParameter("password"),
				(String)request.getParameter("rol")
		);
		HttpSession miSesion = request.getSession();
		control.editarUsuario(usuario);
		miSesion.setAttribute("message", "Usuario modificado con éxito");
		response.sendRedirect("SvUsuarios");


	}

	@Override
	public String getServletInfo() {
		return "Short description";
	}// </editor-fold>

}
