/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eje4herencia;

import interfase.Calculos;

/**
 *
 * @author camis
 */
public class Rectangulo implements Calculos {

    private double base, altura;

    public void CrearRectangulo() {
        System.out.println("Ingrese la base y la altura del rectangulo");
        base = leer.nextDouble();
        altura = leer.nextDouble();
    }

    @Override
    public void Perimetro() {
        double PerimetroR = (base + altura) * 2;
        System.out.println("El perimetro del Rectangulo es: " + PerimetroR);
    }

    @Override
    public void Area() {
        double area = (base * altura);
        System.out.println("El area del rectangulo es: " + area);
    }

}
