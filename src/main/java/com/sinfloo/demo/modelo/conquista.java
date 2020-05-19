package com.sinfloo.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "conquista")
public class conquista {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int zona;
	private String nombre;
	private String clima;
	private String comercio;
	private String estado;
	
	public conquista(int zona, String nombre, String clima, String comercio, String estado) {
		super();
		this.zona = zona;
		this.nombre = nombre;
		this.clima = clima;
		this.comercio = comercio;
		this.estado = estado;
	}
	
	public conquista() {

	}

	public int getZona() {
		return zona;
	}

	public void setZona(int zona) {
		this.zona = zona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClima() {
		return clima;
	}

	public void setClima(String clima) {
		this.clima = clima;
	}

	public String getComercio() {
		return comercio;
	}

	public void setComercio(String comercio) {
		this.comercio = comercio;
	}
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
