/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author camis
 */
public class Pelicula {
    //el título, duración, edad mínima y director
    private String titulo, director;
    private int duracion;
    private int edadmin;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int duracion, int edadmin) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.edadmin = edadmin;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadmin() {
        return edadmin;
    }

    public void setEdadmin(int edadmin) {
        this.edadmin = edadmin;
    }

    @Override
    public String toString() {
        return "La peli" + titulo + ", dirigida por: " + director + ", dura" + duracion + " hs , apta para mayores de: " + edadmin ;
    }
    
}
