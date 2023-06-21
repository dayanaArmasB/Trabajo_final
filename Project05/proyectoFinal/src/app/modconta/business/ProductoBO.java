package app.modconta.business;

import java.util.List;

import app.modconta.dataaccess.ProductoRepository;
import app.modconta.entity.Producto;

public class ProductoBO implements IGeneralBO<Producto>{
	
	ProductoRepository _doProductoRep;
	public ProductoBO() {
		_doProductoRep = new ProductoRepository();
	}

	@Override
	public void Create(Producto p) {
		_doProductoRep.Create(p);
	}

	@Override
	public void Update(Producto p) {
		_doProductoRep.Update(p);
	}

	@Override
	public void Delete(int id) {

		_doProductoRep.Delete(id);
	}

	@Override
	public Producto Find(int code) {

		return _doProductoRep.Find(code);
	}

	@Override
	public List<Producto> readAll() {
	 return _doProductoRep.readAll();
	}

}
