/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manosalaobracolecciones;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author camis
 */
public class DetErroresIterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> bebidas = new ArrayList();
        String p1 = "café";
        String p2 = "té";
        bebidas.add(p2);
        bebidas.add(p1);
        Iterator <String> it = bebidas.iterator();
        while(it.hasNext()){
            if (it.next().equals("café")){
            it.remove();
            }
        }
         
}
}
