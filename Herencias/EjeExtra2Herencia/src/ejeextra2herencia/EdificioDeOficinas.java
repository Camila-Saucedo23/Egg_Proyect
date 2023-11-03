/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejeextra2herencia;

/**
 *
 * @author camis
 */
public class EdificioDeOficinas extends EdificioSC {

    public int nroOficinas, cantPersonalxofi, nropisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int nroOficinas, int cantPersonalxofi, int nropisos) {
        this.nroOficinas = nroOficinas;
        this.cantPersonalxofi = cantPersonalxofi;
        this.nropisos = nropisos;
    }

    public EdificioDeOficinas(int nroOficinas, int cantPersonalxofi, int nropisos, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.nroOficinas = nroOficinas;
        this.cantPersonalxofi = cantPersonalxofi;
        this.nropisos = nropisos;
    }

    @Override
    public void CalcularSuperficie() {
        int sup = largo * ancho;
        System.out.println("La superficie del edificio es de: " + sup);
    }

    @Override
    public void CalcularVolumen() {
       int vol = alto * largo * ancho;
        System.out.println("El volumen del edificio es de: " + vol);
       
    }

    @Override
    public void cargaredificio() {
        super.cargaredificio(); 
        System.out.println("ingrese cuantas personas trabajan por oficina");
        cantPersonalxofi = leer.nextInt();
        System.out.println("Cuantas oficinas hay por piso");
        nroOficinas = leer.nextInt();
        System.out.println("cuantos pisos hay");
        nropisos = leer.nextInt();
        CantPersonas();
    }
 
    public void CantPersonas() {
        int personasporpiso = cantPersonalxofi * nroOficinas;
        System.out.println("La cantidad de personas que hay por piso son: " + personasporpiso);
        int personasedificio = personasporpiso * nropisos;
        System.out.println("La cantidad de personas en el edificio son: " + personasedificio);
    }
}
