/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejeextra3herencia;

/**
 *
 * @author camis
 */
public class Recidencia extends AlojamientosextraHoteleros{
    public int cantmaxhabitaciones;
    public boolean descuentos, campodeportivo;

    public Recidencia() {
    }

    public Recidencia(int cantmaxhabitaciones, boolean descuentos, boolean campodeportivo, int m2, boolean privado, String nombre, String direccion, String localidad, String gerente) {
        super(m2, privado, nombre, direccion, localidad, gerente);
        this.cantmaxhabitaciones = cantmaxhabitaciones;
        this.descuentos = descuentos;
        this.campodeportivo = campodeportivo;
    }

    @Override
    public void CargarDatos() {
        super.CargarDatos(); 
        System.out.println("EXTRAS RECIDENCIA");
        System.out.println("¿Cuántas habitaciones hay en la recidencia?");
        cantmaxhabitaciones = leer.nextInt();
        System.out.println("¿Tiene descuentos a gremios? si/no");
        String opc = leer.next();
        if (opc.equalsIgnoreCase("si")) {
            descuentos = true;
        }else if (opc.equalsIgnoreCase("no"))
            descuentos = false;
        System.out.println("¿Tiene campo deportivo? si/no");
        String op = leer.next();
        if (op.equalsIgnoreCase("si")) {
            campodeportivo = true;
        }else if (op.equalsIgnoreCase("no")){
            campodeportivo = false;
        }
    }
    
}
