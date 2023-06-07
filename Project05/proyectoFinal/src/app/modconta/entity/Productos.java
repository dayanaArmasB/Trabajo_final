
package app.modconta.entity;

public class Productos 

{
    private int idProducto;
    private String Nombre_Producto;
    private String SO;
    private String Procesador; 
    private String RAM;
    private String TarjetaMadre;
    private int Stock;
    private int StockMax;
    private int StockMin;
    private int idModelo;
  // public Marca marc;
   // public Modelo mode;

    public Productos() {
    }

    public Productos(int idProducto, String Nombre_Producto, String SO, String Procesador, String RAM, String TarjetaMadre, int Stock, int StockMax, int StockMin, int idModelo) {
        this.idProducto = idProducto;
        this.Nombre_Producto = Nombre_Producto;
        this.SO = SO;
        this.Procesador = Procesador;
        this.RAM = RAM;
        this.TarjetaMadre = TarjetaMadre;
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


    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String Procesador) {
        this.Procesador = Procesador;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getTarjetaMadre() {
        return TarjetaMadre;
    }

    public void setTarjetaMadre(String TarjetaMadre) {
        this.TarjetaMadre = TarjetaMadre;
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