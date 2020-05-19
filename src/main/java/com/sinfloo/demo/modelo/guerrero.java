package com.sinfloo.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="guerrero")
public class guerrero {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int kills;
	private String name;
	private String especialidad;
	private String cargo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getKills() {
		return kills;
	}
	public void setKills(int kills) {
		this.kills = kills;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public guerrero(int id, int kills, String name, String especialidad, String cargo) {
		super();
		this.id = id;
		this.kills = kills;
		this.name = name;
		this.especialidad = especialidad;
		this.cargo = cargo;
	}
	
	public guerrero() {

	}

	
	
}
