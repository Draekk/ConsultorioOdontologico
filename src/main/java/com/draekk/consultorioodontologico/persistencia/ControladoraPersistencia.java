package com.draekk.consultorioodontologico.persistencia;

import com.draekk.consultorioodontologico.logica.*;
import com.draekk.consultorioodontologico.persistencia.exceptions.NonexistentEntityException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

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

	public void borrarUsuario(int id) {

		try {
			usuarioJC.destroy(id);
		} catch (NonexistentEntityException ex) {
			Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
		}
		
	}

	public Usuario buscarUsuario(int id) {

		return usuarioJC.findUsuario(id);
		
	}

	public void editarUsuario(Usuario usuario) {
		try {
			usuarioJC.edit(usuario);
		} catch (Exception ex) {
			Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}
