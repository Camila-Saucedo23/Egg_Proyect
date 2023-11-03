/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Scanner;
import objeto.Raices;

/**
 *
 * @author camis
 */
public class SeriveRaiz {

    Scanner leer = new Scanner(System.in);
    //este menor <≤ que este // este mayor ≥> a este

    public Raices IngresoDatos() {
        Raices r1 = new Raices();
        System.out.println("Ingrese el valor de a");
        r1.setA(leer.nextInt());
        System.out.println("Ingrese el valor de b");
        r1.setB(leer.nextInt());
        System.out.println("Ingrese el valor de c");
        r1.setC(leer.nextInt());

        return r1;
    }

    public double Discriminante(Raices r1) {
        double discriminante;
        discriminante = (Math.pow(r1.getB(), 2)) - (4 * r1.getA() * r1.getC());
        return discriminante;
    }

    public boolean tieneRaiz(Raices r1) {
        //tiene una unica solucion si es = 0 
        boolean i = false;
        if (this.Discriminante(r1) == 0) {
            i = true;
        }
        return i;
    }

    public boolean tieneRaices(Raices r1) {
        //tiene dos soluciones si es mayo o igual a 0  
        boolean i = false;
        if (this.Discriminante(r1) > 0) {
            i = true;
        }
        return i;
    }

    public void ObtenerRaiz(Raices r1) {
        
        if (this.tieneRaiz(r1) == true) {
            //(-b±√((b^2)-(4*a*c)))/(2*a) 
            System.out.println(((-r1.getB() + Math.sqrt(((Math.pow(r1.getB(), 2)) - (4 * r1.getA() * r1.getC()))) / (r1.getA() * 2))));
        }
       
    }

    public void ObtenerRaices(Raices r1) {
        if (this.tieneRaices(r1) == true) {
            System.out.println(((r1.getB() + Math.sqrt(((Math.pow(r1.getB(), 2)) - (4 * r1.getA() * r1.getC()))) / (r1.getA() * 2))));
            System.out.println( ((r1.getB() + Math.sqrt(((Math.pow(r1.getB(), 2)) - (4 * r1.getA() * r1.getC()))) / (r1.getA() * 2)))); 
        }
    }
    
    public void Calcular(Raices r1, Raices r2) {
        this.ObtenerRaices(r1);
        this.ObtenerRaiz(r1);
    }
}
