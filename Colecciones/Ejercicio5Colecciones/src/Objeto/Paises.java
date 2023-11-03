/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objeto;

import java.util.Comparator;

/**
 *
 * @author camis
 */
public class Paises implements Comparator<Paises> {

    private String nombre;

    public Paises() {
    }

    public Paises(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Paises{" + "nombre=" + nombre + '}';
    }

    @Override
    public int compare(Paises t, Paises t1) {
        return t.nombre.compareToIgnoreCase(t1.getNombre());
    }

}
