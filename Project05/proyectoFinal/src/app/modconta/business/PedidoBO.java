package app.modconta.business;

import java.util.List;

import app.modconta.dataaccess.Repository;
import app.modconta.entity.Pedido;

public class PedidoBO implements IGeneralBO<Pedido> {
    Repository _doDatos = null;
	public PedidoBO() {
	 _doDatos = new Repository();
	}

	@Override
	public void Create(Pedido p) {
	    try {
	     _doDatos.RegistrarPedido(p);
	      } catch (Exception e) {
	           System.out.println(e.getMessage());
	      }	
	}

	@Override
	public void Update(Pedido p) {
	     try {
	            _doDatos.ActualizarPedido(p);
	          } catch (Exception e) {
	             throw e;
	          }
		
	}

	@Override
	public void Delete(int id) {
		
	}

	@Override
	public Pedido Find(int code) {

		return null;
	}

	@Override
	public List<Pedido> readAll() {

		return null;
	}

 

}
