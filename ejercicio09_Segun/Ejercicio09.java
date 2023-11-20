package es.studium.ejercicio09_Segun;

import java.util.Scanner;

public class Ejercicio09
{
	/* SEGÚN - Realizar un programa que lea dos números enteros a y b por teclado. Si a<b obtener su suma. Si a>=b,
	   obtener su multiplicación.*/

	public static void main(String[] args)
	{
		int n1, n2;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un número:");
		n1 = teclado.nextInt();
		System.out.println("Introduce otro número:");
		n2 = teclado.nextInt();
		teclado.close();
		
		if (n1<n2)
		{
			System.out.println("El resultado es: "+(n1+n2));
		}
		else
		{
			System.out.println("El resultado es: "+n1*n2);
		}	
	}

}
