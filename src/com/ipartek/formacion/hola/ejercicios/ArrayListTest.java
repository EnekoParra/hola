package com.ipartek.formacion.hola.ejercicios;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;

/**
 * Aprendiendo a usar ArrayList.
 */

import org.junit.Test;

public class ArrayListTest {

	ArrayList<String> paises;

	@Test
	public void test() {

		assertNull("Deberia de ser null", paises);

		paises = new ArrayList<String>();
		assertNotNull("No deberia de ser null", paises);

		assertEquals("0 paises", 0, paises.size());

		paises.add("EH");
		assertEquals("1 pais", 1, paises.size());

		paises.add("kudbejistan");
		paises.add("portugal");
		paises.add("Barakaldo");
		paises.add("Alemania");

		assertEquals(5, paises.size());

		assertEquals("Barakaldo", paises.remove(3));
		assertEquals(4, paises.size());

		paises.add(1, "Portugalete");
		assertEquals(5, paises.size());

		assertEquals("EH", paises.get(0));
		assertEquals("Portugalete", paises.get(1));
		assertEquals("kudbejistan", paises.get(2));
	}

}
