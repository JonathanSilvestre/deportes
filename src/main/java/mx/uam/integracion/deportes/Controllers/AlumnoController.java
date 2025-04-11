package mx.uam.integracion.deportes.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class AlumnoController {
    @GetMapping("/test")
    public String test() {
        return "Hola mundo!";
    }
}
