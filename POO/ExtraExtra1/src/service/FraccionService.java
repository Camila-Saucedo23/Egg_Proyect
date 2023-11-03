/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Scanner;
import objeto.Fraccion;

/**
 *
 * @author camis
 */
public class FraccionService {

    Scanner leer = new Scanner(System.in);
    Fraccion F1 = new Fraccion();

    public Fraccion IngresoDatos() {
        System.out.println("Ingrese numerador y denominador de la primera fraccion");
        F1.setNum(leer.nextInt());
        F1.setDen(leer.nextInt());
        System.out.println("Ingrese numerador y denominador de la segunda fraccion");
        F1.setNum2(leer.nextInt());
        F1.setDen2(leer.nextInt());
        return F1;
    }

    public void Suma(Fraccion F1) {
        // num1/den3 + num4/den3
        if (F1.getDen() == F1.getDen2()) {
            int suma = F1.getNum() + F1.getNum2();
            System.out.println(suma + "/" + F1.getDen());

        } else {
            // num1/den3 + num4/den4 
            // num1*den4 + num4*den3 / den3*den4
            int suma1 = (F1.getNum() * F1.getDen2()) + (F1.getNum2() * F1.getDen());
            int sumad = (F1.getDen() * F1.getDen2());
            System.out.println(suma1 + "/" + sumad);
        }

    }

    public void Resta() {

        if (F1.getDen() == F1.getDen2()) {
            int resta = F1.getNum() - F1.getNum2();
            System.out.println(resta + "/" + F1.getDen());

        } else {

            int resta1 = (F1.getNum() * F1.getDen2()) - (F1.getNum2() * F1.getDen());
            int restad = (F1.getDen() * F1.getDen2());
            System.out.println(resta1 + "/" + restad);

        }
    }

    public void Multiplicacion() {

        if (F1.getDen() == F1.getDen2()) {
            int mult = F1.getNum() * F1.getNum2();
            int mult1 = F1.getDen() * F1.getDen2();
            System.out.println(mult + "/" + mult1);

        } else {
            int mult2 = (F1.getNum() * F1.getDen2());
            int mult3 = (F1.getNum2() * F1.getDen());
            System.out.println(mult2 + "/" + mult3);
        }
    }

    public void Division() {
         int div1 = F1.getNum()*F1.getDen2();
         int div2 = F1.getNum2()*F1.getDen();
         System.out.println(div1+"/"+div2);
    }
}
