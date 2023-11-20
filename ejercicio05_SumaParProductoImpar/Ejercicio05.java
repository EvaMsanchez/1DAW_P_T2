package es.studium.ejercicio05_SumaParProductoImpar;

public class Ejercicio05
{
	/* SUMA PARES–PRODUCTOS IMPARES – Realizar un programa que calcule la suma de los 20 primeros números pares y
	   el producto de los 20 primeros números impares simultáneamente. */
	
	public static void main(String[] args)
	{
		int suma=0, producto=1, i;

		for(i=0; i<=39; i++)
		{
			if(i%2==0)
			{
				suma=suma+i;
			}
			else
			{
				producto=producto*i;
			}

		}

		System.out.println("La suma de los pares es: "+ suma);
		System.out.println("El producto de los impares es: "+ producto);	
	}

}
