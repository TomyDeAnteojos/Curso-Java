package source;

import java.time.LocalDate;

public class DescuentoPorcentaje extends Descuento{

	private Double porcentaje;

	public DescuentoPorcentaje(LocalDate inicio, LocalDate fin)
	{
		super(inicio,fin);
	}
	
	@Override
	public int descuento(int base)
	{
		return (int) (( 100.0 / porcentaje ) * base);
	}
}
