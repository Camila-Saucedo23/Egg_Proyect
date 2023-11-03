/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;


import java.util.Scanner;
import objetos.Libro;

/**
 *
 * @author camis
 */
public class LibroService {

    Scanner leer = new Scanner(System.in);

    public Libro LlenarLibro() {
        Libro l1 = new Libro();
        System.out.println("ingrese nombre, autor y numero de paginas del libro.");
        l1.setNombre(leer.nextLine());
        l1.setAutor(leer.nextLine());
        l1.setNropaginas(leer.nextLine());
        return l1;
    }
}
