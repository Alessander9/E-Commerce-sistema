package pe.com.cibertec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductoController {
		@GetMapping("/productos")
		public String productos() {
			return "productos";
		}
}