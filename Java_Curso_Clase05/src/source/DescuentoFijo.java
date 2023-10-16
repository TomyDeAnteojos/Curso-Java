package source;

import java.time.LocalDate;

public class DescuentoFijo extends Descuento{

	private int monto;
	
	public DescuentoFijo(LocalDate comienzo, LocalDate fin)
	{
		super(comienzo, fin);
	}
	
	public void setMonto(int monto)
	{
		this.monto = monto;
	}
	
	@Override
	public int descuento(int base)
	{
		return base - monto;
	}
}
