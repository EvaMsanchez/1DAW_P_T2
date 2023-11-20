package es.studium.ejercicio16_Expresion;

import java.util.Scanner;

public class Ejercicio16
{
	/* EXPRESI�N - Realizar un programa que calcule mediante una funci�n la siguiente expresi�n: b2-4ac/2a */

	public static void main(String[] args)
	{
		int a, b, c;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dame un valor para a:");
		a = teclado.nextInt();
		System.out.println("Dame un valor para b:");
		b = teclado.nextInt();
		System.out.println("Dame un valor para c:");
		c = teclado.nextInt();
		teclado.close();
		
		System.out.println("El resultado es "+expresion(a,b,c));
	}
	
	//Funci�n suma.
	public static float expresion(int a, int b, int c)
	{
		return ((((float)b*(float)b)-(4+(float)a*(float)c)/2*(float)a));
	}

}
