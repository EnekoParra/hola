package com.ipartek.formacion.hola.pojo;

public class CirculoNoAbstracto extends Circulo {

	public CirculoNoAbstracto(int x, int y) {
		super(x, y);

	}

	@Override
	public void dibujar() {
		System.out.println("Pintar Circulo");

	}

}
