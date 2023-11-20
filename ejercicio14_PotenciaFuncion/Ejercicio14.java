package es.studium.ejercicio14_PotenciaFuncion;

import java.util.Scanner;

public class Ejercicio14
{
	/* POTENCIA2 - Realizar un programa que calcule "a" elevado a "b" mediante una función. */

	public static void main(String[] args)
	{
		int base, exponente, resultado;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dame el valor de la base:");
		base = teclado.nextInt();
		System.out.println("Dame el valor del exponente:");
		exponente = teclado.nextInt();
		teclado.close();
		resultado = potencia(base,exponente);
		
		System.out.println(resultado);
	}

	//Función potencia.
	public static int potencia(int a, int b)
	{
		int r = 1, i;
		
		for (i=1; i<=b; i++)
		{
			r = r*a;
		}
		return r;
	}

}
