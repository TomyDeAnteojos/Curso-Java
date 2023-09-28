package Ejercicios;

import java.util.Arrays;

public class Optimizacion_Arrays
{

	public static void main(String[] args)
	{

		int[] numeros = new int[]{456, 982, 345, 123, 765, 234, 567, 890, 100, 345};
		
		boolean ejemplo =BuscarEntero(numeros, 345);
		System.out.println(ejemplo);

	}
	
	public static int[] ordenarArray(int[] array)
	{
		Arrays.sort(array);
		return array;
	}
	
	public static boolean BuscarEntero(int[] array, int num)
	{
		//ordeno el array
		Arrays.sort(array);
		//busca el numero
		return Arrays.binarySearch(array,num) >= 0;
	}
}
