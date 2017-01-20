package com.ipartek.formacion.recetas.ejercicios;

import java.util.ArrayList;

import com.ipartek.formacion.recetas.pojo.Ingrediente;
import com.ipartek.formacion.recetas.pojo.Receta;

public class MainReceta {

	public static void main(String[] args) {

		// Crear Ingredientes
		ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
		ingredientes.add(new Ingrediente("Pimiento verde", 0.5f, true));
		ingredientes.add(new Ingrediente("Bonito", 500, true));
		ingredientes.add(new Ingrediente("Pimiento choricero", 4, false));
		ingredientes.add(new Ingrediente("Vaso de salsa de tomate", 0.50f, false));
		ingredientes.add(new Ingrediente("Bonito", 500, true));
		ingredientes.add(new Ingrediente("Copa de Brandy", 1, false));
		ingredientes.add(new Ingrediente("Aceite de oliva", 1, false));
		ingredientes.add(new Ingrediente("Sal", 1, false));
		ingredientes.add(new Ingrediente("Pimienta", 1, false));
		ingredientes.add(new Ingrediente("Guinda cayena", 1, false));
		ingredientes.add(new Ingrediente("Perejil", 1, true));

		// Crear Receta
		Receta marmitako = new Receta("Marmitako by Karlos Arguiñano", ingredientes);
		marmitako.setComensales(16);
		marmitako.setDificultad("Moderada");
		marmitako.setTiempo(90);

		// Mostrar por pantalla

		System.out.println("Marmitako rico rico, la receta es:");
		// if (!marmitako.isGlutenFree()) {
		// System.out.println("***CONTIENE GLUTEN, atención alergicos.");
		// }
		System.out.println(marmitako.toString());

	}

}