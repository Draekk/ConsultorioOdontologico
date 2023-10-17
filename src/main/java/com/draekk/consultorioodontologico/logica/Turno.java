
package com.draekk.consultorioodontologico.logica;

import java.util.Date;

public class Turno {
	
	private int id;
	private Date fecha;
	private String hora;
	private String affeccion;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getAffeccion() {
		return affeccion;
	}

	public void setAffeccion(String affeccion) {
		this.affeccion = affeccion;
	}

	public Turno() {
	}

	public Turno(int id, Date fecha, String hora, String affeccion) {
		this.id = id;
		this.fecha = fecha;
		this.hora = hora;
		this.affeccion = affeccion;
	}
	
	
}
