/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejeextra3herencia;

/**
 *
 * @author camis
 */
public class AlojamientosextraHoteleros extends Alojamiento {
    protected int m2;
    protected boolean privado;

    public AlojamientosextraHoteleros() {
    }

    public AlojamientosextraHoteleros(int m2, boolean privado, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.m2 = m2;
        this.privado = privado;
    }

    @Override
    public void CargarDatos() {
        System.out.println("Cargando datos del alojamiento");
        super.CargarDatos(); 
        System.out.println("¿Cuántos m2 tiene?");
        m2 = leer.nextInt();
        System.out.println("¿Es privado? si/no");
        String op = leer.next();
        if (op.equalsIgnoreCase("si")) {
            privado = true;
        }else if (op.equalsIgnoreCase("no")){
            privado = false;
        }
    }
    
}
