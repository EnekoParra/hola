package com.ipartek.formacion.recetas.ejercicios.herencia;

public class Pajaro extends Animal implements Volador, Vendible {

	private boolean puedeVolar;

	public Pajaro() {
		super();
		this.puedeVolar = false;
	}

	public Pajaro(String raza, int precio) {
		super(raza, precio);
	}

	public boolean isPuedeVolar() {
		return puedeVolar;
	}

	public void setPuedeVolar(boolean puedeVolar) {
		this.puedeVolar = puedeVolar;
	}

	@Override
	public void despegar() {
		System.out.println("Pajaro despegando.");

	}

	@Override
	public void aterrizar() {
		System.out.println("Pajaro aterrizando");

	}

	@Override
	public void generarFactura() {
		System.out.println("Factura generada");
	}

	@Override
	public String toString() {
		return "Pajaro [puedeVolar=" + puedeVolar + "]" + super.toString();
	}

}
