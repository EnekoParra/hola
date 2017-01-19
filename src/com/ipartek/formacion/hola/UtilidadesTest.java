package com.ipartek.formacion.hola;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UtilidadesTest {

	@Test
	public void testBubbleSort() {

		int[] aDesordenado = { 3, 0, 1, 8, 7, 2, 5, 4, 6, 9 };
		int[] aOrdenado = Utilidades.bubbleSort(aDesordenado);

		assertEquals(0, aOrdenado[0]);
		assertEquals(1, aOrdenado[1]);
		assertEquals(2, aOrdenado[2]);
		assertEquals(3, aOrdenado[3]);
		assertEquals(4, aOrdenado[4]);
		assertEquals(5, aOrdenado[5]);
		assertEquals(6, aOrdenado[6]);
		assertEquals(7, aOrdenado[7]);
		assertEquals(8, aOrdenado[8]);
		assertEquals(9, aOrdenado[9]);

	}

	@Test
	public void testBubbleArrayAscendenteSort() {

		int[] aDesordenado = { 3, 0, 1, 8, 7, 2, 5, 4, 6, 9 };
		int[] aOrdenado = Utilidades.bubbleArrayAscendenteSort(aDesordenado);

		assertEquals(0, aOrdenado[0]);
		assertEquals(1, aOrdenado[1]);
		assertEquals(2, aOrdenado[2]);
		assertEquals(3, aOrdenado[3]);
		assertEquals(4, aOrdenado[4]);
		assertEquals(5, aOrdenado[5]);
		assertEquals(6, aOrdenado[6]);
		assertEquals(7, aOrdenado[7]);
		assertEquals(8, aOrdenado[8]);
		assertEquals(9, aOrdenado[9]);

	}

	@Test
	public void testGetNumAleatorio() {

		int numero = -1;
		final int NUMERO_MAXIMO = 10;

		// Crear array con todo false.
		boolean[] aResultado = new boolean[NUMERO_MAXIMO];

		// Generar 1000 numeros aleatorios y actualizar array con True.
		for (int i = 0; i < 1000; i++) {
			numero = Utilidades.getNumAleatorio(NUMERO_MAXIMO);
			aResultado[numero] = true;
		}

		// Recorrer array y comprobar todo true.
		for (int i = 0; i < aResultado.length; i++) {
			assertTrue(aResultado[i]);
		}
	}

	@Test
	public void testNoFallaNunca() {
		assertTrue(true);
	}

	@Test

	/*
	 * Suma dos numeros positivos, si uno de los dos es negativo, return 0. Y si
	 * suman mas de 100, return 0.
	 */
	public void testSumaTonta() {
		assertEquals("No suma bien", 5, Utilidades.sumaTonta(2, 3));
		assertEquals(0, Utilidades.sumaTonta(-2, 3));
		assertEquals(0, Utilidades.sumaTonta(-2, -3));
		assertEquals(0, Utilidades.sumaTonta(2, -3));
		assertEquals(">100 retorna 0", 0, Utilidades.sumaTonta(1, 100));
		// assertEquals(5,Utilidades.sumaTonta(null, null)); Variable primitiva
		// no objeto, si no funcionaria.

	}

}
