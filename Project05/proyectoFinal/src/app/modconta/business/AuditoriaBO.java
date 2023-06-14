package app.modconta.business;

import java.util.ArrayList;
import java.util.List;

import app.modconta.dataaccess.AuditoriaRepository;
import app.modconta.entity.Mutation;

public class AuditoriaBO implements IGeneralBO<Mutation>{

	AuditoriaRepository _doMutation;
	public AuditoriaBO() {
		_doMutation = new AuditoriaRepository();
	}

	@Override
	public void Create(Mutation param) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void Update(Mutation param) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void Delete(int id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Mutation Find(int code) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Mutation> readAll() {
		List<Mutation> lista_datos = new ArrayList<>();
	     try {   	
	       	lista_datos = _doMutation.readAll();
	        } catch (Exception e) 
	        {
	           System.out.println(e.getMessage());
	        }
	        return lista_datos;
	}   

}
