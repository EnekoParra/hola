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

		Libro[] array = new Libro[10];

		array[0] = new Libro("AMOR Y ASCO", "@SRTABEBI", 232); // libro1;
		array[1] = new Libro("ANIMALES FANTASTICOS Y DONDE ENCONTRARLOS ", "J.K. ROWLING", 256);// libro2;
		array[2] = new Libro("EL LABERINTO DE LOS ESPIRITUS", "CARLOS RUIZ ZAFON", 928);// libro3;
		array[3] = new Libro("CUANDO ABRES EL PARACAIDAS", "DEFREDS JOSE. A. GOMEZ IGLESIAS", 216); // libro4;
		array[4] = new Libro("TODO ESTO TE DARE", "DOLORES REDONDO", 624); // libro5;
		array[5] = new Libro("SE PROHIBE MANTENER AFECTADOS DESMEDIDOS EN LA PUERTA DE LA PENSION", "MAMEN SANCHEZ",
				304);
		array[6] = new Libro("CASI SIN QUERER", "DEFREDS JOSE A. GOMEZ IGLESIAS", 184);
		array[7] = new Libro("PATRIA", "FERNANDO ARAMBURU", 648);
		array[8] = new Libro("CASI SIN QUERER", "DEFREDS JOSE A. GOMEZ IGLESIAS", 172);
		array[9] = new Libro("CON TAL DE VERTE VOLAR", "MIGUEL GANE", 240);

		for (int i = 0; i < 10; i++) {

			System.out.println(array[i].toString());

		}
	}
}