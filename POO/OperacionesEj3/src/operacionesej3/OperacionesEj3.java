/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesej3;

import Objeto.Operacion;
import Service.OperacionService;

/**
 *
 * @author camis
 */
public class OperacionesEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperacionService service = new OperacionService();
        Operacion op = service.crearOperacion();
        
        System.out.println("la suma es: " + service.suma(op));
        System.out.println("la resta es: " + service.resta(op));
        System.out.println("la multiplicacion es: " + service.multiplicacion(op));
        System.out.println("la division es: " + service.division(op));
        
                
    }
    
}
