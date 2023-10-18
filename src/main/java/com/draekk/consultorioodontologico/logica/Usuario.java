
package com.draekk.consultorioodontologico.logica;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Usuario implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String username;
	private String password;
	
	@Enumerated(EnumType.STRING)
	private Rol rol;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Usuario() {
	}

	public Usuario(int id, String username, String password, Rol rol) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.rol = rol;
	}
	
	
}
