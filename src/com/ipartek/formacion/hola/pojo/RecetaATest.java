package com.ipartek.formacion.hola.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RecetaATest {

	// Variables globales, se inicializan en "setUp".
	public RecetaA tortillaPatatas;
	public IngredienteA huevos = new IngredienteA("Huevos", 12, true);
	public IngredienteA cebolla = new IngredienteA("Cebolla", 1, true);
	public IngredienteA patatas = new IngredienteA("Patatas", 4, true);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {

	}

	@Before
	public void setUp() throws Exception {
		tortillaPatatas = new RecetaA("Tortilla de patatas", null);
		tortillaPatatas.addIngrendiente(huevos);
		tortillaPatatas.addIngrendiente(cebolla);
		tortillaPatatas.addIngrendiente(patatas);
	}

	@After
	public void tearDown() throws Exception {
		tortillaPatatas = null;

	}

	@Test
	public void testConstructor() {
		RecetaA r = new RecetaA("Tortilla patatas", null);

		assertNotNull("Deberia de estar inicializado a new", r.getIngredientes());
	}

	@Test
	public void testAddIngredienteA() {
		RecetaA r = new RecetaA("Tortilla patatas", null);
		int numero = r.getIngredientes().size();
		assertEquals("No debe existir ingredientes", 0, numero);

		r.addIngrendiente(null);
		numero = r.getIngredientes().size();
		assertEquals("No debe existir ingredientes", 0, numero);

		r.addIngrendiente(new IngredienteA("", 0, true));
		numero = r.getIngredientes().size();
		assertEquals(1, numero);
	}

	@Test
	public void testRemoveIngredienteA() {
		RecetaA r = new RecetaA("Tortilla patatas", null);
		assertFalse(r.removeIngrendiente(null));

		tortillaPatatas.addIngrendiente(huevos);

		huevos.setNombre("HueVos");
		tortillaPatatas.removeIngrendiente(huevos);

		ArrayList<IngredienteA> ingredientes = tortillaPatatas.getIngredientes();
		assertEquals(3, ingredientes.size());

		// TODO Comprobar que sean huevo, cebolla y patatas.
		assertFalse(tortillaPatatas.contiene(null));
		assertFalse(tortillaPatatas.contiene(new IngredienteA("Salmonela", 2, true)));
		assertTrue(tortillaPatatas.contiene(huevos));
		assertTrue(tortillaPatatas.contiene(cebolla));
		assertTrue(tortillaPatatas.contiene(patatas));
	}

	@Test
	public void testIsGlutenFree() {

		ArrayList<IngredienteA> ingredientes = new ArrayList<IngredienteA>();
		ingredientes.add(new IngredienteA("Pimiento verde", 0.5f, true));
		ingredientes.add(new IngredienteA("Bonito", 500, true));

		// caso1 todos los ingredientes con gluten
		RecetaA r = new RecetaA("", ingredientes);
		assertFalse("caso1 todos los ingredientes con gluten", r.isGlutenFree());

		// caso2 todos los ingredientes SIN gluten
		ingredientes.clear();
		ingredientes.add(new IngredienteA("", 0, false));
		ingredientes.add(new IngredienteA("", 0, false));

		r = new RecetaA("", ingredientes);
		assertTrue("caso2 todos los ingredientes SIN gluten", r.isGlutenFree());

		// caso3 todos los ingredientes con y sin gluten
		ingredientes.clear();
		ingredientes.add(new IngredienteA("", 0, true));
		ingredientes.add(new IngredienteA("", 0, false));

		r = new RecetaA("", ingredientes);
		assertFalse("caso3 todos los ingredientes con y sin gluten", r.isGlutenFree());

		// caso4 sin ingredientes (null)
		r = new RecetaA("", null);
		assertTrue("caso4 sin ingredientes", r.isGlutenFree());

	}

}
