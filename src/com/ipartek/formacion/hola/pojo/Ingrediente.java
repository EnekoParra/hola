package com.ipartek.formacion.hola.pojo;

public class Ingrediente {

	// Atributos y constantes.
	String nombre;
	float cantidad;
	Boolean gluten = false;

	// Constructores.
	public Ingrediente() {
		super();
		this.nombre = "Desconocido";
		this.cantidad = 0;
		this.gluten = false;
	}

	public Ingrediente(String nombre, float cantidad, Boolean gluten) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.gluten = gluten;
	}

	// Getters y Setters.
	public float getCantidad() {
		return cantidad;
	}

	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getGluten() {
		return gluten;
	}

	public void setGluten(Boolean gluten) {
		this.gluten = gluten;
	}

	@Override
	public String toString() {
		return "\n Ingrediente: nombre=" + nombre + ", cantidad=" + cantidad + ", gluten=" + gluten + "";
	}

}
