package com.bolsadeideas.springboot.di.app.controllers;

import com.bolsadeideas.springboot.di.app.models.service.MiServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    // -- Esta es la continuacion del apunte del archivo MiServicio --
    // En el controlador se implementa el service de modo que el controlador
    // interactua con los datos, en este ejemplo dado que es la parte sin inyeccion
    // de dependencias, se hara mediante el operador new con lo cual va a quedar acoplado
    // a esta clase en concreto, lo cual nos generara un problema de escalabilidad.

    // La solución al acoplamiento que generaría pérdida de tiempo por la configuración en
    // cada uno de los controladores que usarían al service, es el uso de inyección de datos
    // y de interfaces, con lo cual vamos a evitar instanciar al objeto, sino que a través de los
    // beans o componentes, el objeto llama e inyecta la instancia (de ahí viene el principio Hollywood
    // "No nos llames, nosotros te llamaremos" haciendo referencia a las instancias del objeto)

    // private MiServicio servicio = new MiServicio();

    // -- Continuación del apunte ya con desacoplamiento de la clase --
    // Ahora, en lugar de crear una nueva instancia, desacoplamos la clase MiServicio
    // ahora si se estará usando la inyección de datos, y para ello se usa la notación @Autowired
    // además, se elimina la palabra reservada new y la instancia, recordando que MiServicio ya
    // forma parte de los beans de Spring
    @Autowired
    private MiServicio servicio;

    @GetMapping({"/", "index", ""})
    public String index(Model model){
        model.addAttribute("titulo", "Inyeccion de dependencias (ejemplo sin inyeccion)");
        model.addAttribute("objeto", servicio.operacion());

        return "index";
    }


}
