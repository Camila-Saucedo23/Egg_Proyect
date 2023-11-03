/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabanco;


import Objeto.cuenta;
import java.util.Scanner;
import service.cuentaService;

/**
 *
 * @author camis
 */
public class CuentaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
       cuentaService service = new cuentaService(); 
       cuenta C = service.crearcuenta();
        int op;
        
        
        do {
             System.out.println("1- Crear cuenta");
        System.out.println("2- Ingreso de dinero");
        System.out.println("3- Retiro de dinero");
        System.out.println("4- Retiro RAPIDO");
        System.out.println("5- Consultar saldo actual");
        System.out.println("6- Mostrar datos del usuario");
        System.out.println("7- SALIR");
        System.out.println("ingrese una opcion del menu");
         op = leer.nextInt();
         
            switch (op) {
            case 1:
                service.crearcuenta();
                break;
            case 2:
                service.ingreso(C);
                break;
            case 3:
                service.retiro(C);
                break;
            case 4:
                service.retiroRapido(C);
                break;
            case 5:
                service.consultarSaldo(C);
                break;
            case 6:
                service.cunsultarDatos(C);
                break;
            case 7:
                break;
            default: 
                System.out.println("Elija una opcion del menu");;
        }
       
        } while (op != 7);
        
       
        
          
        }
        
                
                
        }
    
      