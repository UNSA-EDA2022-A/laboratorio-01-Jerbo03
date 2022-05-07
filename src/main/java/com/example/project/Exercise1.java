package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.convertirBaseGabriel(n));			
		}
	}

	public String convertirBaseGabriel(int a) {
		int Estado = 0;
		int k = 0;
		int conversión = 0;
		while (Math.pow(10,k) < a) {
			Estado = comptobarNúmero(Estado, a % 10);
			if (Estado == -1) return "El numero proporcionado no esta en base Gabriel.";
			conversión += convertir(a % 10, k);
		}
		return conversión;		
	}
	
	public int comprobarNúmero(int Estado, int n) {
		switch(Estado) {
			case 0:
				if (n == 0) return 0;
				if (n <= 2) return 1;
				return -1;
			case 1:
				if (n < 2) return 1;
				return -1;
		}
	}
	
	public int convertir(int n, int k) {
		return Math.pow(n, k+1) - 1;
	}
	
}
