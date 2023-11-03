/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objeto;

/**
 *
 * @author camis
 */
public class Pelicula {
    private String nombre;
    private String director;
    private Integer duracion;

    public Pelicula() {
    }

    public Pelicula(String nombre, String director, Integer duracion) {
        this.nombre = nombre;
        this.director = director;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "La pelicula" + nombre + "dirigida por " + director + ", con una duracion de " + duracion + " Horas ";
    }
    
}
