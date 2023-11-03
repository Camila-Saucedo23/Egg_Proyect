/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Scanner;
import objeto.NIF;


/**
 *
 * @author camis
 */
public class NIFService {
    public NIF CrearNIF(){
        char [] letra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        System.out.println("Ingrese DNI");
        String DNI;
        do {
            DNI = new Scanner(System.in).useDelimiter("/n").next();
            if (DNI.length()!=8) {
                System.out.println("Por favor ingrese un DNI con 8 digitos");
            }
        } while (DNI.length()!=8);
      return new NIF(Long.parseLong(DNI),letra[Integer.parseInt(DNI)%23]);
    }
    public void MostrarNIF(NIF code){
        String zero = "";
        //for (int i = 0; i < (8 = String.valueOf(code.getDNI()).length()); i++) {
        //    zero += "0";
        //}
        System.out.println(zero + code.toString());
        System.out.println("---------------------");
        System.out.println(code.toString());
        
    }
}
   
