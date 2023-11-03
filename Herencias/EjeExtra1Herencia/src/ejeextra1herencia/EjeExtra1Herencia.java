/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejeextra1herencia;

import java.util.Scanner;

/**
 *
 * @author camis
 */
public class EjeExtra1Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int op;
        Alquiler a1 = new Alquiler();
        System.out.println("Elija el tipo de barco que va a amarrar en el muelle");
        System.out.println("1. Barco a motor");
        System.out.println("2. velero");
        System.out.println("3. Yate de lujo");
        op = leer.nextInt();
        switch (op) {
            case 1:
                Barco b = new BarcoAMotor();
                b.CrearBarco();
                System.out.println(b.Cargardatosalquiler());
                break;
            case 2:
                Barco b1 = new Velero();
                b1.CrearBarco();
                System.out.println(b1.Cargardatosalquiler());
                break;
            case 3:
                Barco b2 = new BarcoAMotor();
                b2.CrearBarco();
                System.out.println(b2.Cargardatosalquiler());
                break;
            default:
                System.out.println("Ingrese una opcion valida");
        }

    }

}
