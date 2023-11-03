/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import objeto.Alumno;

/**
 *
 * @author camis
 */
public class AlumnoService {

    Scanner leer = new Scanner(System.in);
    ArrayList<Alumno> alumnos = new ArrayList();

    public void CargarAlumno() {
        int op;

        do {
            System.out.println("----MENÚ----");
            System.out.println("1- cargar datos alumno");
            System.out.println("2- Salir ");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    Alumno a1 = new Alumno();
                    System.out.println("Ingresa el nombre del alumno");
                    a1.setNombre(leer.next());
                    ArrayList<Integer> nota = new ArrayList();
                    System.out.println("Ingrese las 3 notas del alumno");
                    Integer n1 = leer.nextInt();
                    Integer n2 = leer.nextInt();
                    Integer n3 = leer.nextInt();
                    nota.add(n1);
                    nota.add(n2);
                    nota.add(n3);
                    a1.setNotas(nota);
                    alumnos.add(a1);
                    break;
                case 2:
                    System.out.println("Saliendoo");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        } while (op != 2);
        System.out.println(".......");
        System.out.println("Lista de alumnos actual");
        alumnos.forEach((e) -> System.out.println(e));
        System.out.println(".......");
    }

    public void notaFinal() {
        System.out.println("Ingrese el nombre del alumno a buscar");
        String Alumbuscado = leer.next();
        Integer cont = 0;
        
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(Alumbuscado)) {
                ArrayList<Integer> nta = alumno.getNotas();
                Double prom = ((nta.get(0)+nta.get(1)+nta.get(2))/3.0);
                System.out.println("El alumno "+Alumbuscado+" tiene una nota final de "+prom);
                cont++;
            }
        }
        if (cont==0) {
            System.out.println("El alumno no esta en la lista");
        }
    }
    
    public void notafinaliterator(){
        System.out.println("Ingrese alumno a buscar");
        String alum1 = leer.next();
       
        Iterator <Alumno> it =  alumnos.iterator();
        while (it.hasNext()) {
            if (it.next().getNombre().equals(alum1)) {
                 
                 Integer promedio = ((5+5+5) / 3);
                 System.out.println("El alumno " + it.next().getNombre() + "tiene un promedio de " + promedio);          
            } 
        }
    }
    }

