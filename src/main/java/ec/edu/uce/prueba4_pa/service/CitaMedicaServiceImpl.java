package ec.edu.uce.prueba4_pa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.prueba4_pa.modelo.CitaMedica;
import ec.edu.uce.prueba4_pa.repository.ICitaMedicaRepo;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService {
	
	@Autowired
	private ICitaMedicaRepo estu;
	
	@Override
	public CitaMedica buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.estu.buscar(id);
	}

	@Override
	public List<CitaMedica> buscarTodos() {
		// TODO Auto-generated method stub
		return this.estu.buscarTodos();
	}

	@Override
	public void actualizar(CitaMedica e) {
		this.estu.actualizar(e);
		
	}

	@Override
	public void eliminar(Integer id) {
		this.estu.eliminar(id);
		
	}

	@Override
	public void insertar(CitaMedica e) {
		this.estu.insertar(e);
		
	}

	@Override
	public CitaMedica buscarPorNumero(Integer numero) {
		return this.estu.buscarPorNumero(numero);
	}

}