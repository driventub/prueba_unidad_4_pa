package ec.edu.uce.prueba4_pa.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.prueba4_pa.modelo.CitaMedica;

// RepoImpl


@Repository
@Transactional
public class CitaMedicaRepoImpl implements ICitaMedicaRepo{
	
	private static final Logger LOG = LoggerFactory.getLogger(CitaMedicaRepoImpl.class); 
	
	@PersistenceContext
	private EntityManager e;
	
	@Override
	public CitaMedica buscar(Integer id) {
		return this.e.find(CitaMedica.class, id);
	}

	@Override
	public List<CitaMedica> buscarTodos() {
		TypedQuery<CitaMedica> myTypedQuery = (TypedQuery<CitaMedica>) this.e
				.createQuery("SELECT f FROM CitaMedica f    ",CitaMedica.class);
		return myTypedQuery.getResultList();
		
	}

	@Override
	public void actualizar(CitaMedica e) {
		this.e.merge(e);
		
	}

	@Override
	public void eliminar(Integer id) {
		CitaMedica gBorrar = this.buscar(id);
		this.e.remove(gBorrar);
		
	}

	@Override
	public void insertar(CitaMedica e) {
		this.e.persist(e);
		
	}

	@Override
	public CitaMedica buscarPorNumero(Integer numero) {
		TypedQuery<CitaMedica> myTypedQuery = (TypedQuery<CitaMedica>) this.e
				.createQuery("select c from CitaMedica c where c.numero=:valor");
		myTypedQuery.setParameter("valor", numero);

		return myTypedQuery.getSingleResult();
	}

}
