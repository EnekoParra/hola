package com.ipartek.formacion.hola.pojo;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ComparacionesTestA {

	ArrayList<RecetaA> recetas = new ArrayList<RecetaA>();
	RecetaA solomillo = new RecetaA("solomillo");
	RecetaA marmitako = new RecetaA("marmitako");
	RecetaA tortilla = new RecetaA("Torilla Patatas");

	ArrayList<IngredienteA> ingredientes = new ArrayList<IngredienteA>();
	IngredienteA carne = new IngredienteA("Carne", 2, false);
	IngredienteA pescado = new IngredienteA("Pescado", 1, false);
	IngredienteA verdura = new IngredienteA("Verdura", 3, false);

	@Before
	public void setUp() throws Exception {
		solomillo.setDificultad(RecetaA.MODERADO);
		marmitako.setDificultad(RecetaA.DIFICIL);
		tortilla.setDificultad(RecetaA.FACIL);

		recetas.add(solomillo);
		recetas.add(marmitako);
		recetas.add(tortilla);

		ingredientes.add(carne);
		ingredientes.add(pescado);
		ingredientes.add(verdura);
	}

	@After
	public void tearDown() throws Exception {
		recetas = null;
		solomillo = null;
		tortilla = null;
		marmitako = null;
		ingredientes = null;
	}

	@Test
	public void testComparable() {

		// ordenar de A-Z
		Collections.sort(recetas);

		// comprobar
		assertEquals(marmitako, recetas.get(0));
		assertEquals(solomillo, recetas.get(1));
		assertEquals(tortilla, recetas.get(2));

		// ordenar de la Z-A
		Collections.sort(recetas, Collections.reverseOrder());
		assertEquals(marmitako, recetas.get(2));
		assertEquals(solomillo, recetas.get(1));
		assertEquals(tortilla, recetas.get(0));

	}

	@Test
	public void testComparator() {
		// vamos a ordenar por nivel de dificultad de Receta

		final String MSG_ERROR_DIFICULTAD = "No ordena por nivel de dificultad";

		Collections.sort(recetas, new ComparatorRecetaANivelDificultad());

		assertEquals(MSG_ERROR_DIFICULTAD, tortilla, recetas.get(0));
		assertEquals(MSG_ERROR_DIFICULTAD, solomillo, recetas.get(1));
		assertEquals(MSG_ERROR_DIFICULTAD, marmitako, recetas.get(2));
	}

	@Test
	public void testCompararNumIngredientes() {

		final String MSG_ERROR_NUM_INGREDIENTES = "No ordena por numero de ingredientes";

		Collections.sort();
		assertEquals(MSG_ERROR_NUM_INGREDIENTES, pescado, ingredientes.get(1));
		assertEquals(MSG_ERROR_NUM_INGREDIENTES, carne, ingredientes.get(2));
		assertEquals(MSG_ERROR_NUM_INGREDIENTES, verdura, ingredientes.get(3));
	}
}
