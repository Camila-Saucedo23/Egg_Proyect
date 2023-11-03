/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Objeto.cuenta;
import java.util.Scanner;

/**
 *
 * @author camis
 */
public class cuentaService {

    cuenta C1 = new cuenta();
    Scanner leer = new Scanner(System.in);
    

    public cuenta crearcuenta() {
        System.out.println("ingrese dni, nro de cuenta y saldo actual");
        C1.setDNI(leer.nextLong());
        C1.setNrocuenta(leer.nextInt());
        System.out.println("Hola CHiCos");
        return C1;
    }

    public cuenta ingreso(cuenta C1) {
        System.out.println("Coloque el valor del dinero ingresado");
        double ingreso = leer.nextDouble();
        C1.setSaldoActual(0);
        C1.setSaldoActual((int) (C1.getSaldoActual() + ingreso));

        return C1 ;
    }
    
    public cuenta retiro (cuenta C1) {
        System.out.println("Coloque el dinero a retirar");
        double retirar = leer.nextDouble();
        if (C1.getSaldoActual() < retirar) {
            C1.setSaldoActual(0);
        }
        C1.setSaldoActual((int) (C1.getSaldoActual() - retirar));
        
        return C1;
    }
   public cuenta retiroRapido (cuenta C1) {
        System.out.println("Coloque el dinero a retirar");
        double retirar = leer.nextDouble();
        if (C1.getSaldoActual()*0.2 < retirar) {
            C1.setSaldoActual((int) (C1.getSaldoActual() - retirar));
        }else {
             System.out.println("No puede retirar esa cantidad de dinero");
        }
        return C1;
    } 
   public void consultarSaldo(cuenta C1) {
       System.out.println("Su saldo actual es:" + C1.getSaldoActual());
       
   }
   public void cunsultarDatos(cuenta C1) {
       System.out.println("su nro de cuenta es:" + C1.Nrocuenta);
       System.out.println("Su nro de DNI es: " + C1.DNI);
       System.out.println("Su saldo actual es de:" + C1.saldoActual);
       
   }
}
