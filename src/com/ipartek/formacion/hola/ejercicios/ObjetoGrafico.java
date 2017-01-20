package com.ipartek.formacion.hola.ejercicios;

/**
 * 
 * 
 * @author curso
 *
 */
public abstract class ObjetoGrafico {

	private int x;
	private int y;

	/**
	 * Se compone de una latitud y longitud, mediante una clase interna.
	 */
	private GeoPunto gp;

	// Clase interna
	class GeoPunto {
		public float latitud;
		public float longitud;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public ObjetoGrafico(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	void mover(int x, int y) {
		System.out.println("Objeto movido a nueva posicion." + x + " " + y);
	}

	public abstract void dibujar();

}
