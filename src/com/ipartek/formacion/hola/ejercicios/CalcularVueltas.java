package com.ipartek.formacion.hola.ejercicios;

public class CalcularVueltas {

	public static void main(String[] args) {
		float compra = (float) 1326.24;
		float pago = 4 * 500;
		float vueltas = pago - compra;
		int cincuentaB = 50;
		int veinteB = 20;
		int diezB = 10;
		int cincoB = 5;
		int dosE = 2;
		int unE = 1;
		float cincuentacM = (float) 0.5;
		int cincuentaceM = 0;
		float veintecM = (float) 0.2;
		int veinteceM = 0;
		float diezcM = (float) 0.1;
		int diezceM = 0;
		float cincocM = (float) 0.05;
		int cincoceM = 0;
		float doscM = (float) 0.02;
		int dosceM = 0;
		float uncM = (float) 0.01;
		int unceM = 0;
		int cuenta = 0;
		float resto = 0;

		cincuentaB = (int) vueltas / cincuentaB;
		cuenta = (int) vueltas - (cincuentaB * 50);
		veinteB = cuenta / veinteB;
		cuenta = cuenta - (veinteB * 20);
		diezB = cuenta / diezB;
		cuenta = cuenta - (diezB * 10);
		cincoB = cuenta / cincoB;
		cuenta = cuenta - (cincoB * 5);
		dosE = cuenta / dosE;
		cuenta = cuenta - (dosE * 2);
		unE = cuenta / unE;

		resto = (pago - compra)
				- ((cincuentaB * 50) + (veinteB * 20) + (diezB * 10) + (cincoB * 5) + (dosE * 2) + (unE));

		cincuentacM = (int) (resto / cincuentacM);
		cincuentaceM = (int) cincuentacM;

		resto = (float) (resto - (cincuentacM * 0.50));

		veintecM = (int) (resto / veintecM);
		veinteceM = (int) veintecM;

		resto = (float) (resto - (veintecM * 0.20));

		diezcM = (int) (resto / diezcM);
		diezceM = (int) diezcM;

		resto = (float) (resto - (diezcM * 0.10));

		cincocM = (int) (resto / cincocM);
		cincoceM = (int) cincocM;

		resto = (float) (resto - (cincocM * 0.05));

		doscM = (int) (resto / doscM);
		dosceM = (int) doscM;

		resto = (float) (resto - (doscM * 0.02));

		uncM = (int) (resto / uncM);
		unceM = (int) uncM;

		resto = (float) (resto - (uncM * 0.01));

		System.out.println("------------------------------");
		System.out.println("--------  RESULTADO  ---------");
		System.out.println("------------------------------");
		System.out.println("PAGO: " + compra + " €");
		System.out.println("RETORNO: " + (pago - compra) + " €");
		System.out.println("------------------------------");
		System.out.println("Las vueltas: ");
		System.out.println("------------------------------");
		System.out.println("- Gracias por su visita -");
		System.out.println("------------------------------");
		System.out.println("------- VUELTAS EN: ----------");
		System.out.println("En " + cincuentaB + " Billetes de 50.");
		System.out.println("En " + veinteB + " Billetes de 20.");
		System.out.println("En " + diezB + " Billetes de 10.");
		System.out.println("En " + cincoB + " Billetes de 5.");
		System.out.println("En " + dosE + " Monedas de 2 euros.");
		System.out.println("En " + unE + " Monedas de 1 euro.");
		System.out.println("En " + cincuentaceM + " Monedas de 0,50 centimos.");
		System.out.println("En " + veinteceM + " Monedas de 0,20 centimos.");
		System.out.println("En " + diezceM + " Monedas de 0,10 centimos.");
		System.out.println("En " + cincoceM + " Monedas de 0,05 centimos.");
		System.out.println("En " + dosceM + " Monedas de 0,02 centimos.");
		System.out.println("En " + unceM + " Monedas de 0,01 centimos.");
	}

}
