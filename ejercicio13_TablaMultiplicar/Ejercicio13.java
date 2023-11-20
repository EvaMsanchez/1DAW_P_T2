package es.studium.ejercicio13_TablaMultiplicar;

import java.util.Scanner;

public class Ejercicio13
{
	/* TABLA MULTIPLICAR - Realizar un programa que lea un número por teclado y escriba su tabla de multiplicar del 0 al 10. */

	public static void main(String[] args)
	{
		int numero, i, resultado;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dame un número:");
		numero = teclado.nextInt();
		System.out.println("Su table de multiplicar es:");
		teclado.close();
		
		for (i=0; i<=10; i++) 
		{
			resultado = numero*i;
			System.out.println(numero +" x "+ i +" = " + resultado);
		}			
	}

}
