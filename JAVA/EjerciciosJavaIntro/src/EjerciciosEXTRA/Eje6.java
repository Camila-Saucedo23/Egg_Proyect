/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosEXTRA;

import java.util.Scanner;

/**
 *
 * @author camis
 */
public class Eje6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double promedio = 0, promedio2 = 0, altura;
        int aux = 0;
        System.out.println("Ingrese la cantidad de personas que desea comparar: ");
        int n = leer.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la estatura de la persona: ");
            altura = leer.nextDouble();
            promedio2 += altura;
            if (altura<1.60) {
                promedio += altura;
                aux++;
            }
        }
        promedio = promedio / aux;
        promedio2 = promedio2 / n;
        
        System.out.println("El promedio de las " + aux + " personas que miden menos de 1.60 es: " + promedio);
        System.out.println("El promedio de las " + n + " personas es: " + promedio2);
    }    
}

   