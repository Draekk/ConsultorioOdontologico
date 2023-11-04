
package com.draekk.consultorioodontologico.logica;

import com.draekk.consultorioodontologico.persistencia.ControladoraPersistencia; 
import java.util.List;

public class Controladora {
	
	ControladoraPersistencia controladoraP = new ControladoraPersistencia();

	public void crearUsuario(String username, String password, String rol){
		
		Usuario usuario = new Usuario(username, password, rol);
		
		controladoraP.crear(usuario);
		
	}
	
	
	public List getUsuarios(){
		return controladoraP.getUsuarios();
	}

	public void borrarUsuario(int id) {

		controladoraP.borrarUsuario(id);
		
	}
	
}
