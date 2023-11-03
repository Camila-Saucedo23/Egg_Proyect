/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3excepciones;

import java.util.InputMismatchException;

/**
 *
 * @author camis
 */
public class Divisionnum {
    public int nume1, nume2;
    
    public void dividir(String num1, String num2){
        
        //NumberFormatException, InputMismatchException
       
        try {
             nume1 = Integer.parseInt(num1);
        nume2 = Integer.parseInt(num2);
        System.out.println("la division es: " + (nume1/nume2));
        } catch (NumberFormatException | ArithmeticException e ) {
            System.err.println("Senior, seniora ingrese numeros. Gracias" + e.getMessage());
        } catch (InputMismatchException e){
            System.out.println("Ingrese todo de nuevo");
        }
        // o tambien podemos agregar otro catch para mostrar un msj po cada error
    }
}
