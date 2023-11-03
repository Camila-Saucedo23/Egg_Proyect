/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author camis
 */
public class jugador {
    private int id;
    private String nombre;
    private boolean mojado;

    public jugador(int id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = false;
    }

    public jugador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    

    public jugador() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    @Override
    public String toString() {
        return "jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }

    
    public void disparar(revolver r){
        
        if (r.disparar()) {
            this.mojado= true; 
            System.out.println("el jugador "+ nombre + "se mojo");
        }
    }
    public boolean ismojado(){
        return mojado;
    }
    
}
