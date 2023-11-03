/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejeextra4herencia;

import java.util.Scanner;

/**
 *
 * @author camis
 */
public class EjeExtra4Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opp;
        do {
            System.out.println("1. Alumno");
            System.out.println("2. Profesor");
            System.out.println("3. Personal de servicio");
            System.out.println("4. Salir");
            opp = leer.nextInt();
            switch (opp) {
                case 1:
                    Estudiantes e1 = new Estudiantes();
                    e1.CargarPersona();
                    int op;
                    do {
                        System.out.println("1. Cambiar estado civil");
                        System.out.println("2. Matricularse en un nuevo curso");
                        System.out.println("3. Imprimir informacion");
                        System.out.println("4. Salir");
                        op = leer.nextInt();
                        switch (op) {
                            case 1:
                                e1.CambioestadoCivil();
                                break;
                            case 2:
                                e1.CambioCurso();
                                break;
                            case 3:
                                System.out.println("El alumno " + e1.nombre + " " + e1.apellido + " DNI " + e1.DNI
                                        + " estado civil " + e1.estadocivil + " matriculado en " + e1.curso);
                                break;
                            default:
                                System.out.println("Error ingrese otra opcion");
                        }
                    } while (op != 4);
                    break;
                case 2:
                    Prefesor p1 = new Prefesor();
                    p1.CargarPersona();
                    int op2;
                    do {
                        System.out.println("1. Cambiar estado civil");
                        System.out.println("2. Reasignar despacho");
                        System.out.println("3. Cambio de departamento de un profesor");
                        System.out.println("4. Imprimir informacion");
                        System.out.println("5. Salir");
                        op2 = leer.nextInt();
                        switch (op2) {
                            case 1:
                                p1.CambioestadoCivil();
                                break;
                            case 2:
                                p1.CambiodeDespacho();
                                break;
                            case 3:
                                p1.CambiodeDepartamento();
                                break;
                            case 4:
                                System.out.println("El profesor " + p1.nombre + " " + p1.apellido + " DNI " + p1.DNI
                                        + " estado civil " + p1.estadocivil
                                        + " del area " + p1.departamento + " asignado al despacho nro " + p1.nrodespacho);
                                break;
                            default:
                                System.out.println("Error ingrese otra opcion");
                        }
                    } while (op2 != 5);
                    break;
                case 3:
                    PersonalServicio ps1 = new PersonalServicio();
                    ps1.CargarPersona();
                    int op3;
                    do {
                        System.out.println("1. Cambiar estado civil");
                        System.out.println("2. Reasignar despacho");
                        System.out.println("3. Traslado de seccion de un empleado de servicio");
                        System.out.println("4. Imprimir informacion");
                        System.out.println("5. Salir");
                        op3 = leer.nextInt();
                        switch (op3) {
                            case 1:
                                ps1.CambioestadoCivil();
                                break;
                            case 2:
                                ps1.CambiodeDespacho();
                                break;
                            case 3:
                                ps1.TrasladodeSeccion();
                                break;
                            case 4:
                                System.out.println("El profesor " + ps1.nombre + " " + ps1.apellido + " DNI " + ps1.DNI
                                        + " estado civil " + ps1.estadocivil
                                        + " de la seccion " + ps1.seccion + " asignado al despacho nro " + ps1.nrodespacho);
                                break;
                            default:
                                System.out.println("Error ingrese otra opcion");
                        }
                    } while (op3 != 5);
                    break;
                default:
                    System.out.println("ERROR");
            }
        } while (opp != 4);
    }
}
