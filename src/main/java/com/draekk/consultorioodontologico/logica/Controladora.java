
package com.draekk.consultorioodontologico.logica;

import com.draekk.consultorioodontologico.persistencia.ControladoraPersistencia; 

public class Controladora {
	
	ControladoraPersistencia controladoraP = new ControladoraPersistencia();

	public void crearUsuario(String username, String password, String rol){
		
		Usuario usuario = new Usuario(username, password, rol);
		
		controladoraP.crear(usuario);
		
	}
	
}
