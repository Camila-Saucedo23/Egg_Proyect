/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Objeto.Paises;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author camis
 */
public class PaisesService {

    Scanner leer = new Scanner(System.in);
    HashSet<String> Pais = new HashSet();

    public void Cargarpais() {
        Integer op;

        do {
            Paises P1 = new Paises();
            System.out.println("---MENU---");
            System.out.println("1- Ingresar país");
            System.out.println("2- Salir del menú");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    P1.setNombre(leer.next());
                    Pais.add(P1.getNombre());
                    break;
                case 2:
                    System.out.println("Saliendo del menú");
                    break;
                default:
                    System.out.println("ERROR");
                    System.out.println("Ingrese una opcion valida");
            }
        } while (op != 2);

    }

    public void Mostrarconjunto() {
        System.out.println("La lista ordenada alfabeticamente de los paises ingresados es :");
        for (String Paise : Pais) {
            System.out.println(Paise);
        }
    }

    public void BorarPais() {
        System.out.println("Ingrese el pais que desea borrar");
        String pa = leer.next();
        int cont = Pais.size();
        Iterator<String> it = Pais.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(pa)) {
                it.remove();
            }
        }
        if (cont == Pais.size()) {
            System.out.println("El pais que busca no se encuentra guardado");
        }
        System.out.println("----La lista sin ese pais es----");
        for (String Pai : Pais) {
            System.out.println(Pai);
        }
    }

}
