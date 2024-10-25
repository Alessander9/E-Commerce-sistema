package pe.com.cibertec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VerProductoController {

    @GetMapping("/verProductos")
    public String verProductos() {
        return "verProductos"; // Nombre del archivo HTML de la vista sin la extensión .html
    }
}