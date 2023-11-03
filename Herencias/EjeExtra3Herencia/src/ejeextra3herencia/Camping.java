/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejeextra3herencia;

/**
 *
 * @author camis
 */
public class Camping extends AlojamientosextraHoteleros {
    public int cantmaxcarpas, cantbaños;
    public boolean restaurante;

    public Camping() {
    }

    public Camping(int cantmaxcarpas, int cantbaños, boolean restaurante, int m2, boolean privado, String nombre, String direccion, String localidad, String gerente) {
        super(m2, privado, nombre, direccion, localidad, gerente);
        this.cantmaxcarpas = cantmaxcarpas;
        this.cantbaños = cantbaños;
        this.restaurante = restaurante;
    }

    @Override
    public void CargarDatos() {
        super.CargarDatos(); 
        System.out.println("EXTRAS CAMPING");
        System.out.println("¿Cuántas carpas entran en el recinto como maximo?");
        cantmaxcarpas = leer.nextInt();
        System.out.println("¿Cuántos baños hay en el predio del camping?");
        cantbaños=leer.nextInt();
        System.out.println("¿Tiene restaurante? si/no");
        String opc = leer.next();
        if (opc.equalsIgnoreCase("si")) {
            restaurante = true;
        }else if (opc.equalsIgnoreCase("no"))
            restaurante = false;
    }
    
}
