/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejeextra3herencia;

/**
 *
 * @author camis
 */
public class Hotel4estrellas extends Hoteles {

    protected int capacidadREstaurante;
    protected String nombreRestaurante;
    protected char gimnasio;

    public Hotel4estrellas() {
    }

    public Hotel4estrellas(int capacidadREstaurante, String nombreRestaurante, char gimnasio, int cantHabitaciones, int nrocamas, int cantpisos, int preciohabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, nrocamas, cantpisos, preciohabitaciones, nombre, direccion, localidad, gerente);
        this.capacidadREstaurante = capacidadREstaurante;
        this.nombreRestaurante = nombreRestaurante;
        this.gimnasio = gimnasio;
    }

    @Override
    public int PrecioHabitaciones() {
        
        int valorRestaurante = 0, valorgim = 0;
        if (capacidadREstaurante < 30) {
            valorRestaurante = 10;
        } else if ((capacidadREstaurante > 30) && (capacidadREstaurante < 50)) {
            valorRestaurante = 30;
        } else if (capacidadREstaurante > 50) {
            valorRestaurante = 50;
        }
        if (gimnasio == 'A') {
            valorgim = 50;
        } else if (gimnasio == 'B') {
            valorgim = 30;
        }
        int precio4 = super.PrecioHabitaciones();
        precio4 = precio4 + valorRestaurante + valorgim;
        System.out.println("El valor de la habietacion es de: $" + precio4 );
        return precio4;
    }

    @Override
    public void CargarDatos() {
        super.CargarDatos();
        System.out.println("Extras");
        System.out.println("Nombre y capacidad del Restaurante ");
        nombreRestaurante = leer.next();
        capacidadREstaurante = leer.nextInt();
        System.out.println("Tipo de gimnasio: A o B");
        gimnasio = leer.next().charAt(gimnasio);
    }

}
