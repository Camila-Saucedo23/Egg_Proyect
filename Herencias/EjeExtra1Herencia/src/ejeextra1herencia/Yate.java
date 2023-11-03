/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejeextra1herencia;

/**
 *
 * @author camis
 */
public class Yate extends Barco {
    private int camarotes, cv;

    public Yate(int camarotes, int cv) {
        this.camarotes = camarotes;
        this.cv = cv;
    }

    public Yate() {
    }

    public Yate(int camarotes, int cv, String matricula, int eslora, int añofabricacion) {
        super(matricula, eslora, añofabricacion);
        this.camarotes = camarotes;
        this.cv = cv;
    }

    @Override
    public void CrearBarco() {
        super.CrearBarco(); 
        System.out.println("cuantos caballos de fuerza tiene el yate?");
        cv = leer.nextInt();
        System.out.println("cuantos camarotes tiene?");
        camarotes = leer.nextInt();
    }

    @Override
    public int Cargardatosalquiler() {
        int precio = super.Cargardatosalquiler(); 
        int precioyate = precio + camarotes + cv;
        System.out.println("El precio del alquiler del yate es de: " + precioyate);
        return precioyate;
    }

   
    
}
