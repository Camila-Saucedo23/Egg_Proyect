/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animal;

/**
 *
 * @author camis
 */
public class Animal implements InterfasePractica {
    protected String nombre;
    protected Integer edad;
    protected String Raza;
    protected String alimento;

    public Animal() {
    }

    public Animal(String nombre, Integer edad, String Raza, String alimento) {
        this.nombre = nombre;
        this.edad = edad;
        this.Raza = Raza;
        this.alimento = alimento;
    }   
//    public void HacerRuido(){
//        System.out.println("Hola");
//    }
//
//    @Override
//    public void despedirse() {
//        System.out.println("Chaoo");
//    }
    @Override
    public void Alimentacion() {
        System.out.println("El animal come " + this.alimento);
    }     
}
