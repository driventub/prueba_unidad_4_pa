package ec.edu.uce.prueba4_pa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ec.edu.uce.prueba4_pa.modelo.Doctor;
import ec.edu.uce.prueba4_pa.service.IDoctorService;

@Controller
// se deberia poner en plural
@RequestMapping("/estudiantes")
public class DoctorController {

// 	@Autowired
// 	private IDoctorService estuService;

// 	@RequestMapping("/buscar/{idDoctor}")
// 	@GetMapping("/buscar/{idDoctor}")
// //	@RequestMapping(path = "/buscar/{idDoctor}", method = RequestMethod.GET)
// 	public String obtenerUsuario(@PathVariable("idDoctor") Integer idDoctor, Model modelo) {

// 		Doctor estu = this.estuService.buscar(idDoctor);
// //		Doctor estu = new Doctor();
// //		estu.setId(idDoctor);
// //		estu.setNombre("Ana");
// //		estu.setApellido("Marin");

// 		modelo.addAttribute("estu", estu);
// 		return "estudiante";
// 	}

// 	@GetMapping("todos")
	
// 	public String buscarTodos(Model modelo) {
// 		List<Doctor> listaDoctors = this.estuService.buscarTodos();
// 		modelo.addAttribute("estudiantes", listaDoctors);
// 		return "lista";
// 	}

// //	Se necesitan dos paginas
// 	@PostMapping("/insertar")
// 	public String insertarDoctor(Doctor estudiante, BindingResult result, Model modelo,
// 			RedirectAttributes redirectAttrs) {

// 		this.estuService.insertar(estudiante);

// 		return "redirect:todos";
// 	}

// //	@PostMapping("/insertar")
// //	public String insertarDoctor(Doctor estudiante, BindingResult result, Model modelo) {
// //		
// //		this.estuService.insertar(estudiante);
// //		
// //		return "lista";
// //	}

// 	@GetMapping("/estudianteNuevo")
// 	// Comentario
// 	public String obtenerDato(Doctor estudiante) {
// 		return "estudiante_nuevo";

// 	}

// //	Actualizar

// 	@GetMapping("estudianteActualiza/{idDoctor}")
// 	public String obtenerActualizar(@PathVariable("idDoctor") Integer idDoctor, Doctor estudiante,
// 			Model modelo) {
// 		Doctor estu = this.estuService.buscar(idDoctor);
// 		modelo.addAttribute("estu", estu);
// 		return "estudiante_actualiza";
// 	}
	
	
	
// 	@PutMapping("actualizar/{idDoctor}")
// 	public String actualizarDoctor(@PathVariable("idDoctor") Integer idDoctor, Doctor estudiante,
// 			BindingResult result, Model modelo, RedirectAttributes redirectAttrs) {
// 		estudiante.setId(idDoctor);
// 		this.estuService.actualizar(estudiante);
// //		List<Doctor> listaDoctors = this.estuService.buscarTodos();
// //		modelo.addAttribute("estudiantes", listaDoctors);
// 		return "redirect:/estudiantes/todos";
// 	}



// 	@DeleteMapping("borrar/{idDoctor}")
// 	public String eliminarDoctor(@PathVariable("idDoctor") Integer idDoctor, Model modelo) {
// 		this.estuService.eliminar(idDoctor);
// //		List<Doctor> listaDoctors = this.estuService.buscarTodos();
// //		modelo.addAttribute("estudiantes", listaDoctors);
// 		return "redirect:/estudiantes/todos";
// 	}

}
