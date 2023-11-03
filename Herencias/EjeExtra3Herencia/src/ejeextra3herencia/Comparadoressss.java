/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejeextra3herencia;


/**
 *
 * @author camis
 */
public class Comparadoressss {
   public static Comparator<Alojamiento> ordenprecio = new Comparator<Alojamiento> {
        @Override
        public int compare(Alojamiento t, Alojamiento t1) {
            return t.PrecioHabitaciones().CompareTo(t1.PrecioHabitaciones());
        }
    } ;
          
      
}
