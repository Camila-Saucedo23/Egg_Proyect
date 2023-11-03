/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjavaintro;

import java.util.Scanner;

/**
 *
 * @author camis
 */
public class Eje8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJERCICIO9
        Scanner leer = new Scanner(System.in);
        
        int x;
        int r=0;
        int contador = 0;
        int suma;
        System.out.println("Ingrese 20 numeros");
        do{
            
            x = leer.nextInt();
            
           
            contador++;
            
            if(x>0){
            r+=x;
            }
            if(x == 0){
            System.out.println("Se capturó el numero cero");
            break;
        }
    }while(x !=0 && contador <20); // Si esto es falso se sale (SI X PASA DE 20 SE SALE)
       
        if(contador == 20){
        System.out.println("Ya ingresó los 20 digitos, ha salido del buclé");
        }
        System.out.println("La suma tota es; "+r);
        
        
    }
    
}

    
    

