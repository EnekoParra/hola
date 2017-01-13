package com.ipartek.formacion.hola.pojo;

public class MainReceta {

	public static void main(String[] args) {
		Ingrediente[] aIngrediente = { new Ingrediente("Patata", 4, false),
				new Ingrediente("Bonito limpio", 500, false), new Ingrediente("Cebolleta", 2, false),
				new Ingrediente("Pimientos verde", 2, false), new Ingrediente("Pimientos rojo", 0.50f, false),
				new Ingrediente("Cabeza de ajo", 1, false), new Ingrediente("Pimiento choricero", 4, false),
				new Ingrediente("Pan de sopa", 40, false), new Ingrediente("Vaso de salsa de tomate", 0.50f, false),
				new Ingrediente("Agua", 1, false), new Ingrediente("Copa de Brandy", 1, false),
				new Ingrediente("Aceite de oliva", 1, false), new Ingrediente("Sal", 1, false),
				new Ingrediente("Pimienta", 1, false), new Ingrediente("Guinda cayena", 1, false),
				new Ingrediente("Perejil", 1, true), };
		Receta marmitako = new Receta(" Marmitako", aIngrediente, 60, " Facil", 4,
				" Facil sencillo y para toda la familia");
		System.out.println(marmitako.toString());
	}
}
