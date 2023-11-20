package es.studium.ejercicio20_OperacionesFuncion1;

import java.util.Scanner;

public class Ejercicio20
{
	/* OPERACIONES3 - Realizar un programa que lea tres números por teclado y calcule, mediante funciones, su suma, 
	   su producto y su media. En esta función usaremos la otra función de suma antes creada. */

	public static void main(String[] args)
	{
		int numero1, numero2, numero3;

		Scanner teclado = new Scanner (System.in);

		System.out.println("Dame número 1:");
		numero1 = teclado.nextInt();
		System.out.println("Dame número 2:");
		numero2 = teclado.nextInt();
		System.out.println("Dame número 3:");
		numero3 = teclado.nextInt();
		teclado.close();
		
		System.out.println("Las operaciones son:");
		
		System.out.println("La suma: "+suma(numero1, numero2, numero3));
		System.out.println("El producto: "+producto(numero1, numero2, numero3));
		System.out.println("La media: "+media(numero1, numero2, numero3));
	}

	//Función suma.
	public static int suma(int n1, int n2, int n3)
	{
		return n1+n2+n3;
	}
	
	//Función producto.
	public static int producto(int n1, int n2, int n3)
	{
		return (n1*n2*n3);
	}
	
	//Función media.
	public static float media(int n1, int n2, int n3)
	{
		return ((float)suma(n1,n2,n3)/(float)3); //Usando la función anterior suma.
	}

}
