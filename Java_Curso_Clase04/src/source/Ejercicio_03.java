package source;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_03
{
	
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		String ruta = "src\\source\\ejercicio_4.txt";
		while(true)
		{
			System.out.print(
				"Codificar - 1\n" +
				"Decodificar - 2\n" +
				"Opcion: ");
			
			int op = sc.nextInt();
			if (op == 1) //CODIFICAR
			{
				System.out.print("Digite la cantidad de desplazamiento: ");
				int desplazamiento = sc.nextInt();
				codificar(desplazamiento,ruta);
			}
			if (op == 2) //DECODIFICAR
			{
				System.out.print("Digite la cantidad de desplazamiento: ");
				int desplazamiento = sc.nextInt();
				leer(desplazamiento, ruta);
			}
		}
	}
	
	public static void codificar(int desplazamiento,String ruta) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		String abc = " abcdefghijklmnopqrstuvwxyz";
		System.out.print("Ingrese una frase: ");
		String str = sc.nextLine();
		char[] nuevo = new char[str.length()];
		int j = 0;
		for( char letra : str.toCharArray() )
		{
			for( int i = 0 ; i < abc.length() ; i++ )
			{
				if(letra == abc.charAt(i))
				{
					nuevo[j] = abc.charAt((i + desplazamiento) % abc.length());
					break;
				}else
				{
					nuevo[j] = letra; //si es un simbolo
				}
			}
			j++;
		}
		guardar(ruta, String.valueOf(nuevo));
	}
	
	static public void guardar(String ruta, String str) throws IOException
	{
		FileWriter file = null;
		try
		{
			file = new FileWriter(ruta,true);
			file.append(str + "\n");
		} catch(IOException e)
		{
			System.out.println("Error: " + e.getMessage());
		} finally
		{
			 if (file != null) file.close();
		}
	}
	
	static public void leer(int desplazamiento, String ruta) throws IOException
	{
		
		FileReader file = null;
		BufferedReader lector;
		
		try
		{
			file = new FileReader(ruta);
			if( file.ready() )
			{
				lector = new BufferedReader(file);
				String str;
				while(( str = lector.readLine()) != null )
				{
					System.out.println(decodificar(desplazamiento, str));
				}
			} else
			{
				System.out.println("El archivo no esta listo para ser leido");
			}
			
		} catch (Exception e)
		{
			System.out.println("Error: " + e.getMessage() );
		}finally
		{
			 if (file != null) file.close();
		}
	}
	
	public static String decodificar(int desplazamiento, String str)
	{
		char[] decodificado = new char[str.length()];
		String abc = " abcdefghijklmnopqrstuvwxyz";
		
		int j = 0;
		for( char letra : str.toCharArray() )
		{
			for( int i = 0 ; i < abc.length() ; i++ )
			{
				if(letra == abc.charAt(i))
				{
					decodificado[j] = abc.charAt((
						(i - desplazamiento)) < 0 ? 
						   (i - desplazamiento)+ abc.length() : // si es menor que 0 le sumo el abcedario
							i - desplazamiento);
					break;
				} else
				{
					decodificado[j] = letra; //si es un simbolo
				}
			}
			j++;
		}
		return String.valueOf(decodificado);
	}
}
