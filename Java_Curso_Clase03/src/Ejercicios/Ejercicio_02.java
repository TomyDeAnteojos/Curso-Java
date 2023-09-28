package Ejercicios;

import java.util.Scanner;

public class Ejercicio_02
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String abc = " abcdefghijklmnopqrstuvwxyz";
		System.out.print("Ingrese una frase: ");
		String str = sc.nextLine();
		System.out.print("Digite la cantidad de desplazamiento: ");
		int pos = sc.nextInt();
		char[] nuevo = new char[str.length()];
		
		int j = 0;
		for( char letra : str.toCharArray() )
		{
			for( int i = 0 ; i < abc.length() ; i++ )
			{
				if(letra == abc.charAt(i))
				{
					nuevo[j] = abc.charAt((i + pos) % abc.length());
				} else
				{
					nuevo[j] = letra; //si es un simbolo
				}
			}
			j++;
		}
		str = String.valueOf(nuevo);
		System.out.print("Su nueva frase es: " + str);
	}
	
}
