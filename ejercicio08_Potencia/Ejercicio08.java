package es.studium.ejercicio08_Potencia;

import java.util.Scanner;

public class Ejercicio08
{
	/* POTENCIA - Realizar un programa que calcule la potencia de un número leyendo por teclado el valor de su base y su exponente. */

	public static void main(String[] args)
	{
		int base, exponente, resultado = 1, i;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Dame la base:");
		base = teclado.nextInt();
		System.out.println("Dame el exponente:");
		exponente = teclado.nextInt();
		teclado.close();

		for (i = 1; i <= exponente; i++)
		{
			resultado = resultado * base;
		}

		System.out.println("El número "+base+" elevado a "+exponente+" vale "+resultado);
	}

}
