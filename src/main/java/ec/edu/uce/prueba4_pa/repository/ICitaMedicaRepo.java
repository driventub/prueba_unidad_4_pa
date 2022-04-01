package ec.edu.uce.prueba4_pa.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import ec.edu.uce.prueba4_pa.modelo.CitaMedica;

public interface ICitaMedicaRepo {
	public CitaMedica buscar(Integer id);
	public List<CitaMedica> buscarTodos();
	public void actualizar(CitaMedica e);
	public void eliminar(Integer id);
	public void insertar(CitaMedica e);
	CitaMedica buscarPorNumero(Integer numero);
}