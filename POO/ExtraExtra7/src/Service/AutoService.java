/*
 * ● Que un usuario cargue su ficha del auto.
● Que el usuario, modifique la titularidad del vehículo.
● Indicar un trayecto recorrido, modificando de este modo los KM del motor
● Crear un método que indique si es necesario realizar Service al vehículo, considerando que
al llegar a los 10.000km corresponde realizarlo.
 */

package Service;

import java.util.Scanner;
import objeto.Auto;

/**
 *
 * @author camis
 */
public class AutoService {
    Scanner leer = new Scanner(System.in);

    public Auto CargarFicha() {
        Auto A1 = new Auto();
        System.out.println("Cargue su ficha de usuario");
        System.out.println("Ingrese nombre del dueño del veiculo");
        A1.setNombreDueño(leer.nextLine());
        System.out.println("Ingrese la fecha de vencimiento del carnet de conducir (dia/mes/año)");
        A1.setFechaVencimientoCarnet(leer.nextLine());
        System.out.println("Ingrese el color del auto");
        A1.setColorAuto(leer.nextLine());
        System.out.println("Ingrese el modelo del auto");
        A1.setModelo(leer.nextLine());
        
        return A1;
    }
    public Auto Transferencia(Auto A1){
            A1.setNombreDueño(leer.nextLine());
            A1.setFechaVencimientoCarnet(leer.nextLine());
          return A1;  
        }
    public Auto AgregarKm(Auto A1){
        
        System.out.println("Ingrese los Km recorridos");
        int newKm = leer.nextInt();
        A1.setKmMotor( A1.getKmMotor() + newKm );
     return A1;   
    }
    public Auto ServiceDe10000Km(Auto A1){
        if (A1.getKmMotor() >= 10000 ) {
            System.out.println("Su auto supero los 10.000Km!!!!!!");
            System.out.println("Tiene que llevarlo al Servicio Tecnico");   
        }
     return A1;   
    }    
    }


