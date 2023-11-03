/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author camis
 */
public class TiendaService {

    //llave = elemento // valor = precio 
    Scanner leer = new Scanner(System.in);
    HashMap<String, Integer> cosas = new HashMap();

    public void Agregar() {
        //agregar objeto cosa
        System.out.println("Ingrese la cosa a guardar");
        String cosa = leer.next();
        System.out.println("Ingrese el precio de la cosa");
        Integer precio = leer.nextInt();
        cosas.put(cosa, precio);
    }

    public void Modificar() {
        //modificar el precio de la cosa (el valor)
        System.out.println("Ingrese la cosa a cambiar el precio");
        String busca = leer.next();
        for (Map.Entry<String, Integer> entry : cosas.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (key.equalsIgnoreCase(busca)) {
                System.out.println("Ingrese el nuevo precio de la cosa");
                Integer nv = leer.nextInt();
                entry.setValue(nv);
                System.out.println("El nuevo valor es :");
                System.out.println("la cosa " + entry.getKey() + " tiene un valor de : " + entry.getValue());
            }

        }

    }

    public void Borrar() {
        //borrar cosa
        System.out.println("Ingrese la cosa a borrar");
        String buscar = leer.next();
//        for (Map.Entry<String, Integer> entry : cosas.entrySet()) {
//            String key = entry.getKey();
//            Integer value = entry.getValue();
//            if (key.equalsIgnoreCase(buscar)) {
//                cosas.remove(entry.getKey());
//            }
//        }
        if (cosas.containsKey(buscar)) {
            cosas.remove(buscar);
        }
        
    }

    public void Mostrar() {
        //mostrar la cosa con su precio
        for (Map.Entry<String, Integer> entry : cosas.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("La cosa " + entry.getKey() + " tiene un precio de " + entry.getValue());
        }
    }
}
