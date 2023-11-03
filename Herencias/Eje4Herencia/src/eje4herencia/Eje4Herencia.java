/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eje4herencia;

/**
 *
 * @author camis
 */
public class Eje4Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Rectangulo");
        Rectangulo rec = new Rectangulo();
        rec.CrearRectangulo();
        System.out.println("calculando...");
        rec.Perimetro();
        rec.Area();
        System.out.println("----------");
        System.out.println("Circulo");
        Circulo cir = new Circulo();
        cir.CrearCirculo();
        System.out.println("Calculando...");
        cir.Perimetro();
        cir.Area();
    }

}
