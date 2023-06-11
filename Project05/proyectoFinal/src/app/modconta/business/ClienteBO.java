package app.modconta.business;

import java.util.List;

import app.modconta.dataaccess.ClienteRepository;
import app.modconta.entity.Cliente;

public class ClienteBO implements IGeneralBO<Cliente>{
	
	ClienteRepository _doClienteRep;
	
	public ClienteBO() {
		_doClienteRep = new ClienteRepository();
	}

	@Override
	public void Create(Cliente p) {
		_doClienteRep.Create(p);
		
	}

	@Override
	public void Update(Cliente p) {
		_doClienteRep.Update(p);
		
	}

	@Override
	public void Delete(int id) {
		_doClienteRep.Delete(id);
		
	}

	@Override
	public Cliente Find(int code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> readAll() {
		// TODO Auto-generated method stub
		return _doClienteRep.readAll();
	}

 

}
