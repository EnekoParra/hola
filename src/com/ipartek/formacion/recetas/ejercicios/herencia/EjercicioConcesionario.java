package com.ipartek.formacion.recetas.ejercicios.herencia;

import java.util.ArrayList;

public class EjercicioConcesionario {

	/**
	 * Listar todos los Vehiculos del concesionario.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Vehiculo prius = new Vehiculo();
		prius.setModelo("Prius");
		prius.setPlazas(5);
		prius.setDimensiones(0);
		prius.setPotencia(300);
		System.out.println(prius.toString());

		Vehiculo ibiza = new Vehiculo();
		ibiza.setModelo("Ibiza");
		ibiza.setPlazas(5);
		ibiza.setDimensiones(0);
		ibiza.setPotencia(500);
		System.out.println(ibiza.toString());

		Vehiculo fiesta = new Vehiculo();
		fiesta.setModelo("Ford Fiesta");
		fiesta.setPlazas(4);
		fiesta.setDimensiones(0);
		fiesta.setPotencia(100);
		System.out.println(fiesta.toString());

		VehiculoElectrico tesla = new VehiculoElectrico();
		tesla.setModelo("Tesla");
		tesla.setPlazas(5);
		tesla.setDimensiones(0);
		tesla.setPotencia(150);
		tesla.setCapacidadBaterias(500);
		System.out.println(tesla.toString());

		VehiculoDiesel xsara = new VehiculoDiesel();
		xsara.setModelo("Citroen Xsara");
		xsara.setPlazas(5);
		xsara.setDimensiones(0);
		xsara.setPotencia(100);
		xsara.setCombustible(95);
		System.out.println(xsara.toString());

		VehiculoDiesel astra = new VehiculoDiesel();
		astra.setModelo("Opel Astra");
		astra.setPlazas(5);
		astra.setDimensiones(0);
		astra.setPotencia(120);
		astra.setCombustible(98);
		System.out.println(astra.toString());

		// Otra manera de sacar por pantalla los coches.
		ArrayList<Vehiculo> stock = new ArrayList<Vehiculo>();
		stock.add(prius);
		stock.add(ibiza);
		stock.add(fiesta);
		stock.add(tesla);
		stock.add(xsara);
		stock.add(astra);

		for (Vehiculo vehiculo : stock) {
			System.out.println();
			System.out.println(vehiculo.getModelo());

			if (vehiculo instanceof VehiculoElectrico) {
				System.out.println("Capacidad bateria: " + ((VehiculoElectrico) vehiculo).getCapacidadBaterias());
			} else if (vehiculo instanceof VehiculoDiesel) {
				System.out.println("Combustible: " + ((VehiculoDiesel) vehiculo).getCombustible());

			}
			// Otra
			System.out.println(vehiculo.toString());
		}
	}

}
