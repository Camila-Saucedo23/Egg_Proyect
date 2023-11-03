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
public class Cafetera {
     private int Max ;
    private int Actual;
    private int Taza;

    public int getMax() {
        return Max;
    }

    public void setMax(int Max) {
        this.Max = Max;
    }

    public int getActual() {
        return Actual;
    }

    public void setActual(int Actual) {
        this.Actual = Actual;
    }

    public int getTaza() {
        return Taza;
    }

    public void setTaza(int Taza) {
        this.Taza = Taza;
    }

    public Cafetera(int Max, int Actual, int Taza) {
        this.Max = Max;
        this.Actual = Actual;
        this.Taza = Taza;
    }

    public Cafetera() {
    }

}
   