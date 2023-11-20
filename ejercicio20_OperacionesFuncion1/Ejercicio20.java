package es.studium.ejercicio20_OperacionesFuncion1;

import java.util.Scanner;

public class Ejercicio20
{
	/* OPERACIONES3 - Realizar un programa que lea tres n�meros por teclado y calcule, mediante funciones, su suma, 
	   su producto y su media. En esta funci�n usaremos la otra funci�n de suma antes creada. */

	public static void main(String[] args)
	{
		int numero1, numero2, numero3;

		Scanner teclado = new Scanner (System.in);

		System.out.println("Dame n�mero 1:");
		numero1 = teclado.nextInt();
		System.out.println("Dame n�mero 2:");
		numero2 = teclado.nextInt();
		System.out.println("Dame n�mero 3:");
		numero3 = teclado.nextInt();
		teclado.close();
		
		System.out.println("Las operaciones son:");
		
		System.out.println("La suma: "+suma(numero1, numero2, numero3));
		System.out.println("El producto: "+producto(numero1, numero2, numero3));
		System.out.println("La media: "+media(numero1, numero2, numero3));
	}

	//Funci�n suma.
	public static int suma(int n1, int n2, int n3)
	{
		return n1+n2+n3;
	}
	
	//Funci�n producto.
	public static int producto(int n1, int n2, int n3)
	{
		return (n1*n2*n3);
	}
	
	//Funci�n media.
	public static float media(int n1, int n2, int n3)
	{
		return ((float)suma(n1,n2,n3)/(float)3); //Usando la funci�n anterior suma.
	}

}
