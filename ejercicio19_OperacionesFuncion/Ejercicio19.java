package es.studium.ejercicio19_OperacionesFuncion;

import java.util.Scanner;

public class Ejercicio19
{
	/* OPERACIONES2 - Realizar un programa que lea dos n�meros enteros por teclado y calcule su suma, su resta, su producto
	   y su cociente cuando fuera posible mediante funciones. */

	public static void main(String[] args)
	{
		int numero1, numero2;

		Scanner teclado = new Scanner (System.in);

		System.out.println("Dame un n�mero:");
		numero1 = teclado.nextInt();
		System.out.println("Dame otro n�mero:");
		numero2 = teclado.nextInt();
		teclado.close();
		
		System.out.println("Las operaciones son:");
		
		System.out.println("La suma: "+suma(numero1, numero2));
		System.out.println("La resta: "+resta(numero1, numero2));
		System.out.println("El producto: "+producto(numero1, numero2));
		
		if (numero2!=0)
		{
			System.out.println("El cociente: "+cociente(numero1, numero2));
		}
		else
		{
			System.out.println("La divisi�n por 0 no es posible");
		}
	}

	//Funci�n suma.
	public static int suma(int n1, int n2)
	{
		return n1+n2;
	}
	
	//Funci�n resta.
	public static int resta(int n1, int n2)
	{
		return (n1-n2);
	}
	
	//Funci�n producto.
	public static int producto(int n1, int n2)
	{
		return (n1*n2);
	}
	
	//Funci�n cociente.
	public static float cociente(int n1, int n2)
	{
		return ((float)n1/(float)n2);
	}
	
}