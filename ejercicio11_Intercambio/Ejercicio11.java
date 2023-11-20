package es.studium.ejercicio11_Intercambio;

import java.util.Scanner;

public class Ejercicio11
{
	/* INTERCAMBIO - Realizar un programa que lea dos números por teclado e intercambie sus valores. (2 versiones). */

	public static void main(String[] args)
	{
		int n1, n2, auxiliar;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dame el número a:");
		n1 = teclado.nextInt();
		System.out.println("Dame el número b:");
		n2 = teclado.nextInt();
		teclado.close();
		
		auxiliar=n1;
		n1=n2;
		n2=auxiliar;
		
		System.out.println("El nuevo valor de a es "+n1);
		System.out.println("El nuevo valor de b es "+n2);
	}

}
