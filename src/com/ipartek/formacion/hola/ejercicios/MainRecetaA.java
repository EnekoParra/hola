package com.ipartek.formacion.hola.ejercicios;

import java.util.ArrayList;

import com.ipartek.formacion.hola.pojo.IngredienteA;
import com.ipartek.formacion.hola.pojo.RecetaA;

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
		RecetaA marmitako = new RecetaA("Marmitako by Karlos Arguiñano", ingredientes);
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
