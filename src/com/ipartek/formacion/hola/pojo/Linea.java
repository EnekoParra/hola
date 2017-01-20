package com.ipartek.formacion.hola.pojo;

import com.ipartek.formacion.hola.ejercicios.ObjetoGrafico;

public class Linea extends ObjetoGrafico {

	private int longitud;

	public Linea(int x, int y) {
		super(x, y);
		this.longitud = 0;
	}

	@Override
	public void dibujar() {
		System.out.println("Pintar Linea");

	}

}
