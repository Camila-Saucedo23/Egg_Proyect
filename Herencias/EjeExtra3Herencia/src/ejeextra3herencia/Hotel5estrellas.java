/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejeextra3herencia;

/**
 *
 * @author camis
 */
public class Hotel5estrellas extends Hotel4estrellas {
    private int cantsalones,cantsuites,cantlimosinas;

    public Hotel5estrellas() {
    }

    public Hotel5estrellas(int cantsalones, int cantsuites, int cantlimosinas, int capacidadREstaurante, String nombreRestaurante, char gimnasio, int cantHabitaciones, int nrocamas, int cantpisos, int preciohabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(capacidadREstaurante, nombreRestaurante, gimnasio, cantHabitaciones, nrocamas, cantpisos, preciohabitaciones, nombre, direccion, localidad, gerente);
        this.cantsalones = cantsalones;
        this.cantsuites = cantsuites;
        this.cantlimosinas = cantlimosinas;
    }

    @Override
    public void CargarDatos() {
        super.CargarDatos(); 
        System.out.println("ingrese la cantidad de salones de conferencia");
        cantsalones = leer.nextInt();
        System.out.println("¿Cuántas suites tiene?");
        cantsuites = leer.nextInt();
        System.out.println("¿Cuántas limosinas tiene en total?");
        cantlimosinas = leer.nextInt();
    }

    @Override
    public int PrecioHabitaciones() {
        int precio5 = super.PrecioHabitaciones(); 
        precio5 = precio5 + (15 * cantlimosinas);
        System.out.println("El precio de la habitacion es de: $" + precio5);
        return precio5;
    }
    
}
