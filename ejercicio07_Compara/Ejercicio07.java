package es.studium.ejercicio07_Compara;

import java.util.Scanner;

public class Ejercicio07
{
	/* COMPARA - Realizar un programa que lea dos n�meros por teclado e indique si son iguales o cu�l es mayor de los dos. */

	public static void main(String[] args)
	{
		int n1, n2;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dame un n�mero:");
		n1 = teclado.nextInt();
		System.out.println("Dame otro n�mero:");
		n2 = teclado.nextInt();
		teclado.close();
		
		if (n1==n2)
		{
			System.out.println("Los n�meros son iguales.");
		}
		else
		{
			if (n1>n2)
			{
				System.out.println("El n�mero 1 es mayor que el n�mero 2.");
			}
			else
			{
				System.out.println("El n�mero 2 es mayor que el n�mero 1.");
			}
		}	
	}

}
