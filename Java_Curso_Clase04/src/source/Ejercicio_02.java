package source;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_02 {

	public static void main(String[] args) throws IOException
	{
		
		String archivo = "src\\source\\numeros.txt";
		int suma = suma(archivo);
		int multiplicacion = multiplicacion(archivo,1);
		
		System.out.println("suma: " + suma);
		System.out.println("multiplicacion: " + multiplicacion);
		
	}
	public static int suma(String ruta) throws IOException
	{
		FileReader archivo;
		BufferedReader lector;
		int suma = 0;
		try
		{
			archivo = new FileReader(ruta);
			if( archivo.ready() )
			{
				lector = new BufferedReader(archivo);
				String str;
				while(( str = lector.readLine()) != null )
				{
					suma += Integer.parseInt(str);
				}
			} else
			{
				System.out.println("El archivo no esta listo para ser leido");
			}
			
		} catch (Exception e)
		{
			System.out.println("Error: " + e.getMessage() );
		}
		return suma;
	}
	public static int multiplicacion(String ruta,int multiplicacion) throws IOException
	{
		FileReader archivo;
		BufferedReader lector;
		int multi = 0;
		try
		{
			archivo = new FileReader(ruta);
			if( archivo.ready() )
			{
				lector = new BufferedReader(archivo);
				String str;
				while(( str = lector.readLine()) != null )
				{
					multi += Integer.parseInt(str)*multiplicacion;
				}
			} else
			{
				System.out.println("El archivo no esta lsito para ser leido");
			}
			
		} catch (Exception e)
		{
			System.out.println("Error: " + e.getMessage() );
		}
		return multi;
	}

}
