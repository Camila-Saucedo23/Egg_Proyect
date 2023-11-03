/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejeextra1herencia;



/**
 *
 * @author camis
 */
public class Barco extends Alquiler {
    
    protected String matricula;
    protected int eslora, añofabricacion;

    public Barco() {
    }

    public Barco(String matricula, int eslora, int añofabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.añofabricacion = añofabricacion;
    }
    
    public void CrearBarco(){
        System.out.println("ingrese la matricula del barco");
        matricula = leer.next();
        System.out.println("Cuantos metros de eslora tiene?");
        eslora = leer.nextInt();
        System.out.println("En que ao fue fabricado?");
        añofabricacion = leer.nextInt();
    }

    @Override
    public int Cargardatosalquiler() {
        int precio = super.Cargardatosalquiler(); 
       int preciobase = precio * (eslora*10);
        return preciobase;
    }
    
    
}
