
package com.draekk.consultorioodontologico.logica;

public class Horario {
	
	private int id;
	private String inicio;
	private String fin;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInicio() {
		return inicio;
	}

	public void setInicio(String inicio) {
		this.inicio = inicio;
	}

	public String getFin() {
		return fin;
	}

	public void setFin(String fin) {
		this.fin = fin;
	}

	public Horario() {
	}

	public Horario(int id, String inicio, String fin) {
		this.id = id;
		this.inicio = inicio;
		this.fin = fin;
	}
	
	
	
}
