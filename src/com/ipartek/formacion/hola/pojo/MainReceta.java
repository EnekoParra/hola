package com.ipartek.formacion.hola.pojo;

public class MainReceta {

	public static void main(String[] args) {
		Ingrediente[] aIngrediente = { new Ingrediente("Patata", 4, false),
				new Ingrediente("Bonito limpio", 500, false) };
		Receta marmitako = new Receta("Marmitako", aIngrediente, 60, "Facil", 4,
				"Facil sencillo y para toda la familia");
		System.out.println(marmitako.toString());
	}
}
