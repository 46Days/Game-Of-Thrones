package com.sinfloo.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dragon")
public class dragon {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int edad;
	private int fuerza;
	private int kills;
	private String name;
	private String raza;
	private String color;
	private String comida;
	
	
	public dragon(int id, int edad, int fuerza, int kills, String name, String raza, String color, String comida) {
		super();
		this.id = id;
		this.edad = edad;
		this.fuerza = fuerza;
		this.kills = kills;
		this.name = name;
		this.raza = raza;
		this.color = color;
		this.comida = comida;
	}
	
	public dragon() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
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

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getComida() {
		return comida;
	}

	public void setComida(String comida) {
		this.comida = comida;
	}
	
	
}
