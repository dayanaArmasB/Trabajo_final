package app.modconta.business;

import java.util.List;

import app.modconta.dataaccess.EmpleadoRepository;
import app.modconta.entity.Empleado;

public class EmpleadoBO implements IGeneralBO<Empleado>{
	
	EmpleadoRepository _doEmpleRep;
	
	public EmpleadoBO() {
		_doEmpleRep = new EmpleadoRepository();
	}

	@Override
	public void Create(Empleado p) {
		_doEmpleRep.Create(p);
	}

	@Override
	public void Update(Empleado param) {

		_doEmpleRep.Update(param);
	}

	@Override
	public void Delete(int id) {
		_doEmpleRep.Delete(id);
		
	}

	@Override
	public Empleado Find(int code) {

		return _doEmpleRep.Find(code);
	}

	@Override
	public List<Empleado> readAll() {

		return _doEmpleRep.readAll();
	}

}
