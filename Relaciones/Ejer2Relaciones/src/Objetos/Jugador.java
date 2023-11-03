/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author camis
 */
public class Jugador {

    private Integer ID;
    private String nombre;
    private Boolean mojado;

    public Jugador(Integer ID, String nombre, Boolean mojado) {
        this.ID = ID;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "ID=" + ID + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }

    
    
    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Jugador(Integer ID, String nombre) {
        this.ID = ID;
        this.nombre = nombre;
    }

    public Jugador() {
    }
    

    public Boolean disparo(RevolverAgua r) {
        this.mojado = r.Mojar();
        r.SigTiro();
        return mojado;
    }
}

