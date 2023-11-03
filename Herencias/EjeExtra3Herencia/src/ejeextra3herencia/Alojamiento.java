/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejeextra3herencia;

import java.util.Scanner;

/**
 *
 * @author camis
 */
public class Alojamiento {
    Scanner leer = new Scanner(System.in);
    protected String nombre, direccion,localidad,gerente;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }
    
    public void CargarDatos(){
        System.out.println("Ingrese nombre del establecimiento");
        nombre = leer.next();
        System.out.println("Direccion: ");
        direccion = leer.next();
        System.out.println("Localidad: ");
        localidad = leer.next();
        System.out.println("Nombre del Gerente a cargo: ");
        gerente = leer.next();
    }
     public int PrecioHabitaciones(){
        int precio = 0 ; 
        return precio;
    }
    
}
