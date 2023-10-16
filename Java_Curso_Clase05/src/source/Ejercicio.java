package source;

import java.util.Scanner;

public class Ejercicio
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Archivo_Estante archivo = new Archivo_Estante("src\\source\\Estante.txt");
		int op;
		
		while(true)
		{
			System.out.print(
				"--------- MENU CARRITO ---------\n"
				+ "1. Cargar Estante.\n"
				+ "2. Mostrar Estante.\n"
				+ "3. Cargar Carrito.\n"
				+ "Opcion: ");
			op = sc.nextInt();
			switch ( op )
			{
			case 1:
				archivo.cargarEstante();
				break;
			case 2:
				archivo.MostrarEstante();
				break;
			case 3:
				Comprar();
				break;
			}
		}
	}
	
	public static void Comprar()
	{
		Scanner sc = new Scanner(System.in);
		
		Carrito car = new Carrito();
		Archivo_Estante arc = new Archivo_Estante("src\\source\\Estante.txt");

		for(int i = 0 ; i < 3 ; i++ ) // 3 productos
		{
			Producto prod = new Producto();
			ItemCarrito item = new ItemCarrito();
			
			do
			{
				System.out.print("Ingrese nombre del producto: ");
				String nombre = sc.nextLine();
				prod = arc.ObtenerProducto(nombre);
				
			}while(prod.getPrecio() == -1 );
			System.out.print("Cantidad: ");
			int cantidad = sc.nextInt();
			sc.nextLine();
			item.setCantidad(cantidad);
			item.setProducto(prod);
			
			car.setItem(item,i);
		}
		
		
		System.out.println("El precio es $" + car.precio());
		
		
	}

}
