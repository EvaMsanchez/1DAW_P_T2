package es.studium.ejercicio10_Veces;

import java.util.Scanner;

public class Ejercicio10
{
	/* VECES - Realizar un programa que lea dos n�meros enteros por teclado. El primero nos dir� el n�mero de veces que 
	   debe escribirse el segundo introducido. */

	public static void main(String[] args)
	{
		int numero, veces, i;

		Scanner teclado = new Scanner (System.in);

		System.out.println("Introduce un n�mero:");
		numero = teclado.nextInt();
		System.out.println("Introduce otro n�mero:");
		veces = teclado.nextInt();
		teclado.close();

		for (i=0; i<veces; i++) 
		{
			System.out.println(numero);
		}
	}

}
