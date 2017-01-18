package com.ipartek.formacion.recetas.ejercicios.herencia;

public interface Conducible {

	final String DERECHA = "Giro derecha";
	final String IZQUIERDA = "Giro izquierda";

	void arrancar();

	void detener();

	void girar(String direccion);
}
