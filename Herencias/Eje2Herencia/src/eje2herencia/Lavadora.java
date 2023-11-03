/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eje2herencia;

import java.util.Scanner;

/**
 *
 * @author camis
 */
public class Lavadora extends Electrodomesticos {

    Scanner leer = new Scanner(System.in);
    public int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, double precio, int peso, String color, char consumoe) {
        super(precio, peso, color, consumoe);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public void CrearElectrodomestico() {
        super.CrearElectrodomestico();
        System.out.println("Ingrese la carga de la lavadora");
        this.carga = leer.nextInt();
    }

    @Override
    public double PrecioFinal() {
        double preciofin = super.PrecioFinal();
        if (carga > 30) {
            preciofin += 500;  
    }  
       System.out.println("El precio de la lavadora es : " + preciofin);
       return preciofin;
        }
}


