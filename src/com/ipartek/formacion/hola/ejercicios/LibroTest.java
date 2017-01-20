package com.ipartek.formacion.hola.ejercicios;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ipartek.formacion.hola.pojo.Libro;

public class LibroTest {

	@Test

	public void testConstructorPorDefecto() {

		Libro l = new Libro();

		assertEquals("Desconocido", l.getTitulo());
		assertEquals("Anonimo", l.getAutor());
		assertEquals(0, l.getNumeroPaginas());

	}

	// @Test

	// public void testConstructorConParametros() {

	// Libro l = new Libro("Java 7", 324);

	// assertEquals("Java 7", l.getTitulo());
	// assertEquals("Anonimo", l.getAutor());
	// assertEquals(324, l.getNumeroPaginas());

	// Paginas negativas.
	// l = new Libro("Java 7", -1);

	// assertEquals("Java 7", l.getTitulo());
	// assertEquals("Anonimo", l.getAutor());
	// assertEquals(0, l.getNumeroPaginas());
	// }

	@Test
	public void testTitulo() {

		Libro libroJava = new Libro();
		// libroJava.titulo = "Java 7";
		libroJava.setTitulo("Java 7");
		assertEquals("Java 7", libroJava.getTitulo());
	}

	@Test
	public void testNumeroPaginas() {

		Libro l = new Libro();

		// Numero paginas positivo.
		l.setNumeroPaginas(300);
		assertEquals(300, l.getNumeroPaginas());

		// Numero paginas negativo == 0.

		l.setNumeroPaginas(-300);
		assertEquals(0, l.getNumeroPaginas());
	}

}
