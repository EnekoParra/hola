package com.ipartek.formacion.hola.pojo;

import com.ipartek.formacion.hola.ejercicios.ObjetoGrafico;

public abstract class Circulo extends ObjetoGrafico {

	private int radio;

	public Circulo(int x, int y) {
		super(x, y);
		this.radio = 0;
	}

}
