/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author camis
 */
public class RevolverAgua {
    private Integer posicionagua;
    private Integer posicionInicio;

    public RevolverAgua() {
    }

    public RevolverAgua(Integer posicionagua, Integer posicionInicio) {
        this.posicionagua = posicionagua;
        this.posicionInicio = posicionInicio;
    }

public void Llenarrevolver(){
    this.posicionagua = (int)(Math. random()*5);
    this.posicionInicio = (int)(Math. random()*5);
}    
public Boolean Mojar(){
    boolean mojar = false;
    if (this.posicionagua==this.posicionInicio) {
        mojar = true;
    }
    return mojar;
}
public void SigTiro(){
    this.posicionInicio = this.posicionInicio++;
    
}

    @Override
    public String toString() {
        return "La posicion del agua es " + posicionagua +" tiro, la posicion Inicio " + posicionInicio + " tiro";
    }

}
