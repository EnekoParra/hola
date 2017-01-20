package com.ipartek.formacion.recetas.pojo.comparator;

import java.util.Comparator;

import com.ipartek.formacion.recetas.pojo.InterfazEstupida;

public class ComparadorEstupido implements Comparator<InterfazEstupida> {

	@Override
	public int compare(InterfazEstupida o1, InterfazEstupida o2) {
		return o1.getPeso() - o2.getPeso();
	}

}
