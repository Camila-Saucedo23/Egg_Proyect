/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraextra1;

import java.util.Scanner;
import objeto.Fraccion;
import service.FraccionService;

/**
 *
 * @author camis
 */
public class ExtraExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        FraccionService FS = new FraccionService();
        Fraccion f = FS.IngresoDatos();
        boolean op1 = true;
        int op;
        do {
            System.out.println("MENÚ");
            System.out.println("1- Suma");
            System.out.println("2- Resta");
            System.out.println("3- MultiplicaciÓn");
            System.out.println("4- Division");
            System.out.println("5- Salir del menú");
            
            op = leer.nextInt();
            switch (op) {
                case 1:
                    FS.Suma(f);
                    break;
                case 2:
                    FS.Resta();
                    break;
                case 3:
                    FS.Multiplicacion();
                    break;
                case 4:
                    FS.Division();
                    break;
                case 5:
                    op1 = false;
                    break;
                default:
                    System.out.println("ERROR");
                    System.out.println("Ingrese una opción valida");
            }
        } while (op1);
    }

}
