package ec.edu.uce.prueba4_pa.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.prueba4_pa.modelo.Doctor;

@Repository
@Transactional
public class DoctorRepoImpl implements IDoctorRepo{
	
	private static final Logger LOG = LoggerFactory.getLogger(DoctorRepoImpl.class); 
	
	@PersistenceContext
	private EntityManager e;
	
	@Override
	public Doctor buscar(Integer id) {
		return this.e.find(Doctor.class, id);
	}

	@Override
	public List<Doctor> buscarTodos() {
		TypedQuery<Doctor> myTypedQuery = (TypedQuery<Doctor>) this.e
				.createQuery("SELECT f FROM Doctor f    ",Doctor.class);
		return myTypedQuery.getResultList();
		
	}

	@Override
	public void actualizar(Doctor e) {
		this.e.merge(e);
		
	}

	@Override
	public void eliminar(Integer id) {
		Doctor gBorrar = this.buscar(id);
		this.e.remove(gBorrar);
		
	}

	@Override
	public void insertar(Doctor e) {
		this.e.persist(e);
		
	}

	@Override
	public Doctor buscarPorCedula(String cedula) {
		TypedQuery<Doctor> myTypedQuery = (TypedQuery<Doctor>) this.e
		.createQuery("select c from Doctor c where c.cedula=:valor");
myTypedQuery.setParameter("valor", cedula);

return myTypedQuery.getSingleResult();
	}

}