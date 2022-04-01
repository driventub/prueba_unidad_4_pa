package ec.edu.uce.prueba4_pa.service;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;

import javax.transaction.Transactional;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.not;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import ec.edu.uce.prueba4_pa.modelo.Doctor;
import ec.edu.uce.prueba4_pa.modelo.Paciente;
import ec.edu.uce.prueba4_pa.service.IDoctorService;
import ec.edu.uce.prueba4_pa.service.IPacienteService;

@SpringBootTest
@Rollback(true)
@Transactional
class DoctorServiceImplTest {

	

	@Autowired
	private IDoctorService doctService;

	
	
	@Test
	void testDoctor() {
        Doctor d1 = new Doctor();

        d1.setCedula("190463874-8");
		d1.setNombre("Agustina");
		d1.setApellido("Cardoso");
		d1.setFechaNacimiento(LocalDateTime.of(1997,Month.MAY,2,12,45));
		d1.setNumeroConsultorio(202);
		d1.setCodigoSenescyt(388382);
		d1.setSueldo(new BigDecimal("4000.00"));

        this.doctService.insertar(d1);

		Doctor d = this.doctService.buscar(d1.getId());
		assertThat("Agustina", equalTo(d.getNombre()));

	}


	

}
