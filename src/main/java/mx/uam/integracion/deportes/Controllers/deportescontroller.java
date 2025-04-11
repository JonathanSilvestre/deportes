package mx.uam.integracion.deportes.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class deportescontroller {

    @GetMapping("/test")
    public String test() {
        return "hola mundo";
    }
}
