package com.ipartek.formacion.hola.pojo;

import java.util.ArrayList;

public class Receta {

	private String titulo;
	// private Ingrediente[] ingredientes;
	private ArrayList<Ingrediente> ingredientes;
	private int tiempo;
	private String dificultad;
	private int comensales;
	private String descripcion;

	public Receta(String titulo, ArrayList<Ingrediente> ingredientes) {
		super();
		this.titulo = titulo;
		// this.ingredientes = ingredientes;
		setIngredientes(ingredientes);
		this.tiempo = 0;
		this.comensales = 0;
		this.dificultad = "facil";
		this.descripcion = "Lorem ipsum....";
	}

	/**
	 * Nos indica si la receta esta libre de ingredientes con gluten
	 * 
	 * @return true si todos los ingredientes no contienen gluten <br>
	 *         false si alguno de los ingredientes contienen gluten <br>
	 *         true si no existen ingredientes
	 */
	public boolean isGlutenFree() {
		boolean resul = true;
		if (this.ingredientes != null) {
			for (Ingrediente i : this.ingredientes) {
				if (i.isGluten()) {
					resul = false;
					break;
				}
			}
		}
		return resul;
	}

	/**
	 * Comprueba si contiene el {@code Ingrediente} pasado como parametro.
	 * 
	 * @param ingrediente
	 *            a buscar
	 * @return true si contiene ingrediente<br>
	 *         false en caso contrario.
	 */
	public boolean contiene(Ingrediente ingrediente) {
		boolean resul = false;

		if (ingredientes != null) {
			final String NOMBRE_INGREDIENTE_BUSCAR = ingrediente.getNombre();
			Ingrediente iterateIngredient = null;
			for (int i = 0; i < this.ingredientes.size(); i++) {
				iterateIngredient = this.ingredientes.get(i);
				if (NOMBRE_INGREDIENTE_BUSCAR.equalsIgnoreCase(iterateIngredient.getNombre())) {
					resul = true;
					break;

				} // if
			} // for

		} // if

		return resul;
	}// boolean

	/**
	 * 
	 * TODO cuando sea null lanzar Exception personalizada.
	 * 
	 * A�adimos un nuevo {@codeIngrediente} a la receta.
	 * 
	 * @param ingrendiente
	 *            si es null no hace nada
	 */

	public void addIngrendiente(Ingrediente ingrediente) {
		if (ingrediente != null) {
			this.ingredientes.add(ingrediente);
		}
	}

	/**
	 * Eliminar el primer ingrendiente que encuentre con el mismo
	 * <ode>nombre</code> CaseInsesitive
	 * 
	 * @param ingrendiente
	 *            ingrediente a eliminar
	 * @return true si eliminar ingrediente<br>
	 *         false en caso contrario
	 */
	public boolean removeIngrendiente(Ingrediente ingrediente) {

		boolean resul = false;

		if (ingrediente != null) {
			final String NOMBRE_INGREDIENTE_ELIMINAR = ingrediente.getNombre();
			Ingrediente iterateIngredient = null;
			for (int i = 0; i < this.ingredientes.size(); i++) {
				iterateIngredient = this.ingredientes.get(i);

				if (NOMBRE_INGREDIENTE_ELIMINAR.equalsIgnoreCase(iterateIngredient.getNombre())) {
					this.ingredientes.remove(i);
					resul = true;
					break;
				}
			} // end for
		} // end if
		return resul;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
		this.ingredientes = (ingredientes == null) ? new ArrayList<>() : ingredientes;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public String getDificultad() {
		return dificultad;
	}

	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}

	public int getComensales() {
		return comensales;
	}

	public void setComensales(int comensales) {
		this.comensales = comensales;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "RecetaA [titulo=" + titulo + ", ingredientes=" + ingredientes + ", tiempo=" + tiempo + ", dificultad="
				+ dificultad + ", comensales=" + comensales + ", descripcion=" + descripcion + "]";
	}

}
