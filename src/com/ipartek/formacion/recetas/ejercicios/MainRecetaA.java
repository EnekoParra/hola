package com.ipartek.formacion.recetas.ejercicios;

import java.util.ArrayList;

import com.ipartek.formacion.recetas.pojo.IngredienteA;
import com.ipartek.formacion.recetas.pojo.RecetaA;

public class MainRecetaA {

	public static void main(String[] args) {

		// Crear Ingredientes
		ArrayList<IngredienteA> ingredientes = new ArrayList<IngredienteA>();
		ingredientes.add(new IngredienteA("Pimiento verde", 0.5f, true));
		ingredientes.add(new IngredienteA("Bonito", 500, true));
		ingredientes.add(new IngredienteA("Pimiento choricero", 4, false));
		ingredientes.add(new IngredienteA("Vaso de salsa de tomate", 0.50f, false));
		ingredientes.add(new IngredienteA("Bonito", 500, true));
		ingredientes.add(new IngredienteA("Copa de Brandy", 1, false));
		ingredientes.add(new IngredienteA("Aceite de oliva", 1, false));
		ingredientes.add(new IngredienteA("Sal", 1, false));
		ingredientes.add(new IngredienteA("Pimienta", 1, false));
		ingredientes.add(new IngredienteA("Guinda cayena", 1, false));
		ingredientes.add(new IngredienteA("Perejil", 1, true));

		// Crear Receta

		RecetaA marmitako = new RecetaA("Marmitako", ingredientes);
		marmitako.setComensales(16);
		marmitako.setDificultad("Dificil");
		marmitako.setTiempo(90);

		RecetaA solomillo = new RecetaA("Solomillo", ingredientes);
		solomillo.setComensales(16);
		solomillo.setDificultad("Moderada");
		solomillo.setTiempo(20);

		RecetaA tortilla = new RecetaA("Tortilla", ingredientes);
		tortilla.setComensales(16);
		tortilla.setDificultad("Facil");
		tortilla.setTiempo(30);
		ArrayList<RecetaA> recetas = new ArrayList<RecetaA>();

		recetas.add(marmitako);
		recetas.add(solomillo);
		recetas.add(tortilla);

		// Mostrar por pantalla

		// if (!marmitako.isGlutenFree()) {
		// System.out.println("***CONTIENE GLUTEN, atención alergicos.");
		// }
		System.out.println(marmitako.toString());
		System.out.println(solomillo.toString());
		System.out.println(tortilla.toString());
	}

}
