/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejeextra1herencia;

/**
 *
 * @author camis
 */
public class Velero extends Barco{
    private int nromastiles;

    public Velero(int nromastiles) {
        this.nromastiles = nromastiles;
    }

    public Velero() {
    }
    

    public Velero(int nromastiles, String matricula, int eslora, int añofabricacion) {
        super(matricula, eslora, añofabricacion);
        this.nromastiles = nromastiles;
    }

    @Override
    public void CrearBarco() {
        super.CrearBarco(); 
        System.out.println("cuantos mastiles tiene el velero?");
        nromastiles = leer.nextInt();
    }

    @Override
    public int Cargardatosalquiler() {
       int precio = super.Cargardatosalquiler(); 
       int preciovelero = precio + nromastiles;
       System.out.println("El precio del alquiler del velero es de: " + preciovelero);
       return preciovelero;
    }

   
    
    
    
}
