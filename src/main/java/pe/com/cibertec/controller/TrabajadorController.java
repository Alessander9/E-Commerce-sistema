package pe.com.cibertec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TrabajadorController {
		@GetMapping("/registrarTrabajador")
		public String registrarTrabajador() {
			return "registrarTrabajador";
		}
}
