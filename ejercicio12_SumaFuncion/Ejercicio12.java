package es.studium.ejercicio12_SumaFuncion;

import java.util.Scanner;

public class Ejercicio12
{
	/* SUMA FUNCI�N - Realizar un programa que lea dos n�meros enteros por teclado y muestre la suma de ambos mediante una funci�n. */

	public static void main(String[] args)
	{
		int numero1, numero2, resultado;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dame un n�mero:");
		numero1 = teclado.nextInt();
		System.out.println("Dame otro n�mero:");
		numero2 = teclado.nextInt();
		teclado.close();
		resultado = suma(numero1,numero2);
		
		System.out.println("La suma de ambos es: "+resultado);
	}

	//Funci�n suma.
	public static int suma(int n1, int n2)
	{
		int r;
		
		r = n1 + n2;
		return r;
	}

}
