package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// En general los services funcionan para trabajar con la base de datos o con los dao
// Aqui se trabaja con los datos y realizan consultas y operaciones para implementar un crud
// los dao podrían interactuar entre si con un único método

// Los service tambien se podrian comunicar mediante una API REST utilizando un cliente http

// Ejemplo sin inyección de dependencia
// public class MiServicio {
//     public String operacion(){
//
//         return "Ejecucion de un proceso importante...";
//     }
//
//
// }
// Fin del ejemplo sin dependencia

// Para iniciar con el service a usarlo dentro del contenedor de Spring es necesario anotarlo
// como un componente con la notación @Component, de esta manera esta clase se agrega como un
// bean de Spring con el contexto por defecto, se crea una sola vez en la aplicación, es un
// "singleton" (una única instancia que se distribuye y puede inyectar en otros componentes
// de la aplicación. Debe estar dentro del package base (obviamente dentro de su propio package)

// Otra notación que es un estereotipo de componente es @Service que aporta una semántica, es decir,
// algo descriptivo que esta clase representa un servicio

//@Component 
@Service
public class MiServicio {
    public String operacion(){
        return "Ejecucion de un proceso importante...";
    }

}
