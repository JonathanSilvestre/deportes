package mx.uam.integracion.deportes.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")

public class entrenadorescontroller {
    @GetMapping("/test")
    public String test() {
        return "hola mundo";
    }
}
