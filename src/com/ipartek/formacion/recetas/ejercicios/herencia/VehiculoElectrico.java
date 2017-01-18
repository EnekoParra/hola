package com.ipartek.formacion.recetas.ejercicios.herencia;

public class VehiculoElectrico extends Vehiculo {

	public final float MIN_CAPACIDAD_BATERIA = 300;

	private float capacidadBaterias;

	public VehiculoElectrico() {
		super();
		this.capacidadBaterias = MIN_CAPACIDAD_BATERIA;
	}

	public VehiculoElectrico(String modelo) {
		super(modelo);
		this.capacidadBaterias = MIN_CAPACIDAD_BATERIA;
	}

	public float getCapacidadBaterias() {
		return capacidadBaterias;
	}

	public void setCapacidadBaterias(float capacidadBaterias) {
		this.capacidadBaterias = capacidadBaterias;
	}

	@Override
	public void arrancar() {
		System.out.println("Bateria enchufada y a toda maquina.");
	}

	@Override
	public String toString() {
		return "VehiculoElectrico [Capacidad de la bateria=" + capacidadBaterias + "] extends " + super.toString();
	}

}
