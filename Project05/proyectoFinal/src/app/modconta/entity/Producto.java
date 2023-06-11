
package app.modconta.entity;

public class Producto 

{
    private int idProducto;
    private String Nombre;
    private int Stock;
    private int StockMax;
    private int StockMin;
    private int idModelo;
    private int idCategoria;
    public Producto() {
    }

    public Producto(int idProducto, String Nombre, int Stock, int StockMax, int StockMin, int idModelo) {
        this.idProducto = idProducto;
        this.Nombre = Nombre;
        this.Stock = Stock;
        this.StockMax = StockMax;
        this.StockMin = StockMin;
        this.idModelo = idModelo;
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

	public int getIdModelo() {
		return idModelo;
	}

	public void setIdModelo(int idModelo) {
		this.idModelo = idModelo;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
    

  
    
}