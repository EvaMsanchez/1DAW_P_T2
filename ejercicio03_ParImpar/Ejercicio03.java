package es.studium.ejercicio03_ParImpar;

import java.util.Scanner;

public class Ejercicio03
{
	/* PAR–IMPAR – Realizar un programa que lea un número y nos diga si el número es par o si es impar. */
	
	public static void main(String[] args)
	{
		int numero;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dame un número:");
		numero = teclado.nextInt();
		teclado.close();
		
		if(numero%2==0)
		{
			System.out.println("El número es PAR");
		}
		else
		{
			System.out.println("El número es IMPAR");
		}
	}

}
