package mx.uam.integracion.deportes.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class sesionescontroller {
    @GetMapping("/test")
    public String test(){
        return "Hola mundo";
    }
}
