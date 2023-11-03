/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Objeto.Operacion;
import java.util.Scanner;

/**
 *
 * @author camis
 */
public class OperacionService {

    Scanner leer = new Scanner(System.in);

    public Operacion crearOperacion() {
        Operacion op = new Operacion();
        System.out.println("Ingrese dos numeros: ");
        op.setNro1(leer.nextInt());
        op.setNro2(leer.nextInt());

        return op;
    }

    public int suma(Operacion op) {

        return (op.getNro1() + op.getNro2());
    }

    public int resta(Operacion op) {

        return (op.getNro1() - op.getNro2());
    }

    public int multiplicacion(Operacion op) {
        int multiplicacion = op.getNro1() * op.getNro2();
        if (multiplicacion == 0) {
            System.out.println("ERROR");
        }
        return multiplicacion;
    }

    public float division(Operacion op) {
        float division = 0 ;
        if (op.getNro2() == 0) {
            System.out.println("ERROR");
            
        }else {
            division = (float)op.getNro1()/op.getNro2();
        }
        return division;
    }
}
