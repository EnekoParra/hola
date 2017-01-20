package com.ipartek.formacion.animal.ejercicios;

import java.util.ArrayList;

import com.ipartek.formacion.animal.pojo.Burro;
import com.ipartek.formacion.animal.pojo.Pajaro;
import com.ipartek.formacion.animal.pojo.Vendible;

/**
 * Ejercicio apra aprender a usar la Herencia e interfaces.<br>
 * Capitulo 8 del Libro Java 7.<br>
 * 
 * @author curso
 *
 */
public class ListaAnimalesTienda {

	public static void main(String[] args) {

		// Crear objetos

		Burro animal1 = new Burro();
		animal1.setRaza("Burro1");
		animal1.setPrecio(20);
		animal1.setNombre("Benito");

		Pajaro animal2 = new Pajaro();
		animal2.setRaza("Pajaro2");
		animal2.setPrecio(10);
		animal2.setPuedeVolar(true);

		Pajaro animal3 = new Pajaro();
		animal3.setRaza("Pajaro3");
		animal3.setPrecio(1500);
		animal3.setPuedeVolar(false);

		// Añadir en ArrayList

		ArrayList<Vendible> animales = new ArrayList<Vendible>();
		animales.add(animal1);
		animales.add(animal2);
		animales.add(animal3);

		// Mosrar por pantalla
		Burro b = null;
		Pajaro p = null;

		for (Vendible vendible : animales) {

			if (vendible instanceof Burro) {
				b = (Burro) vendible;
				System.out.println(b.getRaza() + "[" + b.getNombre() + "]");
				System.out.println("Precio: " + b.getPrecio());
				System.out.println("Comestible: Si");
				System.out.println("Volador: No");

			} else if (vendible instanceof Pajaro) {
				p = (Pajaro) vendible;
				System.out.println(p.getRaza());
				System.out.println("Precio: " + p.getPrecio());
				System.out.println("Comestible: No");

				if (p.isPuedeVolar()) {
					System.out.println("Volador: Si");
				} else {
					System.out.println("Volador: No");
				}

			} else {
				System.out.println("*** No sabemos que eres ***" + vendible.toString());
			}

		}
	}
}