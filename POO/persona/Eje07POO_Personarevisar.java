/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eje07poo_persona;

import Objeto.Persona;
import Servicio.PersonaServicio;
import java.util.Scanner;

/*Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo 
('H' hombre, 'M' mujer, 'O' otro), peso y altura. 
Si el alumno desea añadir algún otro atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y 
después se le asignan a sus respectivos atributos para llenar el objeto Persona. Además, comprueba 
que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). 
Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de 
su peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 
(incluidos), significa que la persona está en su peso ideal y la función devuelve un 0. 
Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona 
tiene sobrepeso, y la función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los 
métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o 
está por debajo de su peso ideal e indicar para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas 
variables, para después en el main, calcular un porcentaje de esas 4 personas cuantas están 
por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y también calcularemos 
un porcentaje de cuantos son mayores de edad y cuantos menores
 */
public class Eje07POO_Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        PersonaServicio service = new PersonaServicio();
        System.out.println(" Ingresar los datos de la persona 1");
        Persona personas1 = service.crearPersona();
        System.out.println(" Ingresar los datos de la persona 2");
        Persona personas2 = service.crearPersona();
        System.out.println(" Ingresar los datos de la persona 3");
        Persona personas3 = service.crearPersona();
        System.out.println(" Ingresar los datos de la persona 4");
        Persona personas4 = service.crearPersona();

        int peso1 = service.calcularIMC(personas1);
        System.out.println(peso1);
        int peso2 = service.calcularIMC(personas2);
        int peso3 = service.calcularIMC(personas3);
        int peso4 = service.calcularIMC(personas4);

        boolean edad1 = service.mayorDeEdad(personas1);
        boolean edad2 = service.mayorDeEdad(personas2);
        boolean edad3 = service.mayorDeEdad(personas3);
        boolean edad4 = service.mayorDeEdad(personas4);

        int pesoIdeal = 0, menorPeso = 0, mayorPeso = 0, mayorEdad = 0, menorEdad = 0;
        
        if (peso1 == 0) {
            pesoIdeal++;
        }
            if (peso1 == -1) {
                menorPeso++;
                }
                if (peso1 == 1) {
                    mayorPeso++;
                }
                if (peso2 == 0) {
                    pesoIdeal++;
                    }
                    if (peso2 == -1) {
                        menorPeso++;
                        }
                        if (peso2 == 1) {
                            mayorPeso++;
                        }
                        if (peso3 == 0) {
                            pesoIdeal++;
                            }
                            if (peso3 == -1) {
                                menorPeso++;
                                }
                                if (peso3 == 1) {
                                    mayorPeso++;
                                }
                                if (peso4 == 0) {
                                    pesoIdeal++;
                                    }
                                    if (peso4 == -1) {
                                        menorPeso++;
                                        }
                                        if (peso4 == 1) {
                                            mayorPeso++;

                                        }
                                        if (edad1 == true) {
                                            mayorEdad++;
                                        } else {
                                            menorEdad++;
                                        }
                                        if (edad2 == true) {
                                            mayorEdad++;
                                        } else {
                                            menorEdad++;
                                        }
                                        if (edad3 == true) {
                                            mayorEdad++;
                                        } else {
                                            menorEdad++;
                                        }
                                        if (edad4 == true) {
                                            mayorEdad++;
                                        } else {
                                            menorEdad++;
                                        }
System.out.println("El porcentaje de personas con peso mayor es: " + mayorPeso / 4 * 100);
                                    System.out.println("El porcentaje de personas con peso menor es: " + menorPeso / 4 * 100);
                                    System.out.println("El porcentaje de personas con peso ideal es: " + pesoIdeal / 4 * 100);
                                    System.out.println("El porcentaje de personas menor de edad es: " + menorEdad / 4 * 100);
                                    System.out.println("El porcentaje de personas mayor de edad es: " + mayorEdad / 4 * 100);
                                    System.out.println("IMC" + service.calcularIMC(personas1));
    
    }
                                }
                            

         
   
    

