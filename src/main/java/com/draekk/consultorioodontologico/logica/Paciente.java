
package com.draekk.consultorioodontologico.logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Paciente extends Persona implements Serializable {
	
	private boolean tiene_OS;
	
	@Enumerated(EnumType.STRING)
	private TipoSangre tipoSangre;
	
	@OneToOne
	private Responsable responsable;
	
	@OneToMany(mappedBy = "paciente")
	private List<Turno> turnos;


	public boolean isTiene_OS() {
		return tiene_OS;
	}

	public void setTiene_OS(boolean tiene_OS) {
		this.tiene_OS = tiene_OS;
	}

	public TipoSangre getTipoSangre() {
		return tipoSangre;
	}

	public void setTipoSangre(TipoSangre tipoSangre) {
		this.tipoSangre = tipoSangre;
	}

	public Responsable getResponsable() {
		return responsable;
	}

	public void setResponsable(Responsable responsable) {
		this.responsable = responsable;
	}

	public List<Turno> getTurnos() {
		return turnos;
	}

	public void setTurnos(List<Turno> turnos) {
		this.turnos = turnos;
	}
	
	

	public Paciente() {
	}

	public Paciente(boolean tiene_OS, TipoSangre tipoSangre, Responsable responsable, List<Turno> turnos, int id, String rut, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
		super(id, rut, nombre, apellido, telefono, direccion, fecha_nac);
		this.tiene_OS = tiene_OS;
		this.tipoSangre = tipoSangre;
		this.responsable = responsable;
		this.turnos = turnos;
	}
	
	
}
