/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.ArrayList;
import java.util.Scanner;
import objeto.Reloj;

/**
 *
 * @author camis
 */
public class RelojService {
    Scanner leer = new Scanner(System.in);
   public Reloj CargarHorayValidacion(){
       Reloj R1= new Reloj();
       do {
           System.out.println("Ingrese la hora");
       R1.setHora(leer.nextInt());
       } while (R1.getHora()>=12);
       do {
         System.out.println("Ingrese los minutos");
       R1.setMin(leer.nextInt());  
       } while (R1.getMin()>= 60);
       do {
          System.out.println("Ingrese los segundos");
       R1.setSeg(leer.nextInt());  
       } while (R1.getSeg()>= 60); 
     return R1;  
   }
   public void MostrarHora(Reloj R1){
       System.out.println(R1.toString());
   }
   public void Cronometro(Reloj R1){
       for (int h = R1.getHora(); h < 12; h++) {
           for (int m = R1.getMin(); m < 60; m++) {
               for (int s = R1.getSeg(); s < 60; s++) {
                   System.out.println(h+":"+m+":"+s);
                   Segundos();
                   if(h<12 && m<59 && s==59){
                          m++;
                          s=0;
                          System.out.println(h+":"+m+":"+"00");
                          Segundos();
                      }
                      if(h<12 && m==59 && s==59){
                          s=0;
                          m=0;
                          h++;
                          System.out.println(h+":"+m+":"+"00");
                          Segundos();
                       
                      }
               }
           }  
       }
   }
   public void Segundos(){
       try{
            Thread.sleep(1000);
    }catch(InterruptedException e){} 
   }
// public static void limpiarPantalla() {
//    try {
//        System.out.println("Presione Enter para continuar...");
//        new java.util.Scanner (System.in).nextLine();
//
//        String sistemaOperativo = System.getProperty("os.name");
//        System.out.println(sistemaOperativo);
//        ArrayList<String> comando = new ArrayList<String>();
//        if(sistemaOperativo.contains("Windows")){
//            comando.add("cmd");
//            comando.add("/c");
//            comando.add("cls");
//        }else{
//            comando.add("clear"); //UNIX => MAC, LINUX
//        }
//        ProcessBuilder pb = new ProcessBuilder (comando);
//        Process iniciarProceso = pb.inheritIO().start();
//        iniciarProceso.waitFor();
//
//    }   catch (Exception e) {
//        System.err.println("Error al limpiar por pantalla"+e.getMessage());
//    }
//}
   
}
