package source;

import java.time.LocalDate;

public abstract class Descuento {
	
	private LocalDate comienzo;
	private LocalDate fin;
	
	public Descuento(LocalDate comienzo, LocalDate fin)
	{
		this.comienzo = comienzo;
		this.fin = fin;
	}
	
	public abstract int descuento(int base);
	
}
