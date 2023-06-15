package app.modconta.business;

import java.util.List;
import app.modconta.dataaccess.ProveedorRepository;
import app.modconta.entity.Proveedor;

public class ProveedorBO implements IGeneralBO<Proveedor> {

	ProveedorRepository _doProveedorRep;
	
	
	public ProveedorBO() {
		_doProveedorRep = new ProveedorRepository();
	}

	@Override
	public void Create(Proveedor p) {
		_doProveedorRep.Create(p);
	}

	@Override
	public void Update(Proveedor param) {
		
	}

	@Override
	public void Delete(int id) {
		_doProveedorRep.Delete(id);
	}

	@Override
	public Proveedor Find(int code) {
		return null;
	}

	@Override
	public List<Proveedor> readAll() {
		
		
		return _doProveedorRep.readAll();
	}

	 
 


}
