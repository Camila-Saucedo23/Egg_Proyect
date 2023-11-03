/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manosalaobracolecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author camis
 */
public class ManosALaObraColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList < Integer > Numeros = new ArrayList();
    int x = 20;
    int y = 22;
    int c = 23 ;
    Numeros.add(x);
    
    HashSet<String> nombre = new HashSet();
    String a = "Hola";
    nombre.add(a);
    
    HashMap<Integer, String> Persona = new HashMap();
    Integer DNI = 42691267;
    String Nombre = "camila";
    Persona.put (DNI , Nombre);
    }
    
}
