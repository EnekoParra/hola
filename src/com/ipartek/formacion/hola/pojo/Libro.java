package com.ipartek.formacion.hola.pojo;

public class Libro {

	// Atributos y constantes

	String titulo;
	String autor;
	int numeroPaginas;

	/*
	 * Constructores
	 * 
	 * Sirven para instanciar objetos de la clase <br> Tienen el mismo nombre
	 * que la clase.No hace falta especificar el <code>return</code>
	 * 
	 * Sobrecarga: Es un metodo con el mismo nombre y el mismo return, <br> pero
	 * diferentes parametros.
	 * 
	 */

	// Constructor por defecto.
	public Libro() {
		super();
		this.numeroPaginas = 0;
		this.titulo = "Desconocido";
		this.autor = "Anonimo";
	}

	// Constructor con parametros.
	public Libro(String _titulo, String _autor, int _numeroPaginas) {
		super();
		this.titulo = _titulo;
		this.autor = _autor;
		this.setNumeroPaginas(_numeroPaginas);

	}

	// Getters y setters

	public String getTitulo() {
		return titulo;

	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;

	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	/**
	 * En caso de ser negativo, seteamos a 0.
	 * 
	 * @param numeroPaginas
	 */
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = (numeroPaginas < 0) ? 0 : numeroPaginas;

		// Otros metodos

	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas + "]";
	}
}
