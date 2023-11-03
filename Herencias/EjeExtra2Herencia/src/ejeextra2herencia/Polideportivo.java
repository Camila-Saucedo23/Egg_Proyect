/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejeextra2herencia;

/**
 *
 * @author camis
 */
public class Polideportivo extends EdificioSC{
    public String nombre;
    public boolean techo;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean techo) {
        this.nombre = nombre;
        this.techo = techo;
    }

    public Polideportivo(String nombre, boolean techo, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techo = techo;
    }

    
   
    @Override
    public void CalcularSuperficie() {
        int sup = largo * ancho;
        System.out.println("La superficie del polideportivo es de: " + sup);
    }

    @Override
    public void CalcularVolumen() {
         int vol = alto * largo * ancho;
        System.out.println("El volumen del polideportivo es de: " + vol);
    }

    @Override
    public void cargaredificio() {
        super.cargaredificio(); 
        System.out.println("Cargar el nombre del establecimiento");
        nombre = leer.next();
        System.out.println("El polideportivo " + nombre + " es techado? si/no");
        String op = leer.next();
        int conttechos = 0;
        int conttechon = 0;
        if (op.equalsIgnoreCase("si")) {
            techo = true;
            conttechos++;
        }else if (op.equalsIgnoreCase("no")){
            techo = false;
            conttechon++;
        }
        System.out.println("Hay " + conttechos + " polideportivos con techo y " + conttechon + " abiertos");
    }
    
}
