/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraext3;

import Objeto.Pass;
import Service.PassService;
import java.util.Scanner;

/**
 *
 * @author camis
 */
public class ExtraExt3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PassService PS = new PassService();
        Pass p = PS.CrearPass();
        int op,val;
        do {
            System.out.println("Menu");
        
        System.out.println("2- Que nivel de seguridad tiene la contraseña"); //analizarpass
        System.out.println("3- Modificar contraseña");//validacion y Cambiodecontra
        System.out.println("4- Modificar Nombre");//validacion y cambionombre
        System.out.println("5- Modificar DNI");//validacion y cambioDNI
        System.out.println("6- Salir");
        op = leer.nextInt();
        switch (op) {
                case 2:
                PS.AnalizarPass(p);
                break;
                case 3:
                val = PS.Validacion(p);
                    if (val < 3) {
                        PS.CambioContra(p);
                    } else  System.out.println("Puede Fallar, Recuerde y vuelva");
                      
                    System.out.println(p.toString());
                break;
                case 4:
                val = PS.Validacion(p);
                if (val < 3) {
                    PS.CambioNombre(p, val);
                }
                    System.out.println("Su nombre se cambio con exito");
                    System.out.println(p.toString());
                break;
                case 5:
                    val = PS.Validacion(p);
                if (val < 3) {
                    PS.CambioDNI(p, val);
                }
                    System.out.println("Su DNI se guardo con exito");
                    System.out.println(p.toString());
                break;
                case 6:
                    System.out.println("Vuelva pronto");
                    break;
            default:
                System.out.println("Ingrese una opcion valida");;
        }
        } while (op != 6);
        }
    }
    

