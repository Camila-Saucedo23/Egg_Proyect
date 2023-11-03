/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3excepciones;

import java.util.Scanner;

/**
 *
 * @author camis
 */
public class Ejercicio3Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese dos numeros");
        String num1 = leer.next();
        String num2 = leer.next();
        Divisionnum s = new Divisionnum();
        s.dividir(num1, num2);
    }
    
}
