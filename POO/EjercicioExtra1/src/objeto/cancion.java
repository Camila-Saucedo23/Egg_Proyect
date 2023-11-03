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
public class cancion {
    private String cancion;
    private String autor;
    private String nombre;

    public cancion(String cancion, String autor, String nombre) {
        this.cancion = cancion;
        this.autor = autor;
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
   

    public cancion() {
    }

    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    @Override
    public String toString() {
        return "cancion{" + "cancion=" + cancion + '}';
    }
    
}
