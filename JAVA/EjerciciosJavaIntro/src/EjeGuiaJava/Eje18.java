/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjeGuiaJava;

/**
 *
 * @author camis
 */
public class Eje18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("M A T R I Z   T R A N S P U E S T A");
        System.out.println();
        
        int [] [] MatrizA = new int [4][4];
        
        for (int i = 0 ; i < 4 ; i++) {
            for ( int j = 0 ; j < 4 ; j++ ){
                MatrizA [i][j] = (int)(Math.random() * 10);
            }
        }
        
        for (int a = 0 ; a < 4 ; a++) {
            for (int b = 0 ; b < 4 ; b++){
                System.out.print(MatrizA [a][b] + " ");
            }
            System.out.println();
        }
         System.out.println();
          System.out.println();
        
          for (int a = 0 ; a < 4 ; a++) {
            for (int b = 0 ; b < 4 ; b++){
                System.out.print(MatrizA [b][a] + " ");
            }
            System.out.println();
        }
    }
    
}
