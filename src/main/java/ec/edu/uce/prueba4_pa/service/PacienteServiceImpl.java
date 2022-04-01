package ec.edu.uce.prueba4_pa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.prueba4_pa.modelo.Paciente;
import ec.edu.uce.prueba4_pa.repository.IPacienteRepo;

@Service
public class PacienteServiceImpl implements IPacienteService {
	
	@Autowired
	private IPacienteRepo estu;
	
	@Override
	public Paciente buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.estu.buscar(id);
	}

	@Override
	public List<Paciente> buscarTodos() {
		// TODO Auto-generated method stub
		return this.estu.buscarTodos();
	}

	@Override
	public void actualizar(Paciente e) {
		this.estu.actualizar(e);
		
	}

	@Override
	public void eliminar(Integer id) {
		this.estu.eliminar(id);
		
	}

	@Override
	public void insertar(Paciente e) {
		this.estu.insertar(e);
		
	}

	
	@Override
	public Paciente buscarPorCedula(String cedula) {
		return this.estu.buscarPorCedula(cedula);
		
	}
	
}
