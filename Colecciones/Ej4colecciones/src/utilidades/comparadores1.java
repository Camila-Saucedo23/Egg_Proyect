/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.Comparator;
import objeto.Pelicula;

/**
 *
 * @author camis
 */
public class comparadores1 {
      public static Comparator<Pelicula> ordenduracionasc= new Comparator<Pelicula>() {
          @Override
          public int compare(Pelicula t, Pelicula t1) {
             return t.getDuracion().compareTo(t1.getDuracion());
          }
      };
      
       public static Comparator<Pelicula> ordenduraciondec = new Comparator<Pelicula>() {
          @Override
          public int compare(Pelicula t, Pelicula t1) {
             return t1.getDuracion().compareTo(t.getDuracion());
          }
      };
       
       public static Comparator<Pelicula> ordenpordirector = new Comparator<Pelicula>() {
          @Override
          public int compare(Pelicula t, Pelicula t1) {
              return t.getDirector().compareTo(t1.getDirector());
          }
      };
      
       public static Comparator<Pelicula> ordenarpornombre = new Comparator<Pelicula>() {
          @Override
          public int compare(Pelicula t, Pelicula t1) {
              return t.getNombre().compareTo(t1.getNombre());
          }
             
      };
}
