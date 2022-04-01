package ec.edu.uce.prueba4_pa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ec.edu.uce.prueba4_pa.modelo.CitaMedica;
import ec.edu.uce.prueba4_pa.service.ICitaMedicaService;

@Controller
// se deberia poner en plural
@RequestMapping("/citasMedicas")
public class CitaMedicaController {

	@Autowired
	private ICitaMedicaService estuService;

// 	@RequestMapping("/buscar/{idCitaMedica}")
// 	@GetMapping("/buscar/{idCitaMedica}")
// //	@RequestMapping(path = "/buscar/{idCitaMedica}", method = RequestMethod.GET)
// 	public String obtenerUsuario(@PathVariable("idCitaMedica") Integer idCitaMedica, Model modelo) {

// 		CitaMedica estu = this.estuService.buscar(idCitaMedica);
// //		CitaMedica estu = new CitaMedica();
// //		estu.setId(idCitaMedica);
// //		estu.setNombre("Ana");
// //		estu.setApellido("Marin");

// 		modelo.addAttribute("estu", estu);
// 		return "cita_medica";
// 	}

	@GetMapping("todos")
	
	public String buscarTodos(Model modelo) {
		List<CitaMedica> listaCitaMedicas = this.estuService.buscarTodos();
		modelo.addAttribute("estudiantes", listaCitaMedicas);
		return "lista";
	}

//	Se necesitan dos paginas
	@PostMapping("/insertar")
	public String insertarCitaMedica(CitaMedica citaMedica, BindingResult result, Model modelo,
			RedirectAttributes redirectAttrs) {

		this.estuService.insertar(citaMedica);

		return "redirect:todos";
	}

//	@PostMapping("/insertar")
//	public String insertarCitaMedica(CitaMedica estudiante, BindingResult result, Model modelo) {
//		
//		this.estuService.insertar(estudiante);
//		
//		return "lista";
//	}

	@GetMapping("/citaMedicaNueva")
	// Comentario
	public String obtenerDato(CitaMedica citaMedica) {
		return "cita_nueva";

	}

//	Actualizar

	@GetMapping("citaActualiza/{idCitaMedica}")
	public String obtenerActualizar(@PathVariable("idCitaMedica") Integer idCitaMedica, CitaMedica estudiante,
			Model modelo) {
		CitaMedica estu = this.estuService.buscar(idCitaMedica);
		modelo.addAttribute("estu", estu);
		return "cita_actualiza";
	}
	
	
	
	@PutMapping("actualizar/{idCitaMedica}")
	public String actualizarCitaMedica(@PathVariable("idCitaMedica") Integer idCitaMedica, CitaMedica estudiante,
			BindingResult result, Model modelo, RedirectAttributes redirectAttrs) {
		estudiante.setId(idCitaMedica);
		this.estuService.actualizar(estudiante);
//		List<CitaMedica> listaCitaMedicas = this.estuService.buscarTodos();
//		modelo.addAttribute("estudiantes", listaCitaMedicas);
		return "redirect:/citasMedicas/todos";
	}



// 	@DeleteMapping("borrar/{idCitaMedica}")
// 	public String eliminarCitaMedica(@PathVariable("idCitaMedica") Integer idCitaMedica, Model modelo) {
// 		this.estuService.eliminar(idCitaMedica);
// //		List<CitaMedica> listaCitaMedicas = this.estuService.buscarTodos();
// //		modelo.addAttribute("estudiantes", listaCitaMedicas);
// 		return "redirect:/estudiantes/todos";
// 	}

}
