
package com.draekk.consultorioodontologico.persistencia;

public class ControladoraPersistencia {
	
	public ControladoraPersistencia(){
		
		HorarioJpaController horarioJC = new HorarioJpaController();
		OdontologoJpaController odontologoJC = new OdontologoJpaController();
		PacienteJpaController pacienteJC = new PacienteJpaController();
		PersonaJpaController personaJC = new PersonaJpaController();
		ResponsableJpaController responsableJC = new ResponsableJpaController();
		SecretarioJpaController secretarioJC = new SecretarioJpaController();
		TurnoJpaController turnoJC = new TurnoJpaController();
		UsuarioJpaController usuarioJC = new UsuarioJpaController();
		
	}
	
	
}
