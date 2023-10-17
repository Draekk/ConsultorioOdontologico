
package com.draekk.consultorioodontologico.logica;

import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Responsable extends Persona {
	
	private String tipoResponsabilidad;


	public String getTipoResponsabilidad() {
		return tipoResponsabilidad;
	}

	public void setTipoResponsabilidad(String tipoResponsabilidad) {
		this.tipoResponsabilidad = tipoResponsabilidad;
	}

	public Responsable() {
	}

	public Responsable(String tipoResponsabilidad, int id, String rut, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
		super(id, rut, nombre, apellido, telefono, direccion, fecha_nac);
		this.tipoResponsabilidad = tipoResponsabilidad;
	}

	
	
}

