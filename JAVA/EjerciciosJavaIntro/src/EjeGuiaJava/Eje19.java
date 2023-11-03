/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjeGuiaJava;

import java.util.Scanner;

/**
 *
 * @author camis
 */
public class Eje19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int[][] matrizA = new int [3][3];
        int i,j ;
        
        System.out.println("Lenna la matriz de 9");
        //Llenado matrizA
        for (i=0; i<3; i++){
            for (j=0; j<3; j++){
               matrizA[i][j] = leer.nextInt(); 
            }
        }
        //Imprimir matrizA
        int n;
        for (i=0; i<3; i++){
            for (j=0; j<3; j++){
                n= matrizA[i][j];
                switch (Integer.toString(n).length()){
                case 1:
                    System.out.print("[ "+ matrizA[i][j]+"]");
                    break;
                case 2:
                    System.out.print("["+ matrizA[i][j]+"]");
                    break;
                }
            }
            System.out.println("");
        }
        int[][] matrizB = new int [3][3];
        //llenado de la matrizB
        for (i=0; i<3; i++){
            for (j=0; j<3; j++){
               matrizB[j][i] = matrizA[i][j];    
            }
        }
        System.out.println("");
        //imprimir la matrizB
        for (i=0; i<3; i++){
            for (j=0; j<3; j++){
                n= matrizB[i][j];
               switch (Integer.toString(n).length()){
                case 1:
                    System.out.print("[ "+ matrizB[i][j]+"]");
                    break;
                case 2:
                    System.out.print("["+ matrizB[i][j]+"]");
                    break;
                }
            }
            System.out.println("");
        }
        int[][] matrizC = new int [3][3];
        //llenado de la matrizB
        for (i=0; i<3; i++){
            for (j=0; j<3; j++){
               matrizC[i][j] =-matrizB[i][j];    
            }
        }
        System.out.println("");
        //imprimir la matrizB
        for (i=0; i<3; i++){
            for (j=0; j<3; j++){
                n= matrizC[i][j];
               switch (Integer.toString(n).length()){
                case 1:
                    System.out.print("[ "+ matrizC[i][j]+"]");
                    break;
                case 2:
                    System.out.print("["+ matrizC[i][j]+"]");
                    break;
                }
            }
            System.out.println("");
        }
        System.out.println("");
        //comparacion
        int contador=0;
        for (i=0; i<3; i++){
            for (j=0; j<3; j++){
                if (matrizA[i][j]==matrizC[i][j]){
                    contador=contador+1;
                }
            }
        }
        
        if (contador==9){
            System.out.println("La matriz SI Anti simetrica");
        }else{
            System.out.println("La matriz NO es Anti simetrica");
        }
    }
}


    
    
