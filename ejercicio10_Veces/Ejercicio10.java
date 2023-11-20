package es.studium.ejercicio10_Veces;

import java.util.Scanner;

public class Ejercicio10
{
	/* VECES - Realizar un programa que lea dos números enteros por teclado. El primero nos dirá el número de veces que 
	   debe escribirse el segundo introducido. */

	public static void main(String[] args)
	{
		int numero, veces, i;

		Scanner teclado = new Scanner (System.in);

		System.out.println("Introduce un número:");
		numero = teclado.nextInt();
		System.out.println("Introduce otro número:");
		veces = teclado.nextInt();
		teclado.close();

		for (i=0; i<veces; i++) 
		{
			System.out.println(numero);
		}
	}

}
