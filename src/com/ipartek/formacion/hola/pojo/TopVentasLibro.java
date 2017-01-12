package com.ipartek.formacion.hola.pojo;

public class TopVentasLibro {
	public static void main(String[] args) {

		// Libro libro1 = new Libro("AMOR Y ASCO", "@SRTABEBI", 232);
		// Libro libro2 = new Libro("ANIMALES FANTASTICOS Y DONDE ENCONTRARLOS
		// ", "J.K. ROWLING", 256);
		// Libro libro3 = new Libro("EL LABERINTO DE LOS ESPIRITUS", "CARLOS
		// RUIZ ZAFON", 928);
		// Libro libro4 = new Libro("CUANDO ABRES EL PARACAIDAS", "DEFREDS JOSE.
		// A. GOMEZ IGLESIAS", 216);
		// Libro libro5 = new Libro("TODO ESTO TE DARE", "DOLORES REDONDO",
		// 624);

		Libro[] array = new Libro[5];

		array[0] = new Libro("AMOR Y ASCO", "@SRTABEBI", 232); // libro1;
		array[1] = new Libro("ANIMALES FANTASTICOS Y DONDE ENCONTRARLOS ", "J.K. ROWLING", 256);// libro2;
		array[2] = new Libro("EL LABERINTO DE LOS ESPIRITUS", "CARLOS RUIZ ZAFON", 928);// libro3;
		array[3] = new Libro("CUANDO ABRES EL PARACAIDAS", "DEFREDS JOSE. A. GOMEZ IGLESIAS", 216); // libro4;
		array[4] = new Libro("TODO ESTO TE DARE", "DOLORES REDONDO", 624); // libro5;

		for (int i = 0; i < 5; i++) {

			System.out.println(array[i].toString());

		}
	}
}