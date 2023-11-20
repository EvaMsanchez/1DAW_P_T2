package es.studium.ejercicio06_Dividir;

import java.util.Scanner;

public class Ejercicio06
{
	/* DIVIDIR - Realizar un programa que lea dos números y mediante una función, calcule la división de ambos. */

	public static void main(String[] args)
	{
		int numerador, denominador;
		double resultado;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dame el numerador:");
		numerador = teclado.nextInt();
		System.out.println("Dame el denominador:");
		denominador = teclado.nextInt();
		teclado.close();
		
		resultado = dividir(numerador,denominador);
		System.out.println(resultado);
	}

	public static double dividir(int nu, int den)
	{
		// Función. 
		double r;
		
		r = (double) nu/ (double) den;
		return r;
	}

}
