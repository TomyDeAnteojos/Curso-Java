package source;

public class ItemCarrito {
	
	private int cantidad;
	private Producto producto;
	
	public ItemCarrito() {}
	
	public ItemCarrito(int cantidad, Producto producto)
	{
		this.cantidad = cantidad;
		this.producto = producto;
	}
	
	public int precio()
	{
		return cantidad * producto.getPrecio();
	}
	public int getCntidad()
	{
		return cantidad;
	}
	
	public void setCantidad(int cantidad)
	{
		this.cantidad = cantidad;
	}
	
	public Producto getProducto()
	{
		return producto;
	}
	
	public void setProducto(Producto item)
	{
		this.producto = item;
	}

	
	
}
