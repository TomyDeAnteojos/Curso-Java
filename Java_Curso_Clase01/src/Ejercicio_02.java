
public class Ejercicio_02 {

	public static void main(String[] args) {
		double ingresos_Mensuales = 180000.00;
		int cantVehiculos = 2;
		int antiguedad_Vehiculos = 2;
		int inmuebles = 3;
		boolean embarcaciones = true;
		boolean aeronave = false;
		boolean titular_activos = false;
		
		if( //INGRESOS ALTOS
			(ingresos_Mensuales >= 489083) ||
			((cantVehiculos >= 3) && ( antiguedad_Vehiculos <= 5 )) ||
			( inmuebles >= 3) ||
			embarcaciones ||
			aeronave ||
			titular_activos )
		{
			System.out.println("Pertenece al segmento de Ingresos Altos.");
		} else {
			System.out.println("No pertenece al segmento de Ingresos Altos.");
		}
	}

}
