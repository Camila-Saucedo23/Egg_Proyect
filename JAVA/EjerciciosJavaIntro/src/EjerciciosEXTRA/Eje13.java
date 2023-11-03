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
public class Eje13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la altura de la escalera: ");
        int altura = leer.nextInt();
        String escalera = "";
        
        for (int i = 1; i < altura+1; i++) {
            escalera=escalera.concat(Integer.toString(i));
            System.out.println(escalera);           
        }
    }
    
}
