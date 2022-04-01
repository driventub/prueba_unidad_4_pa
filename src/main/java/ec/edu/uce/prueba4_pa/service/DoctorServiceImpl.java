package ec.edu.uce.prueba4_pa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.prueba4_pa.modelo.Doctor;
import ec.edu.uce.prueba4_pa.repository.IDoctorRepo;

@Service
public class DoctorServiceImpl implements IDoctorService {
	
	@Autowired
	private IDoctorRepo estu;
	
	@Override
	public Doctor buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.estu.buscar(id);
	}

	@Override
	public List<Doctor> buscarTodos() {
		// TODO Auto-generated method stub
		return this.estu.buscarTodos();
	}

	@Override
	public void actualizar(Doctor e) {
		this.estu.actualizar(e);
		
	}

	@Override
	public void eliminar(Integer id) {
		this.estu.eliminar(id);
		
	}

	@Override
	public void insertar(Doctor e) {
		this.estu.insertar(e);
		
	}

	@Override
	public Doctor buscarPorCedula(String cedula) {
		return this.estu.buscarPorCedula(cedula);
	}
}


