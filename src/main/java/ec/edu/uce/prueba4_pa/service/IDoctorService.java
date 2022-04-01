package ec.edu.uce.prueba4_pa.service;

import java.util.List;

import ec.edu.uce.prueba4_pa.modelo.Doctor;

public interface IDoctorService {
	public Doctor buscar(Integer id);
	public List<Doctor> buscarTodos();
	public void actualizar(Doctor e);
	public void eliminar(Integer id);
	public void insertar(Doctor e);
	Doctor buscarPorCedula(String cedula);
}