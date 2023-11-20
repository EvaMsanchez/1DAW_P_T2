package es.studium.ejercicio07_Compara;

import java.util.Scanner;

public class Ejercicio07
{
	/* COMPARA - Realizar un programa que lea dos números por teclado e indique si son iguales o cuál es mayor de los dos. */

	public static void main(String[] args)
	{
		int n1, n2;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dame un número:");
		n1 = teclado.nextInt();
		System.out.println("Dame otro número:");
		n2 = teclado.nextInt();
		teclado.close();
		
		if (n1==n2)
		{
			System.out.println("Los números son iguales.");
		}
		else
		{
			if (n1>n2)
			{
				System.out.println("El número 1 es mayor que el número 2.");
			}
			else
			{
				System.out.println("El número 2 es mayor que el número 1.");
			}
		}	
	}

}
