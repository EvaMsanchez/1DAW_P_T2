package es.studium.ejercicio04_Pares;

import java.util.Scanner;

public class Ejercicio04
{
	/* PARES - Realizar un programa que lea dos n�meros y me indique los n�meros pares que hay entre ellos. */
	
	public static void main(String[] args)
	{
		int numero1, numero2, i;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dame un n�mero:");
		numero1 = teclado.nextInt();
		System.out.println("Dame otro n�mero:");
		numero2 = teclado.nextInt();
		teclado.close();
		
		for(i=numero1; i<=numero2; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}

}
