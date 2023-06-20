
package app.modconta.entity;

public class Producto 

{
    private int idProducto;
    private String Nombre;
    private String Descripcion;
    private int Stock;
    private int StockMax;
    private int StockMin;
    private String Estado;
    
    public Producto() {
    }


	public Producto(int idProducto, String nombre, String descripcion, int stock, int stockMax, int stockMin) {
		super();
		this.idProducto = idProducto;
		Nombre = nombre;
		Descripcion = descripcion;
		Stock = stock;
		StockMax = stockMax;
		StockMin = stockMin;
	}

	

	public String getEstado() {
		return Estado;
	}


	public void setEstado(String estado) {
		Estado = estado;
	}


	public String getDescripcion() {
		return Descripcion;
	}


	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}

	public int getStockMax() {
		return StockMax;
	}

	public void setStockMax(int stockMax) {
		StockMax = stockMax;
	}

	public int getStockMin() {
		return StockMin;
	}

	public void setStockMin(int stockMin) {
		StockMin = stockMin;
	}

	

  
    
}