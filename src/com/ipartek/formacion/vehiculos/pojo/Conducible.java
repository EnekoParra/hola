package com.ipartek.formacion.vehiculos.pojo;

public interface Conducible {

	final String DERECHA = "Giro derecha";
	final String IZQUIERDA = "Giro izquierda";

	void arrancar();

	void detener();

	void girar(String direccion);
}
