/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author camis
 */
public class Libro {
    private String nombre;
    private String autor;
    private String nropaginas;

    public Libro(String nombre, String autor, String nropaginas) {
        this.nombre = nombre;
        this.autor = autor;
        this.nropaginas = nropaginas;
    }

   

    public Libro() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNropaginas() {
        return nropaginas;
    }

    public void setNropaginas(String nropaginas) {
        this.nropaginas = nropaginas;
    }
     @Override
    public String toString() {
        return "El nombre del libro es =" + nombre + ", escrito por =" + autor + ", posee =" + nropaginas + " número de páginas.";
    }
}
