package es.studium.ejercicio12_SumaFuncion;

import java.util.Scanner;

public class Ejercicio12
{
	/* SUMA FUNCIÓN - Realizar un programa que lea dos números enteros por teclado y muestre la suma de ambos mediante una función. */

	public static void main(String[] args)
	{
		int numero1, numero2, resultado;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dame un número:");
		numero1 = teclado.nextInt();
		System.out.println("Dame otro número:");
		numero2 = teclado.nextInt();
		teclado.close();
		resultado = suma(numero1,numero2);
		
		System.out.println("La suma de ambos es: "+resultado);
	}

	//Función suma.
	public static int suma(int n1, int n2)
	{
		int r;
		
		r = n1 + n2;
		return r;
	}

}
