/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import objeto.Pelicula;
import utilidades.comparadores1;

/**
 *
 * @author camis
 */
public class PeliculaService {

    Scanner leer = new Scanner(System.in);
    ArrayList<Pelicula> peli = new ArrayList();

    public void Cargarpeli() {

        String op;

        do {
            Pelicula p1 = new Pelicula();
            System.out.println("Ingrese el nombre de la Pelicula");
            p1.setNombre(leer.next());
            System.out.println("Ingrese el director de la pelicula");
            p1.setDirector(leer.next());
            System.out.println("Ingrese la duracion de la peli en horas");
            p1.setDuracion(leer.nextInt());
            peli.add(p1);
            System.out.println("-----------");
            System.out.println("Quiere ingresar otra pelicula?");
            System.out.println("");
            op = leer.next();
        } while (op.equalsIgnoreCase("si"));
    }

    public void Mostrarpeli() {
        peli.forEach((aux) -> System.out.println(aux));
    }

    public void pelidemasdeunahora() {
        for (Pelicula pelicula : peli) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula.toString());
            }
        }
    }

    public void duracionasc() {
        Collections.sort(peli, comparadores1.ordenduracionasc);
        peli.forEach((aux) -> System.out.println(aux));

    }

    public void duraciondec() {
        Collections.sort(peli, comparadores1.ordenduraciondec);
        peli.forEach((aux) -> System.out.println(aux));
    }

    public void nombrealf() {
        Collections.sort(peli, comparadores1.ordenarpornombre);
        peli.forEach((aux) -> System.out.println(aux));
    }

    public void directoralf() {
        Collections.sort(peli, comparadores1.ordenpordirector);
        peli.forEach((aux) -> System.out.println(aux));
    }
}
