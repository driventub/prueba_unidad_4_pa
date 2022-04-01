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
class PacienteServiceImplTest {

	@Autowired
	private IPacienteService paciService;



	@Test
	void testPaciente() {
        Paciente p1 = new Paciente();
		


		p1.setCedula("1438290134-9");
		p1.setNombre("Fernando");
		p1.setApellido("Alonso");
		p1.setFechaNacimiento(LocalDateTime.of(2001,Month.AUGUST,22,12,45));
		
		p1.setCodigoIess("34234234");
		p1.setEstatura(new BigDecimal("1.9"));
		p1.setPeso(new BigDecimal("55.4"));
		

		p1.setEdad(18);

        this.paciService.insertar(p1);

		Paciente p = this.paciService.buscar(p1.getId());
		
		assertThat(p1.getApellido(), equalTo(p.getApellido()) );

	}
	


	

}
