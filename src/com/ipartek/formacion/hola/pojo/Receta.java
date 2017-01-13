package com.ipartek.formacion.hola.pojo;

import java.util.Arrays;

public class Receta {

	// Atributos y constantes.
	String titulo;
	Ingrediente[] aIngrediente;
	int tiempo;
	String dificultad;
	int comensales;
	String descripcion;

	// Constructores.

	public Receta() {
		super();
		this.titulo = "Desconocido";
		this.aIngrediente = null;
		this.tiempo = 0;
		this.dificultad = "Facil";
		this.comensales = 0;
		this.descripcion = "Ninguna";
	}

	public Receta(String titulo, Ingrediente[] ingrediente, int tiempo, String dificultad, int comensales,
			String descripcion) {
		super();
		this.titulo = titulo;
		this.aIngrediente = ingrediente;
		this.tiempo = tiempo;
		this.dificultad = dificultad;
		this.comensales = comensales;
		this.descripcion = descripcion;
	}

	// Getters y Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Ingrediente[] getIngredientes() {
		return aIngrediente;
	}

	public void setIngredientes(Ingrediente[] ingrediente) {
		this.aIngrediente = ingrediente;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public String getDificultad() {
		return dificultad;
	}

	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}

	public int getComensales() {
		return comensales;
	}

	public void setComensales(int comensales) {
		this.comensales = comensales;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	// Metodos

	// public void isGlutenFree

	@Override
	public String toString() {
		return "Receta : titulo=" + titulo + ",\n Ingredientes =" + Arrays.toString(aIngrediente) + ",\n tiempo="
				+ tiempo + ",\n dificultad=" + dificultad + ",\n comensales=" + comensales + ",\n descripcion="
				+ descripcion + ".";
	}

}
