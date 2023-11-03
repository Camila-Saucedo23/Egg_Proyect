/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author camis
 */
public class Persona {
    private String nombre;
    private String apellido;
    private DNI DNI;

    public Persona() {
    }

    public Persona(String nombre, String apellido, DNI DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public DNI getDNI() {
        return DNI;
    }

    public void setDNI(DNI DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "La Persona " + nombre + " " + apellido + " de " + DNI ;
    }
    
}
