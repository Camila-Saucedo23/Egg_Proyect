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
public class ServiceRaizop2 {
    Scanner leer = new Scanner(System.in);

    public Raices crearRaices() {
        System.out.println("Por favor ingrese el valor de a, b y c; respectivamente");
        return new Raices(new Scanner(System.in).useDelimiter("\n").nextInt(), new Scanner(System.in).useDelimiter("\n").nextInt(), new Scanner(System.in).useDelimiter("\n").nextInt());
    }

    public double getDiscriminante(Raices roots) {
        return roots.getGetDiscriminante();
    }

    public boolean tieneRaices(Raices roots) {
        return (roots.getGetDiscriminante() > 0);
    }

    public boolean tieneRaiz(Raices roots) {
        return (roots.getGetDiscriminante() == 0);
    }

    public void obtenerRaices(Raices roots) {
        if (tieneRaices(roots)) {
            System.out.printf("Raíz 1 = %f | Raíz 2 = %f \n", ((-roots.getB() + Math.sqrt(roots.getGetDiscriminante())) / (2 * roots.getA())), ((-roots.getB() - Math.sqrt(roots.getGetDiscriminante())) / (2 * roots.getA())));
        }
    }

    public void obtenerRaiz(Raices roots) {
        if (tieneRaiz(roots)) {
            System.out.println("Raiz = " + ((-roots.getB() + Math.sqrt(roots.getGetDiscriminante())) / (2 * roots.getA())));
        }
    }

    public void calcular(Raices roots) {
        if (roots.getGetDiscriminante() < 0) {
            System.out.println("No se puede realizar la operación porque son números complejos.");
        } else {
            obtenerRaices(roots);
            obtenerRaiz(roots);
        }
    }

}
