/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidaes;

import java.util.Comparator;
import objetos.Mascota;

/**
 *
 * @author camis
 */
public class comparadores {
  
    public static Comparator<Mascota> ordenarporrazaasc = new Comparator<Mascota>() {
        @Override
        public int compare(Mascota t, Mascota t1) {
            return t.getRaza().compareTo(t1.getRaza());
            
        }
    };
    
     public static Comparator<Mascota> ordenarporrazadec = new Comparator<Mascota>() {
        @Override
        public int compare(Mascota t, Mascota t1) {
            return t1.getRaza().compareTo(t.getRaza());
            
        }
    };
}
