package com.ipartek.formacion.animal.pojo;

import com.ipartek.formacion.recetas.pojo.InterfazEstupida;

public class Pajaro extends Animal implements Volador, Vendible, InterfazEstupida {

	private boolean puedeVolar;
	private int numHuevosSemana;

	public Pajaro() {
		super();
		this.puedeVolar = false;
	}

	public Pajaro(String raza, int precio) {
		super(raza, precio);
		this.puedeVolar = false;
		this.numHuevosSemana = 0;
	}

	public boolean isPuedeVolar() {
		return puedeVolar;
	}

	public void setPuedeVolar(boolean puedeVolar) {
		this.puedeVolar = puedeVolar;
	}

	public int getNumHuevosSemana() {
		return numHuevosSemana;
	}

	public void setNumHuevosSemana(int numHuevosSemana) {
		this.numHuevosSemana = numHuevosSemana;
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

	@Override
	public int getPeso() {
		return this.getNumHuevosSemana();
	}

}
