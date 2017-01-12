package com.ipartek.formacion.hola;

import com.ipartek.formacion.hola.pojo.LibroNoEncapsulado;

/**
 * 
 * @author curso
 *
 */

/**
 * 
 * Clase para realizar un 'Hola Mundo'
 *
 */
public class Hola {

	/**
	 * metodo 'main' para ejecutar la clase
	 * 
	 * @param args
	 *            []String
	 */

	public static void main(String[] args) {
		// Esto es un comentario de linea.

		/*
		 * Comentario de bloque
		 * 
		 * Permite mas de una linea.
		 * 
		 */

		// Operador ternario.
		// Asignar un valor a una variable en funcion de una 'condicion'.
		// ( condicion ) ? true : false;
		int edad = (3 > 100) ? 18 : 34; // En este ejemplo es false porque 3 no
										// es mayor que 100.
		System.out.println("edad" + edad);

		// Declarar variables.

		int variableEntera; // iEntera.
		boolean variableBooleana = true; // bBooleana.
		if (variableBooleana) {
			System.out.println("Es verdadero");
		} else {
			System.out.println("Es falso");
		}

		float dineroCuenta = 10.23f; // 10,23€ formato anglosajon.
										// fNumeroConDecimales.
		float dineroCuenta2 = (float) 10.23; // Segunda opcion.

		char caracter = 'p';
		String cadena = "dobles";

		System.out.println("Hola Mundo, soy Eneko");

		// Instanciar un objeto de la clase Libro

		LibroNoEncapsulado libroJava = new LibroNoEncapsulado();

		libroJava.numeroPaginas = 320;
		libroJava.nombre = "Java 7";
		libroJava.autor = "Autor Java";

		System.out.println(libroJava.describete());

		// escribir 10 paginas nuevas
		System.out.println("El autor escribe 10 paginas mas");
		// for (int i = 0; i < 10; i++) {
		libroJava.escribir(10);
		// }
		System.out.println(libroJava.describete());

		LibroNoEncapsulado phpyhtml = new LibroNoEncapsulado();

		phpyhtml.numeroPaginas = 725;
		phpyhtml.nombre = "PHP y HTML";
		phpyhtml.autor = " Autor PHP y HTML";

		System.out.println(phpyhtml.describete());
		System.out.println("El autor escribe 10 paginas mas");
		for (int i = 0; i < 10; i++) {
			phpyhtml.escribir(10);
		}

		System.out.println(phpyhtml.describete());
	}
}
