package pe.com.cibertec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteController {
    
    @GetMapping("/frmcliente")
    public String cliente() {
        return "frmCliente"; // Nombre del archivo HTML sin la extensión
    }
}

