
package com.draekk.consultorioodontologico.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
public class Turno implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Temporal(TemporalType.DATE)
	private Date fecha;
	private String hora;
	private String affeccion;
	
	@ManyToOne
	@JoinColumn(name = "id")
	private Odontologo odontologo;
	
	@ManyToOne
	@JoinColumn(name = "id")
	private Paciente paciente;

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

	public Odontologo getOdontologo() {
		return odontologo;
	}

	public void setOdontologo(Odontologo odontologo) {
		this.odontologo = odontologo;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	

	public Turno() {
	}

	public Turno(int id, Date fecha, String hora, String affeccion, Odontologo odontologo, Paciente paciente) {
		this.id = id;
		this.fecha = fecha;
		this.hora = hora;
		this.affeccion = affeccion;
		this.odontologo = odontologo;
		this.paciente = paciente;
	}
}
