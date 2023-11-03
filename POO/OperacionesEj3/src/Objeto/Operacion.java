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
public class Operacion {
    private int nro1;
    private int nro2;

    public Operacion(int nro1, int nro2) {
        this.nro1 = nro1;
        this.nro2 = nro2;
    }

    public Operacion() {
    }
    

    public int getNro1() {
        return nro1;
    }

    public void setNro1(int nro1) {
        this.nro1 = nro1;
    }

    public int getNro2() {
        return nro2;
    }

    public void setNro2(int nro2) {
        this.nro2 = nro2;
    }

    @Override
    public String toString() {
        return "Operacion{" + "nro1=" + nro1 + ", nro2=" + nro2 + '}';
    }
    
    
    
}
