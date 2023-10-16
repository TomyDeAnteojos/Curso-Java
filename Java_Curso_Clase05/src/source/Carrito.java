package source;

import java.time.LocalDate;

public class Carrito {
	
	private LocalDate fecha;
	private ItemCarrito[] item = new ItemCarrito[3];
	
	public Carrito(LocalDate fecha, ItemCarrito[] item)
	{
		this.fecha = fecha;
		this.item[0] = item[0];
		this.item[1] = item[1];
		this.item[2] = item[2];
	}
	
	public Carrito() {}
	
	public Carrito(ItemCarrito[] item)
	{
		this.fecha = LocalDate.now();
		this.item = item;
	}
	
	public LocalDate getFecha() {
	    return fecha;
	}
	public void setFecha(LocalDate fecha) {
	    this.fecha = fecha;
	}
	public ItemCarrito[] getItem() {
	    return item;
	}
	public void setItem(ItemCarrito item,int pos) {
	    this.item[pos] = item;
	}
	
	public int precio()
	{
		return 
			item[0].getCntidad()*item[0].getProducto().getPrecio()
			+ item[1].getCntidad()*item[1].getProducto().getPrecio()
			+ item[2].getCntidad()*item[2].getProducto().getPrecio();
	}
	
	
	
}
