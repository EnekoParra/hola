package com.ipartek.formacion.hola;

import java.util.Arrays;

/**
 * Clase {@code Utilidades} con metodos estaticos y comunes. <br>
 * Por ejemplo: Generar numeros,aleatorios, validaciones,etc.
 * 
 * @author curso
 *
 */
public class Utilidades {

	/**
	 * Ordenacion en burbuja para un array de enteros.
	 * 
	 * @see https://www.youtube.com/watch?v=1yZQPjUT5B4
	 * @param aDesordenado
	 * @return
	 * @return
	 */

	static public int[] bubbleSort(int[] aDesordenado) {

		int numero1 = 0;
		boolean duende = true;

		while (duende) {
			duende = false;

			for (int i = 0; i < aDesordenado.length - 1; i++) {
				if (aDesordenado[i] > aDesordenado[i + 1]) {
					numero1 = aDesordenado[i];
					aDesordenado[i] = aDesordenado[i + 1];
					aDesordenado[i + 1] = numero1;
					duende = true;
				}
			}
		}

		return aDesordenado;
	}

	static public int[] bubbleArrayAscendenteSort(int[] aDesordenado) {
		Arrays.sort(aDesordenado);
		return aDesordenado;
	}

	/**
	 * Genera numero {@code int} aleatorio desde 0 hasta <b>maximoValor</b>.
	 * 
	 * @param maximoValor
	 *            numero aleatorio maximos que puede generar, incluido este.
	 * @return numero entero aleatorio
	 */
	static public int getNumAleatorio(int maximoValor) {
		return (int) (Math.random() * maximoValor);
	}

	/**
	 * Suma muy rara que se inventa el jefe, no me digas para que.
	 * 
	 * @param num1
	 *            Entero a sumar.
	 * @param num2
	 *            Entero a sumar.
	 * @return Suma de los dos parametros, pero: <br>
	 *         si cualquiera de los dos negativo, return 0. <br>
	 *         si la suma es superior a 100, return 0.
	 */
	static public int sumaTonta(int num1, int num2) {
		int resultado = -1;

		if (num1 < 0 || num2 < 0 || (num1 + num2 > 100)) {
			resultado = 0;
		} else {
			resultado = num1 + num2;
		}

		return resultado;

	}

}
