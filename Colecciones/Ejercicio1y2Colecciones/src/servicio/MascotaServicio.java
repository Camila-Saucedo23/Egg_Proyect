/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import objetos.Mascota;
import utilidaes.comparadores;

/**
 *
 * @author camis
 */
public class MascotaServicio {

    Scanner leer = new Scanner(System.in);
    ArrayList<Mascota> Razas = new ArrayList();

    public void menu() {
        int op = 0;
        do {
            System.out.println(" MENU ");
            System.out.println("1- Crear Raza ");
            System.out.println("2- Salir ");

            op = leer.nextInt();
            switch (op) {
                case 1:
                    cargarRaza(Razas);
                    break;
                case 2:
                    System.out.println("Saliendoo");
                    break;

                default:
                    System.out.println("Ingrese una opcion valida");
            }
        } while (op != 2);
        
        for (Mascota Raza : Razas) {
            System.out.println(Raza);
        }
        BorrarMascota();
        }

    public void BorrarMascota() {
        System.out.println("Ingrese una raza a buscar");
        String raza1 = leer.next();
        int cont = Razas.size();
         Iterator<Mascota> it = Razas.iterator();
        while (it.hasNext()) {
            if (it.next().getRaza().equals(raza1)) {
                it.remove();
            }
        }
        if (cont == Razas.size()) {
            System.out.println("NO ESTA!!!!");
        }
       
         for (Mascota Raza : Razas) {
            System.out.println(Raza);
        }
         System.out.println("orden ascendente");
        Collections.sort(Razas, comparadores.ordenarporrazaasc);
         for (Mascota Raza : Razas) {
            System.out.println(Raza);
        }
         System.out.println("orden descendente");
        Collections.sort(Razas, comparadores.ordenarporrazadec);
        
        for (Mascota Raza : Razas) {
            System.out.println(Raza);
        }
        

    }

    public void cargarRaza(ArrayList<Mascota> Razas) {
        Mascota p1 = new Mascota();
        System.out.println("Ingrese la raza de su perro");
        p1.setRaza(leer.next());
        Razas.add(p1);
    }

}
