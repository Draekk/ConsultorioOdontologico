
package com.draekk.consultorioodontologico.logica;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Odontologo extends Persona {
	
	@Enumerated(EnumType.STRING)
	private Especialidad especialidad;
	
	@OneToMany(mappedBy = "odontologo")
	private List<Turno> turnos;
	
	@OneToOne
	private Usuario usuario;
	
	@OneToOne
	private Horario horario;

	
	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	public List<Turno> getTurnos() {
		return turnos;
	}

	public void setTurnos(List<Turno> turnos) {
		this.turnos = turnos;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	public Odontologo() {
	}

	public Odontologo(Especialidad especialidad, List<Turno> turnos, Usuario usuario, Horario horario, int id, String rut, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
		super(id, rut, nombre, apellido, telefono, direccion, fecha_nac);
		this.especialidad = especialidad;
		this.turnos = turnos;
		this.usuario = usuario;
		this.horario = horario;
	}

	
	
	
	
}
