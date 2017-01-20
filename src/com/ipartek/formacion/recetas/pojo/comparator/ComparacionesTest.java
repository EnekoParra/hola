package com.ipartek.formacion.recetas.pojo.comparator;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ipartek.formacion.animal.pojo.Pajaro;
import com.ipartek.formacion.recetas.pojo.InterfazEstupida;
import com.ipartek.formacion.recetas.pojo.RecetaA;
import com.ipartek.formacion.vehiculos.pojo.Vehiculo;

public class ComparacionesTest {

	ArrayList<RecetaA> recetas = new ArrayList<RecetaA>();
	RecetaA solomillo = new RecetaA("solomillo");
	RecetaA marmitako = new RecetaA("marmitako");
	RecetaA tortilla = new RecetaA("Torilla Patatas");

	private ArrayList<InterfazEstupida> listadoEStupido = null;
	private Vehiculo vSeat = null;
	private Vehiculo vFord = null;
	private Pajaro pKiwi = null;
	private Pajaro pGallina = null;

	@Before
	public void setUp() throws Exception {
		solomillo.setDificultad(RecetaA.MODERADO);
		marmitako.setDificultad(RecetaA.DIFICIL);
		tortilla.setDificultad(RecetaA.FACIL);

		recetas.add(solomillo);
		recetas.add(marmitako);
		recetas.add(tortilla);

		listadoEStupido = new ArrayList<InterfazEstupida>();
		vSeat = new Vehiculo("Seat");
		vSeat.setPotencia(500);

		vFord = new Vehiculo("Ford K");
		vFord.setPotencia(100);

		pKiwi = new Pajaro("Kiwi", 0);
		pKiwi.setNumHuevosSemana(2);

		pGallina = new Pajaro("Gallina", 0);
		pGallina.setNumHuevosSemana(700);

		listadoEStupido.add((InterfazEstupida) vSeat);
		listadoEStupido.add((InterfazEstupida) vFord);
		listadoEStupido.add(pKiwi);
		listadoEStupido.add(pGallina);
	}

	@After
	public void tearDown() throws Exception {
		recetas = null;
		solomillo = null;
		tortilla = null;
		marmitako = null;

		listadoEStupido = null;
		vSeat = null;
		pKiwi = null;
		vFord = null;
		pGallina = null;
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

		final String MSG_ERROR_DIFICULTAD = "NO ordena por nivel de dificultad";

		Collections.sort(recetas, new ComparatorRecetaANivelDificultad());

		assertEquals(MSG_ERROR_DIFICULTAD, tortilla, recetas.get(0));
		assertEquals(MSG_ERROR_DIFICULTAD, solomillo, recetas.get(1));
		assertEquals(MSG_ERROR_DIFICULTAD, marmitako, recetas.get(2));

	}

	@Test
	public void testOrdenacionEstupida() {

		// TODO Ordenar de menor a mayor
		Collections.sort(listadoEStupido, new ComparadorEstupido());

		assertEquals(pKiwi, listadoEStupido.get(0));
		assertEquals(vFord, listadoEStupido.get(1));
		assertEquals(vSeat, listadoEStupido.get(2));
		assertEquals(pGallina, listadoEStupido.get(3));

	}
}