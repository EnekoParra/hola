package com.ipartek.formacion.vehiculos.pojo;

public class VehiculoDiesel extends Vehiculo {

	public final float MIN_COMBUSTIBLE = 90;

	private float combustible;

	public VehiculoDiesel() {
		super();
		this.combustible = MIN_COMBUSTIBLE;
	}

	public VehiculoDiesel(String modelo) {
		super(modelo);
		this.combustible = MIN_COMBUSTIBLE;

	}

	public float getCombustible() {
		return combustible;
	}

	public void setCombustible(float combustible) {
		this.combustible = combustible;
	}

	@Override
	public void arrancar() {
		// super.arrancar();
		System.out.println("Arrancando Super Velocidad..");
	}

	@Override
	public String toString() {
		return "VehiculoDiesel [Combustible=" + combustible + "] extends " + super.toString();
	}

}
