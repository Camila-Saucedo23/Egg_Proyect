/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.ArrayList;

/**
 *
 * @author camis
 */
public class Cine {

    private char sala[][];
    private double Precio;
    private Pelicula Peliculaactual;
    private ArrayList<Espectador> Espectadores;

    public Cine() {
    }

    public Cine(char sala[][], Double Precio, Pelicula Peliculaactual, ArrayList<Espectador> Espectadores) {
        this.sala = sala;
        this.Precio = Precio;
        this.Peliculaactual = Peliculaactual;
        this.Espectadores = Espectadores;
    }

    public void CargarDatos() {
        //Espectadores
        Espectadores = new ArrayList();
        Espectador e1 = new Espectador("camila", 2, 10.00);
        Espectador e2 = new Espectador("Gustavo", 15, 10.00);
        Espectador e3 = new Espectador("Andres", 10, 5.00);
        Espectador e4 = new Espectador("Nagger", 50, 10.00);
        Espectadores.add(e1);
        Espectadores.add(e2);
        Espectadores.add(e3);
        Espectadores.add(e4);
        //Peliccula
        Pelicula p1 = new Pelicula("Buscando a Dori", "Disney Pixar", 1, 10);
        Peliculaactual = p1;
    }

    public void Llenarcine() {
        this.Precio = 10.00;
        int n = 6;
        int m = 8;

        sala = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sala[i][j] = ' ';

            }

        }
        System.out.println("SALA VACIA");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                System.out.print((i + 1) + " " + (char) ('A' + j) + " " + sala[i][j] + " | ");
            }
            System.out.println(" ");
        }
        Boolean asiento = true;
        System.out.println("ESPECTADORES");
        for (Espectador es : Espectadores) {
            if (es.getDinero() >= this.Precio && es.getEdad() >= Peliculaactual.getEdadmin()) {
                System.out.println(es);
                do {
                    int i = (int) (Math.random() * 6);
                    int j = (int) (Math.random() * 8);

                    System.out.println((i + 1) + "," + (j + 1));

                    if (sala[i][j] == ' ') {
                        sala[i][j] = 'X';

                        asiento = false;
                    }
                } while (asiento = false);
            }

        }

        System.out.println("SALA LLENA ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print((i + 1) + " " + (char) ('A' + j) + " " + sala[i][j] + " | ");
                //System.out.print(sala[i][j]);
            }
            System.out.println(" ");
        }
    }

}
