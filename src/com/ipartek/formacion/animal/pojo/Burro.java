package com.ipartek.formacion.animal.pojo;

import java.util.ArrayList;

import com.ipartek.formacion.recetas.pojo.Cocinable;
import com.ipartek.formacion.recetas.pojo.Ingrediente;
import com.ipartek.formacion.vehiculos.pojo.Conducible;

public class Burro extends Animal implements Conducible, Cocinable, Vendible {

	private String nombre;

	public Burro() {
		this.nombre = "";
	}

	public Burro(String raza, int precio) {
		super(raza, precio);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void arrancar() {
		System.out.println("Arre burro");

	}

	@Override
	public void detener() {
		System.out.println("Soooo..");
	}

	@Override
	public void girar(String direccion) {
		System.out.println("Giro a " + direccion);

	}

	@Override
	public ArrayList<Ingrediente> getIngredientes() {
		return new ArrayList<Ingrediente>();
	}

	@Override
	public String getDescripcionReceta() {
		return "Sal pimentar y a la cazuela";
	}

	@Override
	public void generarFactura() {
		System.out.println("Factura generada.");
	}

	@Override
	public String toString() {
		return "Burro [nombre=" + nombre + "]" + super.toString();
	}

}
