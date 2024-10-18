package pe.com.cibertec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoletaController {
	@GetMapping("/boleta") //aca se rutea la pagina
    public String boleta() {
        return "Boleta"; // Nombre del archivo HTML sin la extensión
    }
}
