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
public class Eje11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num,digitos= 0;
      
        System.out.println("Ingrese un número");
        num = leer.nextInt();
        
        while(num !=0){
        num = num/10;
        digitos++;
        
        
       }
        System.out.println("La cantidad de digitos es: " + digitos);
    }
    }
    

