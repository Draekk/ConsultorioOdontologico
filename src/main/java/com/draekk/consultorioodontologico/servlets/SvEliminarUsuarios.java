package com.draekk.consultorioodontologico.servlets;

import com.draekk.consultorioodontologico.logica.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SvEliminarUsuarios", urlPatterns = {"/SvEliminarUsuarios"})
public class SvEliminarUsuarios extends HttpServlet {

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
		
		int id = Integer.parseInt(request.getParameter("id"));
		String status = "0";
		HttpSession miSesion = request.getSession();
		
		try {
			control.borrarUsuario(id);
			status = "1";
			miSesion.setAttribute("status", status);
			response.sendRedirect("SvUsuarios");
		} catch (Exception e){
			status = "0";
			miSesion.setAttribute("status", status);
			miSesion.setAttribute("error", e.getMessage());
			response.sendRedirect("SvUsuarios");
		}
		
		
	}

	@Override
	public String getServletInfo() {
		return "Short description";
	}// </editor-fold>

}
