package source;

import java.util.Scanner;

public class Ejercicio_01 {

	public static void main(String[] args)
	{
		int ej;
		while(true)
		{
			System.out.print("Ejercicio 1(1a) - 2(1b)");
			Scanner sc = new Scanner(System.in);
			ej = sc.nextInt();
			if(ej == 1) ordenamiento(1,2,3,'d');
			if (ej == 2) ordenamiento();
		}
	}
	
	public static void ordenamiento(int n1, int n2, int n3, char x)
	{
		int[] arr = ordenar(n1,n2,n3,x);
		mostrar(arr);	
	}
	public static void ordenamiento()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite un numero");
		int n1 = sc.nextInt();
		System.out.print("Digite un numero");
		int n2 = sc.nextInt();
		System.out.print("Digite un numero");
		int n3 = sc.nextInt();
		System.out.print("Ascendente - a || Descendente - d");
		char x = sc.next().charAt(0);
		
		int[] arr = ordenar(n1,n2,n3,x);
		mostrar(arr);
	}
	
	public static void mostrar(int[] arr)
	{
		for(int i : arr ) System.out.println(i);
	}
	
	public static int buscar_Mayor(int n1, int n2, int n3)
	{
		if (n1 > n2)
		{
			return n1 > n3 ? n1 : n3;
		}
		return n2 > n3 ? n2 : n3;
	}
	
	public static int buscar_Menor(int n1, int n2, int n3)
	{
		if (n1 < n2)
		{
			return n1 < n3 ? n1 : n3;
		}
		return n2 < n3 ? n2 : n3;
	}
	
	public static int buscar_Medio(int n1, int n2, int n3)
	{
		int mayor = buscar_Mayor(n1, n2, n3);
		int menor = buscar_Menor(n1, n2, n3);
		if( n1 == mayor)
		{
			return n2 == menor ? n3 : n2;
		}
		if( n2 == mayor)
		{
			return n1 == menor ? n3 : n1;
		}
		return n2 == menor ? n1 : n2;
	}
	
	public static int[] ordenar(int n1, int n2, int n3, char orden)
	{
		int[] arr = new int[3];
		
		if( orden == 'a')
		{
			arr[0] = buscar_Menor(n1,n2,n3);
			arr[1] = buscar_Medio(n1,n2,n3);
			arr[2] = buscar_Mayor(n1,n2,n3);
		}
		else
		{
			arr[2] = buscar_Menor(n1,n2,n3);
			arr[1] = buscar_Medio(n1,n2,n3);
			arr[0] = buscar_Mayor(n1,n2,n3);
		}
		
		return arr;
	}
}
