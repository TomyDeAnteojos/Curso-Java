
public class Ejercicio_01 {

	public static void main(String[] args) {
		
		int numeroInicio = 5;
		int numeroFin = 14;

		boolean variableInutil = true;
		boolean variableInutil2 = true;
		boolean variableInutil3 = true;
		/*
		 * 
		 *  IMPRIMIR TODOS LOS NUMEROS
		 * 
		 */
		
		while( numeroInicio <= numeroFin )
		{
			System.out.println(numeroInicio++);
		}

		/*
		 * 
		 * IMPRIMIR LOS NUMEROS PARES
		 * 
		 */
		
		numeroInicio = 5;
		numeroFin = 14;
		
		numeroInicio += numeroInicio % 2;
		while( ( numeroInicio ) <= numeroFin)
		{
			System.out.println(numeroInicio);
			numeroInicio += 2;
		}
		
		/*
		 * 
		 * MUESTRA LOS PARES/IMPARES
		 * 
		 */
		
		numeroInicio = 5;
		numeroFin = 14;
		boolean esPar = true;
		
		if( esPar )
		{
			numeroInicio += numeroInicio%2;
		}
		while(numeroInicio <= numeroFin)
		{
			System.out.println(numeroInicio);
			numeroInicio+=2;
		}

		/*
		 * 
		 * (B) CON FOR E INVERSO
		 * 
		 */
		
		numeroInicio = 5;
		numeroFin = 14;

		for( int i = numeroFin - numeroFin % 2; i >= numeroInicio ; i -= 2 )
		{
			System.out.println(i);
		}
	}

}
