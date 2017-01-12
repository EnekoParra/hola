package com.ipartek.formacion.hola.pojo;

/**
 * 
 * @author curso
 * 
 */

/**
 * 
 * Clase {@code Libro} representa un libro. Atributos: numeroPaginas, nombre y
 * autor.
 */
public class Libro {

	// Atributos
	/**
	 * int numeroPaginas numero de paginas que contiene el {@code Libro}.
	 */
	public int numeroPaginas;
	/**
	 * String nombre. nombre del {@code Libro}.
	 */
	public String nombre;
	/**
	 * String autor. nombre del autor del {@code Libro}.
	 */
	public String autor;

	// Metodos o funciones

	/**
	 * Muestra por pantalla los atributos del {@code Libro}.
	 */

	public String describete() {
		return "Descripcion: " + this.nombre + " Paginas: " + this.numeroPaginas + " Autor: " + this.autor;

	}

	/**
	 * Aumentamos el numero de paginas.
	 * 
	 * @param numPaginas
	 *            <code>int</code> numero de paginas nuevas escritas.
	 * 
	 */
	public void escribir(int numPaginas) {

		// this.numeroPaginas = this.numeroPaginas + numPaginas;
		this.numeroPaginas += numPaginas;
		;
	}

}
