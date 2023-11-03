/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioExtra5;

import java.util.Scanner;

/**
 *
 * @author camis
 */
public class EjercicioExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesRandom = meses[(int) (Math.random() * 12)];
        String mesUsuario;
        String mesUsuarioMayuscula;

        System.out.println("¡Adivine el mes secreto! \n Introduzca el mes en minúsculas:");
        System.out.println(mesRandom);
    
        do {
            boolean flagMayus = false;
            mesUsuario = new Scanner(System.in).useDelimiter("\n").next();
            mesUsuarioMayuscula = mesUsuario.toUpperCase();
            for (int i = 0; i < mesUsuario.length(); i++) {
                if(String.valueOf(mesUsuario.charAt(i)).equals(String.valueOf(mesUsuarioMayuscula.charAt(i)))){
                    flagMayus = true;
                    break;
                }
            }
            
            if(!flagMayus){
                if (!mesUsuario.equalsIgnoreCase(mesRandom)) {
                    System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
                } else {
                    System.out.println("¡Ha acertado!");
                }
            }else{
                System.out.println("Por favor ingrese un mes en minúsculas.");
            }
        } while (!mesUsuario.equals(mesRandom));
    }

}
