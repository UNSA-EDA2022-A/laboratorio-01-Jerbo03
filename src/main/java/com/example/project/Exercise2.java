package com.example.project;

import java.util.Scanner;

public class Exercise2 {

	public static void main(final String[] args) {

		Exercise2 obj = new Exercise2();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int a [] = new int [7];
			for(int i = 0; i < 7; i++){
				int n = sc.nextInt();
				a[i] = n;
			}
			System.out.println(obj.getMenorNumeroSaltos(a));			
		}
	}

	public Integer getMenorNumeroSaltos(int a []) {
		int prev = 0; // Almacenará los valores anteriores a cada salto
		for (int i = 0; i < a.length; i++) {
			//Numero de saltos necesarios para llegar a la distancia a[i], menos 1 salto: a[i] / 50
			if (a[i] / 50 - prev > 1) return -1;  // Si de la anterior distancia a la actual se necesitan más de un salto, entonces es imposible
			prev = a[i] / 50;
		}
		return a[a.length - 1] / 50 + 1; //La distancia requerida para llegar al final siempre y cuando se halla un camino en medio
	}
}
