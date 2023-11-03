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
public class Fraccion {
    private int num;
    private int num2;
    private int den;
    private int den2;

    public Fraccion() {
    }

    public Fraccion(int num, int num2, int den, int den2) {
        this.num = num;
        this.num2 = num2;
        this.den = den;
        this.den2 = den2;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }

    public int getDen2() {
        return den2;
    }

    public void setDen2(int den2) {
        this.den2 = den2;
    }
    
}
