/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eje2herencia;

import static java.lang.Character.toUpperCase;
import java.util.Scanner;

/**
 *
 * @author camis
 */
public class Electrodomesticos {

    Scanner leer = new Scanner(System.in);

    protected double precio;
    protected int peso;
    protected String color;
    protected char consumoe;

    public Electrodomesticos() {
        
    }

    public Electrodomesticos(double precio, int peso, String color, char consumoe) {
        this.precio = precio;
        this.peso = peso;
        this.color = color;
        this.consumoe = consumoe;

    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoe() {
        return consumoe;
    }

    public void setConsumoe(char consumoe) {
        this.consumoe = consumoe;
    }

    @Override
    public String toString() {
        return "Electrodomestico cuesta " + precio + " $, pesa " + peso + " Kg, es de color " + color + " y la etiqueta de consumo es " + consumoe;
    }

    public void Comprobarconsumo(char letra) {
               if (letra >= 'A' && letra < 'F') {
            consumoe = letra;
        } else {
            consumoe = 'F';
        }
    
    }

    public void ComprobarColor(String colors) {
        if (!(colors.equalsIgnoreCase("Blanco") || colors.equalsIgnoreCase("Negro") || colors.equalsIgnoreCase("Gris") || colors.equalsIgnoreCase("Rojo") || colors.equalsIgnoreCase("Azul"))) {
            color = "Blanco";
        }
    }

    public void CrearElectrodomestico() {
        
        System.out.println("Ingrese el color del electrodomestico");
        color = leer.next();
        ComprobarColor(color);
        System.out.println("Ingrese el peso del electrodomestico");
        peso = leer.nextInt();
        System.out.println("Ingrese el consumo electrico del electrodomestico");
        consumoe = leer.next().charAt(consumoe);
        consumoe = toUpperCase(consumoe);
        Comprobarconsumo(consumoe);
        precio=1000;
        
    }

    public double PrecioFinal() {
       double preciofin= precio;
        switch (consumoe) {
            case 'A':
                preciofin += 1000;
                break;
            case 'B':
                preciofin += 800;
                break;
            case 'C':
                preciofin += 600;
                break;
            case 'D':
               preciofin += 500;
                break;
            case 'E':
               preciofin += 300;
                break;
            case 'F':
               preciofin += 100;
                break;
        }
        if (peso >= 1 && peso <= 19) {
           preciofin+= 100;
        }
        if (peso >= 20 && peso<= 49) {
           preciofin+= 500;
        }
        if (peso >= 50 && peso <= 79) {
          preciofin+= 800;
        }
        if (peso >= 80) {
            preciofin+= 1000; 
        }
        
        return preciofin;
   } 
}
