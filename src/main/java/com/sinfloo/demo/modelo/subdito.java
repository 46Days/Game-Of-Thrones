package com.sinfloo.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subdito")
public class subdito {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int numHijos;
	private String name;
	private String nombreHijos;
	private String problema;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumHijos() {
		return numHijos;
	}
	public void setNumHijos(int numHijos) {
		this.numHijos = numHijos;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNombreHijos() {
		return nombreHijos;
	}
	public void setNombreHijos(String nombreHijos) {
		this.nombreHijos = nombreHijos;
	}
	public String getProblema() {
		return problema;
	}
	public void setProblema(String problema) {
		this.problema = problema;
	}
	
	public subdito(int id, int numHijos, String name, String nombreHijos, String problema) {
		super();
		this.id = id;
		this.numHijos = numHijos;
		this.name = name;
		this.nombreHijos = nombreHijos;
		this.problema = problema;
	}
	
	public subdito() {
		
	}
}
