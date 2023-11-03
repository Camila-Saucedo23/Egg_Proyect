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
public class Eje10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num1 = (int) (Math.random()* 11), num2 = (int) (Math.random()* 11), result = num1*num2, resp = 0;
        System.out.println(num1);
        System.out.println(num2);
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el resultado de la multiplicacion: ");
        resp = leer.nextInt();
        while (resp != result){
            System.out.println("Error, ingrese un nuevo resultado: ");
            resp = leer.nextInt();
        }
        System.out.println("Has adivinado :)");
        }
    }


