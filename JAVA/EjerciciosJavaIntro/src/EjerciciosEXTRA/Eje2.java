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
public class Eje2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      int A=1;
      int B=2;
      int C=3;
      int D=4;
      int cent;
       
      System.out.println((A)+" "+(B)+" "+" "+(C)+" "+(D));
      
     cent = B;
        B = C;
        C = A;
        A = D;
        D = cent;
      
      
        System.out.println((A)+" "+(B)+" "+" "+(C)+" "+(D));
      
      
    }
    
}

    