package com.ipartek.formacion.recetas.pojo.comparator;

import java.util.Comparator;

import com.ipartek.formacion.recetas.pojo.RecetaA;

public class ComparatorRecetaANivelDificultad implements Comparator<RecetaA> {

	@Override
	public int compare(RecetaA o1, RecetaA o2) {
		return getPesoDificultad(o1) - getPesoDificultad(o1);
	}

	private int getPesoDificultad(RecetaA r) {
		int resul = 0;

		switch (r.getDificultad()) {
		case RecetaA.FACIL:
			resul = 0;
			break;
		case RecetaA.MODERADO:
			resul = 5;
			break;
		case RecetaA.DIFICIL:
			resul = 10;
			break;

		default:
			break;

		}
		return resul;
	}

}
