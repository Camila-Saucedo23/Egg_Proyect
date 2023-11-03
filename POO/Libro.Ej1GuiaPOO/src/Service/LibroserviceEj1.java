/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.LibroEj1;
import java.util.Scanner;

/**
 *
 * @author camis
 */
public class LibroserviceEj1 {
    public LibroEj1 cargarLibro() {
        Scanner scanner = new Scanner(System.in);
       
        LibroEj1 libro = new LibroEj1();
        System.out.print("Ingrese el número de ISBN: ");
        libro.ISBN = scanner.nextLine();

        System.out.print("Ingrese el título del libro: ");
        libro.titulo = scanner.nextLine();

        System.out.print("Ingrese el autor del libro: ");
        libro.autor = scanner.nextLine();

        System.out.print("Ingrese el número de páginas del libro: ");
        libro.numPaginas = scanner.nextInt();
        
        return libro;
    }
    
  public void mostrarInformacion(LibroEj1 libro) {
  
      System.out.println(libro.toString());
        
       
        
        
    }
}
