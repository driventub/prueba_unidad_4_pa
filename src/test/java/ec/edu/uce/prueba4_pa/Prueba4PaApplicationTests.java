package ec.edu.uce.prueba4_pa;


import javax.transaction.Transactional;


import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;



@SpringBootTest
@Rollback(true)
@Transactional
class Prueba4PaApplicationTests {
	@Test
	void contextLoads() {

	}
}
