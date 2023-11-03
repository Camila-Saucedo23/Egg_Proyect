/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejeextra1herencia;

/**
 *
 * @author camis
 */
public class BarcoAMotor extends Barco {
    private int cv;

    public BarcoAMotor(int cv) {
        this.cv = cv;
    }

    public BarcoAMotor() {
    }
    

    public BarcoAMotor(int cv, String matricula, int eslora, int añofabricacion) {
        super(matricula, eslora, añofabricacion);
        this.cv = cv;
    }

    @Override
    public void CrearBarco() {
        super.CrearBarco(); 
        System.out.println("Cuantos caballos de fuerza tiene?");
        cv = leer.nextInt();
    }

    @Override
    public int Cargardatosalquiler() {
      int  precio = super.Cargardatosalquiler();
      int preciobarcomotor = precio + cv;
        System.out.println("El precio del alquiler del Barco a motor es de: " + preciobarcomotor);
      return preciobarcomotor;
    }

   

   
    
    
}
