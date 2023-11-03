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
public class Circulo implements Calculos {

    private double radio;

    public void CrearCirculo() {
        System.out.println("Ingrese el radio del circulo");
        radio = leer.nextDouble();
    }

    @Override
    public void Perimetro() {
       double perimetro = PI * radio * 2;
        System.out.println("El perimetro del circulo es :" + perimetro);
    }

    @Override
    public void Area() {
       double area = PI * (Math.pow(radio, 2));
        System.out.println("El area del circulo es : " + area);
    }

}
