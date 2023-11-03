/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Scanner;
import objeto.Movil;

/**
 *
 * @author camis
 */
public class serviceMovil {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Movil CargarCelular() {
        Movil M1 = new Movil();
        System.out.println("Ingrese la marca del Celular");
        M1.setMarca(leer.next());
        System.out.println("Ingrese la precio del Celular");
        M1.setPrecio(leer.nextDouble());
        System.out.println("Engrese el modelo del celular");
        M1.setModelo(leer.next());
        System.out.println("Ingrese la memoria RAM");
        M1.setRam(leer.nextInt());
        System.out.println("Ingrese el almacenamiento");
        M1.setAlmacenamiento(leer.nextInt());
        System.out.println("Ingrese el Codigo de 7 digitos");
        M1.setCodigo(IngresarCodigo(M1));
        M1.toString();
        return M1;
    }

    public int[] IngresarCodigo(Movil M1) {
        int[] codigo = new int[M1.getCodigo().length];
        String cod = leer.next();
        while (cod.length() != 7) {
            System.out.println("Codigo erroneo");
            System.out.println("Ingrese nuevo codigo");
            cod = leer.next();
        }
        for (int i = 0; i < M1.getCodigo().length; i++) {
            codigo[i] = Integer.parseInt(cod.substring(i, i + 1));
        }

        return codigo;
    }

}

