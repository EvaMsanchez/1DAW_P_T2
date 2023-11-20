package es.studium.ejercicio11_Intercambio;

import java.util.Scanner;

public class Ejercicio11_
{

	public static void main(String[] args)
	{
		int n1, n2, auxiliar1, auxiliar2;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dame el número a:");
		n1 = teclado.nextInt();
		System.out.println("Dame el número b:");
		n2 = teclado.nextInt();
		teclado.close();
		
		auxiliar1=n1;
		auxiliar2=n2;
		n1=auxiliar2;
		n2=auxiliar1;
		
		System.out.println("El nuevo valor de a es "+n1);
		System.out.println("El nuevo valor de b es "+n2);
	}

}
