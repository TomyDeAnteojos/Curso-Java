package source;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;


public class Archivo_Estante {

	private static String nombre;
	
	public Archivo_Estante(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public static void cargarEstante()
	{
		Producto estante = new Producto();
		Scanner sc = new Scanner(System.in);
		int cant = 1;
		int condicion = 1;
		while (condicion == 1)
		{
			System.out.println("Producto #" + cant);
			estante.cargarProducto();	
				
			Guardar(
					Integer.toString(estante.getPrecio())
					+ "," + estante.getNombre());
			
			System.out.print("Seguir(1 - 0): ");
			condicion = sc.nextInt();
			cant++;
		}
	}

	public static void MostrarEstante()
	{
		try (FileReader fr = new FileReader(nombre);
	    BufferedReader br = new BufferedReader(fr))
		{
			String linea;
			System.out.println("Contenido del archivo:");
			int cont = 1;
			while ((linea = br.readLine()) != null)
			{
				System.out.println("Producto #" + cont);
				String[] part = linea.split(",");
				System.out.println("Nombre: " + part[1]);
				System.out.println("Precio: $" + part[0]);
				cont++;
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static Producto ObtenerProducto(String buscar)
	{
		Producto obj = new Producto();
		try (FileReader fr = new FileReader(nombre);
		BufferedReader br = new BufferedReader(fr))
	    {
			String linea;
	        while ((linea = br.readLine()) != null)
	        {
	        	String[] prod_Partes= linea.split(",");
	            if(prod_Partes[1].equals(buscar))
	            {
	            	obj = new Producto(Integer.parseInt(prod_Partes[0]), prod_Partes[1]);
	            	br.close();
	            	return obj;
	            }
	        }
	    } catch (IOException e)
	    {
	    	e.printStackTrace();
	    }
		return obj;
	}
	
	public static void Guardar(String prod)
	{
        try (FileWriter fw = new FileWriter(nombre, true);
            BufferedWriter bw = new BufferedWriter(fw))
        {
            bw.write(prod);
            bw.flush();
            bw.newLine();
            bw.flush();
            bw.close();
            System.out.println("Información agregada al archivo.");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        
	}
        
}
