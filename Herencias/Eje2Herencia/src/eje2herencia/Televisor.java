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
public class Televisor extends Electrodomesticos{
    Scanner leer = new Scanner(System.in);
    private int pulgadas;
    private boolean TDT;

    public Televisor() {
    }

    public Televisor(int pulgadas, boolean TDT, double precio, int peso, String color, char consumoe) {
        super(precio, peso, color, consumoe);
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    @Override
    public void CrearElectrodomestico() {
        super.CrearElectrodomestico();
        System.out.println("Ingrese las pulgadas de la TV");
       pulgadas = leer.nextInt();
        System.out.println("Tiene TDT");
        String rep = leer.next();
        if (rep.equalsIgnoreCase("si")) {
            TDT= true;
        }else if (rep.equalsIgnoreCase("no")) {
           TDT= false;
        }
    }

    @Override
    public double PrecioFinal() {
        double preciofin = super.PrecioFinal(); 
        if (pulgadas>40) {
           preciofin = preciofin * 1.30;
        }
        if (TDT = true) {
            preciofin += 500; 
        }
         System.out.println("El precio de la Television es : " + preciofin);
        return preciofin;
    }
    
}
