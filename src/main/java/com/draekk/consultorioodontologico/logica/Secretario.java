
package com.draekk.consultorioodontologico.logica;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;

@Entity
public class Secretario extends Persona{
	
	@Enumerated(EnumType.STRING)
	private Sector sector;
	
	@OneToOne
	private Usuario usuario;

	public Sector getSector() {
		return sector;
	}

	public void setSector(Sector sector) {
		this.sector = sector;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Secretario() {
	}

	public Secretario(Sector sector, Usuario usuario, int id, String rut, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
		super(id, rut, nombre, apellido, telefono, direccion, fecha_nac);
		this.sector = sector;
		this.usuario = usuario;
	}
	
	
	
	
}
