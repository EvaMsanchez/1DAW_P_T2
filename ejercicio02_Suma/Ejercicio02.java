package es.studium.ejercicio02_Suma;

import java.util.Scanner;

public class Ejercicio02 
{
	/* SUMA - Realizar un programa que lea dos n�meros enteros por teclado y muestre la suma de ambos. */

	public static void main(String[] args)
	{
		//ENTERO numero1, numero2, suma
		int numero1, numero2, suma;
		Scanner teclado = new Scanner (System.in);
		
		//ESCRIBIR "Dame un n�mero:"
		System.out.println("Dame un n�mero:");
		//LEER numero1
		numero1 = teclado.nextInt();
		//ESCRIBIR "Dame otro n�mero:"
		System.out.println("Dame otro n�mero:");
		//LEER numero2
		numero2 = teclado.nextInt();
		teclado.close();
		
		//suma=numero1+numero2
		suma=numero1+numero2;
		//ESCRIBIR "La suma es" + suma
		System.out.println("La suma es " + suma);
	}

}
