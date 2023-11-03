package com.egg.BautismoSpring.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HolaMundoController {
    @GetMapping("/sumar/{num1}/{num2}")
    //Se utiliza para cargar datos o generar el "linck"
public String saludo(@PathVariable String usuario){
    return "Hola usuario " + usuario;
}
public int suma(int n1, int n2){
        int total = n1 + n2;
        return total;
}
}
