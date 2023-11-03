/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Scanner;
import objeto.cancion;

/**
 *
 * @author camis
 */
public class ServiceCancion {
    Scanner leer = new Scanner(System.in);
    
    public cancion NombreCancion(){
        cancion c1 = new cancion();
        System.out.println("ingrese el nombre de la cancion");
        c1.setCancion(leer.nextLine());
        return c1;
    }
}
