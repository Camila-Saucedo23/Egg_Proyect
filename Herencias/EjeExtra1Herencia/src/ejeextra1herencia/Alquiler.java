/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejeextra1herencia;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author camis
 */
public class Alquiler {
    Scanner leer = new Scanner(System.in);
    private String nombre;
    private int DNI;
    protected LocalDate fechainicial,fechafinal;
    private int amarre;

    public Alquiler() {
    }

    public Alquiler(String nombre, int DNI, LocalDate fechainicial, LocalDate fechafinal, int amarre) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechainicial = fechainicial;
        this.fechafinal = fechafinal;
        this.amarre = amarre;
    }
    
    public int Cargardatosalquiler(){
        System.out.println("Ingrese nombre y DNI del dueño del barco");
        nombre = leer.next();
        DNI = leer.nextInt();
        System.out.println("ingrese fecha de inicio de alquiler");
        System.out.println("dia");
        int dia = leer.nextInt();
        System.out.println("mes");
        int mes = leer.nextInt();
        System.out.println("año");
        int anio = leer.nextInt();
       fechainicial= LocalDate.of(anio, mes, dia);
        System.out.println("La fecha indicada es: " + fechainicial);
        System.out.println("-----------------");
        System.out.println("ingrese la fecha de finalizacion del alquiler");
        System.out.println("dia");
        int diaf = leer.nextInt();
        System.out.println("mes");
        int mesf = leer.nextInt();
        System.out.println("año");
        int aniof = leer.nextInt();
        fechafinal  = LocalDate.of(aniof, mesf, diaf);
        System.out.println("La fecha indicada es: " + fechafinal);
        System.out.println("-----------------");
        System.out.println("Indique el numero del muelle de amarre");
        amarre = leer.nextInt();
        long diasAlquiler = ChronoUnit.DAYS.between(fechainicial, fechafinal);
        int diasalquiler = (int) diasAlquiler;
        System.out.println("Los dias de alquiler a cobrar son: " + diasalquiler);
        return diasalquiler;
    }

    
}
