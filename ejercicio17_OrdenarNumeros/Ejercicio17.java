package es.studium.ejercicio17_OrdenarNumeros;

import java.util.Scanner;

public class Ejercicio17
{
	/* ORDENA3NÚMEROS - Realizar un programa que lea tres números enteros y los ordene de mayor a menor. */

	public static void main(String[] args)
	{
		int a, b, c;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dame el valor de a:");
		a = teclado.nextInt();
		System.out.println("Dame el valor de b:");
		b = teclado.nextInt();
		System.out.println("Dame el valor de c:");
		c = teclado.nextInt();
		teclado.close();
		
		//abc
		if ((a>b)&&(b>c)) //&&=y
		{
			System.out.println(a+">"+b+">"+c);
		}
		
		//acb
		if ((a>c)&&(c>b))
		{
			System.out.println(a+">"+c+">"+b);
		}
		
		//bac
		if ((b>a)&&(a>c))
		{
			System.out.println(b+">"+a+">"+c);
		}
		
		//bca
		if ((b>c)&&(c>a))
		{
			System.out.println(b+">"+c+">"+a);
		}
		
		//cab
		if ((c>a)&&(a>b))
		{
			System.out.println(c+">"+a+">"+b);
		}
		
		//cba
		if ((c>b)&&(b>a))
		{
			System.out.println(c+">"+b+">"+a);
		}
	}

}
