package com.ipartek.formacion.recetas.pojo;

import java.util.ArrayList;

public class RecetaA implements Comparable<RecetaA> {

	public static final String FACIL = "facil";
	public static final String MODERADO = "moderado";
	public static final String DIFICIL = "dificil";

	public String IMG_DEFAULT = "http://apps.enyojs.com/assets/apps/17daydietmealplan_icon.png";

	private String titulo;
	private String imagen;
	private ArrayList<IngredienteA> ingredientes;
	private int tiempo;
	private String dificultad;
	private int comensales;
	private String descripcion;

	public RecetaA(String titulo) {
		super();
		this.titulo = titulo;
		this.imagen = IMG_DEFAULT;
		setIngredientes(null);
		this.tiempo = 0;
		this.comensales = 0;
		this.dificultad = "facil";
		this.descripcion = "Lorem ipsum....";
	}

	public RecetaA(String titulo, ArrayList<IngredienteA> ingredientes) {
		super();
		this.titulo = titulo;
		this.imagen = IMG_DEFAULT;
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
			for (IngredienteA i : this.ingredientes) {
				if (i.isGluten()) {
					resul = false;
					break;
				}
			}
		}
		return resul;
	}

	/**
	 * Comprueba si contiene el {@code Ingrediente} pasado como parametro
	 * 
	 * @param ingrendiente
	 *            {@code Ingrediente} a buscar
	 * @return true si contiene ingrediente<br>
	 *         false en caso contrario
	 */
	public boolean contiene(IngredienteA ingrendiente) {
		boolean resul = false;
		if (ingrendiente != null) {
			final String NOMBRE_RECETA_BUSCAR = ingrendiente.getNombre();
			for (IngredienteA iterateIngredient : ingredientes) {
				if (NOMBRE_RECETA_BUSCAR.equalsIgnoreCase(iterateIngredient.getNombre())) {
					resul = true;
					break;
				}
			}
		}
		return resul;
	}

	/**
	 * TODO cuando sea null lanzar Exception personalizada<br>
	 * A�adimos un nuevo {@code Ingrediente} a la receta
	 * 
	 * @param ingrendiente
	 *            si es null no hace nada
	 */
	public void addIngrendiente(IngredienteA ingrendiente) {
		if (ingrendiente != null) {
			this.ingredientes.add(ingrendiente);
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
	public boolean removeIngrendiente(IngredienteA ingrendiente) {
		boolean resul = false;
		if (ingrendiente != null) {
			final String NOMBRE_INGREDIENTE_ELIMINAR = ingrendiente.getNombre();
			IngredienteA iterateIngredient = null;
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

	public ArrayList<IngredienteA> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<IngredienteA> ingredientes) {

		this.ingredientes = (ingredientes == null) ? new ArrayList<IngredienteA>() : ingredientes;
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

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	@Override
	public String toString() {
		return "Receta [titulo=" + titulo + ", imagen=" + imagen + ", ingredientes=" + ingredientes + ", tiempo="
				+ tiempo + ", dificultad=" + dificultad + ", comensales=" + comensales + ", descripcion=" + descripcion
				+ "]";
	}

	@Override
	public int compareTo(RecetaA o) {
		// pasamos a toLowerCase, para ignorar mayusculas y minusculas
		return this.getTitulo().toLowerCase().compareTo(o.getTitulo().toLowerCase());
	}

}
