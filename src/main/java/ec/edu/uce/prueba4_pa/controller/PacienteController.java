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

import ec.edu.uce.prueba4_pa.modelo.Paciente;
import ec.edu.uce.prueba4_pa.service.IPacienteService;

@Controller
// se deberia poner en plural
@RequestMapping("/estudiantes")
public class PacienteController {

// 	@Autowired
// 	private IPacienteService estuService;

// 	@RequestMapping("/buscar/{idPaciente}")
// 	@GetMapping("/buscar/{idPaciente}")
// //	@RequestMapping(path = "/buscar/{idPaciente}", method = RequestMethod.GET)
// 	public String obtenerUsuario(@PathVariable("idPaciente") Integer idPaciente, Model modelo) {

// 		Paciente estu = this.estuService.buscar(idPaciente);
// //		Paciente estu = new Paciente();
// //		estu.setId(idPaciente);
// //		estu.setNombre("Ana");
// //		estu.setApellido("Marin");

// 		modelo.addAttribute("estu", estu);
// 		return "estudiante";
// 	}

// 	@GetMapping("todos")
	
// 	public String buscarTodos(Model modelo) {
// 		List<Paciente> listaPacientes = this.estuService.buscarTodos();
// 		modelo.addAttribute("estudiantes", listaPacientes);
// 		return "lista";
// 	}

// //	Se necesitan dos paginas
// 	@PostMapping("/insertar")
// 	public String insertarPaciente(Paciente estudiante, BindingResult result, Model modelo,
// 			RedirectAttributes redirectAttrs) {

// 		this.estuService.insertar(estudiante);

// 		return "redirect:todos";
// 	}

// //	@PostMapping("/insertar")
// //	public String insertarPaciente(Paciente estudiante, BindingResult result, Model modelo) {
// //		
// //		this.estuService.insertar(estudiante);
// //		
// //		return "lista";
// //	}

// 	@GetMapping("/estudianteNuevo")
// 	// Comentario
// 	public String obtenerDato(Paciente estudiante) {
// 		return "estudiante_nuevo";

// 	}

// //	Actualizar

// 	@GetMapping("estudianteActualiza/{idPaciente}")
// 	public String obtenerActualizar(@PathVariable("idPaciente") Integer idPaciente, Paciente estudiante,
// 			Model modelo) {
// 		Paciente estu = this.estuService.buscar(idPaciente);
// 		modelo.addAttribute("estu", estu);
// 		return "estudiante_actualiza";
// 	}
	
	
	
// 	@PutMapping("actualizar/{idPaciente}")
// 	public String actualizarPaciente(@PathVariable("idPaciente") Integer idPaciente, Paciente estudiante,
// 			BindingResult result, Model modelo, RedirectAttributes redirectAttrs) {
// 		estudiante.setId(idPaciente);
// 		this.estuService.actualizar(estudiante);
// //		List<Paciente> listaPacientes = this.estuService.buscarTodos();
// //		modelo.addAttribute("estudiantes", listaPacientes);
// 		return "redirect:/estudiantes/todos";
// 	}



// 	@DeleteMapping("borrar/{idPaciente}")
// 	public String eliminarPaciente(@PathVariable("idPaciente") Integer idPaciente, Model modelo) {
// 		this.estuService.eliminar(idPaciente);
// //		List<Paciente> listaPacientes = this.estuService.buscarTodos();
// //		modelo.addAttribute("estudiantes", listaPacientes);
// 		return "redirect:/estudiantes/todos";
// 	}

}
