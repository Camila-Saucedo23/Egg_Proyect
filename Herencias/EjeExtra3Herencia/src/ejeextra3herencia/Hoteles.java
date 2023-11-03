/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejeextra3herencia;

/**
 *
 * @author camis
 */
public class Hoteles extends Alojamiento {
    protected int cantHabitaciones, nrocamas,cantpisos, preciohabitaciones;

    public Hoteles() {
    }
    
    public Hoteles(int cantHabitaciones, int nrocamas, int cantpisos, int preciohabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
        this.nrocamas = nrocamas;
        this.cantpisos = cantpisos;
        this.preciohabitaciones = preciohabitaciones;
    }

    public Hoteles(int cantHabitaciones, int nrocamas, int cantpisos, int preciohabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.nrocamas = nrocamas;
        this.cantpisos = cantpisos;
        this.preciohabitaciones = preciohabitaciones;
    }

    @Override
    public void CargarDatos() {
        super.CargarDatos(); 
        System.out.println("Cargando datos del hotel: ");
        System.out.println("¿Cuántas habitaciones tiene en todo el hotel?");
        cantHabitaciones = leer.nextInt();
        System.out.println("¿Cuántas camas tiene en todo el hotel?");
        nrocamas = leer.nextInt();
        System.out.println("¿Cuántos pisos tiene?");
        cantpisos = leer.nextInt();
    }

    @Override
    public int PrecioHabitaciones() {
     int precio = super.PrecioHabitaciones(); 
        precio = 50 + nrocamas;
        return precio;
    }
    
    
    
    
}
