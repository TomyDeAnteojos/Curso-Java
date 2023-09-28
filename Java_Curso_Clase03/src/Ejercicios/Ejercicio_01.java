package Ejercicios;

import java.util.Scanner;
public class Ejercicio_01
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese una frase por favor: ");
		String text1 = sc.nextLine();
		
		System.out.print("Que letra quiere buscar? ");
		char letra = sc.next().charAt(0);
		
		int contador = 0 ;
		for( char c : text1.toCharArray() )
		{
			if (letra == c) contador++;
		}
		System.out.print("La letra " + letra + " aparecio: " + contador);
		
		
		int[] arrInt = new int[3];
		for(int i = 0 ; i < 3 ; i++ )
		{
			System.out.print("Digite un numero por favor: ");
			arrInt[i] = sc.nextInt();
		}
		char orden = 'x';
		while ( orden != 'a' && orden != 'c')
		{
			System.out.print("Ordenamiento ASCENDENTE(a) - DECENDENTE(c): ");
			orden = sc.next().charAt(0);
		}
		for( int i = 0 ; i < 3 ; i++ )
		{
			for (int j = i+1 ; j < 3 ; j++ )
			{
				if(orden == 'a')
				{
					if( arrInt[i] > arrInt[j])
					{
						int aux = arrInt[i];
						arrInt[i] = arrInt[j];
						arrInt[j] = aux;
					}
				} 
				else
				{
					if( arrInt[i] < arrInt[j])
					{
						int aux = arrInt[i];
						arrInt[i] = arrInt[j];
						arrInt[j] = aux;
					}
				}
			}	
		}
		for( int num : arrInt)
		{
			System.out.println(num);
		}
		
		int[] arr = new int[10];
		
		System.out.print("Ingrese el digito: ");
		int x = sc.nextInt();
		
		for(int i = 0 ; i < arr.length ; i++ )
		{
			System.out.print("Numero [" + (i+1) + "]: ");
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for( int num : arr)
		{
			if(num > x) sum += num;
		}
		System.out.print("La suma es " + sum);
	}
	

}
