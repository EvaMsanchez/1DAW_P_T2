package es.studium.ejercicio15_Meses;

import java.util.Scanner;

public class Ejercicio15
{
	/*MESES - Realizar un programa que lea un entero entre 1 y 12 y escriba por pantalla el nombre del mes al que corresponde. */

	public static void main(String[] args)
	{
		int numero;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Escriba un número entre 1 y 12:");
		numero = teclado.nextInt();
		teclado.close();
		
		switch (numero)
		{
			case 1:
				System.out.println("Enero");
				break;
				
			case 2:
				System.out.println("Febrero");
				break;
				
			case 3:
				System.out.println("Marzo");
				break;
				
			case 4:
				System.out.println("Abril");
				break;
				
			case 5:
				System.out.println("Mayo");
				break;
				
			case 6:
				System.out.println("Junio");
				break;
				
			case 7:
				System.out.println("Julio");
				break;
				
			case 8:
				System.out.println("Agosto");
				break;
				
			case 9:
				System.out.println("Septiembre");
				break;
				
			case 10:
				System.out.println("Octubre");
				break;
				
			case 11:
				System.out.println("Noviembre");
				break;
				
			case 12:
				System.out.println("Diciembre");
				break;
		}
	}

}
