/*
Crea una clase Auto. Como atributos tendrá nombre del dueño, fecha vencimiento carnet, color del
vehículo, modelo y KM en motor (deberá ser inicializado por defecto en 7500km),
Crear métodos que permitan:
● Que un usuario cargue su ficha del auto.
● Que el usuario, modifique la titularidad del vehículo.
● Indicar un trayecto recorrido, modificando de este modo los KM del motor
● Crear un método que indique si es necesario realizar Service al vehículo, considerando que
al llegar a los 10.000km corresponde realizarlo.
 */
package extraextra7;

import Service.AutoService;
import java.util.Scanner;
import objeto.Auto;

/**
 *
 * @author camis
 */
public class ExtraExtra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        AutoService auser = new AutoService();
        Auto A = auser.CargarFicha();
        boolean op1 = true;
        int opcion;
        do {
            System.out.println("Elija una opcion:");
            System.out.println("1- Tranferencia");
            System.out.println("2- Agregar Km");
            System.out.println("3- Analisis de Service ");
            System.out.println("4- Salir del menu");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Desea cambiar la titularidad del auto. coloque S para si o N para no ");
                    String op = leer.nextLine();
                    if ("S".equalsIgnoreCase(op)) {
                        System.out.println("Los datos originales del veiculo son : ");
                        System.out.println(A.toString());
                        System.out.println("Coloque el nombre del nuevo dueño y el vencimiento del carnet");
                        auser.Transferencia(A);
                        System.out.println("El nuevo dueño es: ");
                        System.out.println(A.getNombreDueño());
                        System.out.println("El vencimiento de su carnet es :");
                        System.out.println(A.getFechaVencimientoCarnet());
                        System.out.println("---------");
                        System.out.println("los nuevos datos del veiculo son : ");
                        System.out.println(A.toString());
                        break;
                    } else if ("N".equalsIgnoreCase(op)) {
                        break;
                    }
                case 2:
                    auser.AgregarKm(A);
                    System.out.println("El nuevo kilometraje es : ");
                    System.out.println(A.getKmMotor());
                    break;
                case 3:
                    auser.ServiceDe10000Km(A);
                    break;
                case 4:
                    System.out.println("Hasta pronto!!");
                    op1 = false;
                    break;
                default:
                    System.out.println("La opcion es incorrecta");
            }
        } while (op1);
    }
}
