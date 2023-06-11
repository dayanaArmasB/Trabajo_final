
package app.modconta.entity;

public class Producto 

{
    private int idProducto;
    private String Nombre_Producto;
    private int Stock;
    private int StockMax;
    private int StockMin;
    private int idModelo;

    public Producto() {
    }

    public Producto(int idProducto, String Nombre_Producto, int Stock, int StockMax, int StockMin, int idModelo) {
        this.idProducto = idProducto;
        this.Nombre_Producto = Nombre_Producto;
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

	public String getNombre_Producto() {
		return Nombre_Producto;
	}

	public void setNombre_Producto(String nombre_Producto) {
		Nombre_Producto = nombre_Producto;
	}

   

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public int getStockMax() {
        return StockMax;
    }

    public void setStockMax(int StockMax) {
        this.StockMax = StockMax;
    }

    public int getStockMin() {
        return StockMin;
    }

    public void setStockMin(int StockMin) {
        this.StockMin = StockMin;
    }

    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
    }

    
}