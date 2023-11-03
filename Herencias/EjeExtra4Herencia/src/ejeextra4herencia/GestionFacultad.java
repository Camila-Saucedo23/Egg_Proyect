/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejeextra4herencia;

import java.util.Scanner;

/**
 *
 * @author camis
 */
public class GestionFacultad {
    Scanner leer = new Scanner(System.in);
    //persona cualquiera : su nombre y apellidos, su número de identificación y su estado civil.
    protected int DNI;
    protected String nombre, apellido, estadocivil;

    public GestionFacultad() {
    }

    public GestionFacultad(int DNI, String nombre, String apellido, String estadocivil) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estadocivil= estadocivil;
    }
    
    public void CargarPersona(){
        System.out.println("---Formulario---");
        System.out.println("Nombre: ");
        nombre = leer.next();
        System.out.println("Apellido: ");
        apellido = leer.next();
        System.out.println("DNI: ");
        DNI = leer.nextInt();
        System.out.println("Estado Civil: ");
        estadocivil = leer.next();
    }
    public void CambioestadoCivil(){
        System.out.println("ingrese el estado civil actualizado");
        estadocivil= leer.next();
    }
   
}
