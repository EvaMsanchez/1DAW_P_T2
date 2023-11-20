package es.studium.ejercicio18_Operaciones;

import java.util.Scanner;

public class Ejercicio18
{
	/* OPERACIONES - Realizar un programa que lea dos números enteros por teclado y calcule su suma, su resta, su producto
	   y su cociente cuando fuera posible. */

	public static void main(String[] args)
	{
		int numero1, numero2, suma, resta, producto;
		float cociente;

		Scanner teclado = new Scanner (System.in);

		System.out.println("Dame un número:");
		numero1 = teclado.nextInt();
		System.out.println("Dame otro número:");
		numero2 = teclado.nextInt();
		teclado.close();

		System.out.println("Las operaciones son:");

		suma = numero1 + numero2;
		System.out.println("La suma: " +suma);

		resta = numero1 - numero2;
		System.out.println("La resta: "+resta);

		producto = numero1*numero2;
		System.out.println("El producto: "+producto);

		if (numero2!=0) //!= distinto
		{
			cociente = (float)numero1/(float)numero2;
			System.out.println("El cociente: "+cociente);
		}
		else
		{
			System.out.println("La división por 0 no es posible");
		}
	}

}
