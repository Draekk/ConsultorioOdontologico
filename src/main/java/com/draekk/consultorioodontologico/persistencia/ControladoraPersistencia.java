package com.draekk.consultorioodontologico.persistencia;

import com.draekk.consultorioodontologico.logica.*;
import java.util.*;

public class ControladoraPersistencia {

	private HorarioJpaController horarioJC;
	private OdontologoJpaController odontologoJC;
	private PacienteJpaController pacienteJC;
	private PersonaJpaController personaJC;
	private ResponsableJpaController responsableJC;
	private SecretarioJpaController secretarioJC;
	private TurnoJpaController turnoJC;
	private UsuarioJpaController usuarioJC;

	public ControladoraPersistencia() {

		horarioJC = new HorarioJpaController();
		odontologoJC = new OdontologoJpaController();
		pacienteJC = new PacienteJpaController();
		personaJC = new PersonaJpaController();
		responsableJC = new ResponsableJpaController();
		secretarioJC = new SecretarioJpaController();
		turnoJC = new TurnoJpaController();
		usuarioJC = new UsuarioJpaController();
	}

	public void crear(Usuario usuario) {
		usuarioJC.create(usuario);
	}

	public List<Usuario> getUsuarios() {
		List<Usuario> usuarios = usuarioJC.findUsuarioEntities();
		return usuarios;
	}

}
