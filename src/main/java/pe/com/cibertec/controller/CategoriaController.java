package pe.com.cibertec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoriaController {

		@GetMapping("/registrarCategoria")
		public String registrarCategoria() {
			return "registrarCategoria";
		}
}
