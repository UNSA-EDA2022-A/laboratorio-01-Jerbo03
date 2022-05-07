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
		// TO DO
		return "El numero proporcionado no esta en base Gabriel.";
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
	
}
