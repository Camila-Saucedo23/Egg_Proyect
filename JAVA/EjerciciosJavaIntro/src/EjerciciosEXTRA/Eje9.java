/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosEXTRA;

/**
 *
 * @author camis
 */
public class Eje9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numerador,denominador,cociente=0;
        System.out.println("ingrese los valores a dividir num1/num2");
        numerador=leer.nextInt();
        denominador=leer.nextInt();
        
        
        do {            
            numerador-=denominador;
            cociente++;
        } while (numerador>=denominador);
        
        System.out.println("el residuo es: "+numerador);
        System.out.println("el cociente es: "+cociente);
    }
    
}

    