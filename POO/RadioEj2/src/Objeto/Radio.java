/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objeto;

/**
 *
 * @author camis
 */
public class Radio {
    private float radio ;

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public Radio() {
    }

    public Radio(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Radio{" + "radio=" + radio + '}';
    }
    
}
