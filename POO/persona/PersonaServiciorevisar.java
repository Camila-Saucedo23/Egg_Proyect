/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Objeto.Persona;
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
public class PersonaServicio {
    

Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona persona1 = new Persona();

        System.out.println("Ingrese su nombre: ");
        persona1.setNombre(leer.next());
        System.out.println("Ingrese su edad: ");
        persona1.setEdad(leer.nextInt());
        System.out.println("Ingrese su sexo(H - Hombre // M - Mujer // O - Otro): ");
        persona1.setSexo(leer.next().toUpperCase().charAt(0));
        while (persona1.getSexo() != 'H' && persona1.getSexo() != 'M' && persona1.getSexo() != 'O') {
            System.out.println("ERROR. Vuelva a ingresar su sexo(H - Hombre // M - Mujer // O - Otro): ");
            persona1.setSexo(leer.next().toUpperCase().charAt(0));
        }
        System.out.println("Ingrese su peso: ");
        persona1.setPeso(leer.nextDouble());
        System.out.println("Ingrese su altura: ");
        persona1.setAltura(leer.nextDouble());
        return persona1;
    }

    public int calcularIMC(Persona persona1) {
        int i;
        double imc = persona1.getPeso() / persona1.getAltura()*persona1.getAltura();
        if (imc < 20) {
            i = -1;
        } else if (imc >= 20 && imc <= 25) {
            i = 0;
        } else {
            i = 1;
        }
        return i;
    }

    public boolean mayorDeEdad(Persona persona1) {
        boolean mayorEdad = false;

        if (persona1.getEdad() >= 18) {
            mayorEdad = true;
        }

        return mayorEdad;
    }
   
}