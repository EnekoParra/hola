package com.ipartek.formacion.hola.pojo;

/**
 * Comprobar que solo podemos instanciar objetos de las Clases que no sean
 * Abstractas.
 * 
 * @author curso
 *
 */
public class EjercicioAbstraccion {

	public static void main(String[] args) {

		// ObjetoGrafico og = new ObjetoGrafico(0,0);

		Linea linea = new Linea(0, 0);

		// En principio no se puede instanciar un objeto de Clase abstracta,
		// a menos que se implemente en el momento de la instanciacion.

		// Clase anonima.
		// Circulo c = new Circulo(0,0);

		CirculoNoAbstracto c = new CirculoNoAbstracto(0, 0);

	}

}
