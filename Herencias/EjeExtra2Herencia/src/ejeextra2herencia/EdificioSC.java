/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejeextra2herencia;

import java.util.Scanner;

/**
 *
 * @author camis
 */
public abstract class EdificioSC {
    Scanner leer = new Scanner(System.in);

    protected int ancho, alto, largo;

    public EdificioSC() {
    }

    public EdificioSC(int ancho, int alto, int largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
    public void cargaredificio(){
        System.out.println(" ingresar datos del edificio...");
        System.out.println("Ancho: ");
        ancho = leer.nextInt();
        System.out.println("Largo: ");
        largo = leer.nextInt();
        System.out.println("Alto: ");
        alto = leer.nextInt();
    }
    public abstract void CalcularSuperficie();

    public abstract void CalcularVolumen();

}
