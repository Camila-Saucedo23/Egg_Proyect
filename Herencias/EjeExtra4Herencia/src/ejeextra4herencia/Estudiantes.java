/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejeextra4herencia;

/**
 *
 * @author camis
 */
public class Estudiantes extends GestionFacultad {
    public String curso;

    public Estudiantes() {
    }

    public Estudiantes(String curso, int DNI, String nombre, String apellido, String estadocivil) {
        super(DNI, nombre, apellido, estadocivil);
        this.curso = curso;
    }

    @Override
    public void CargarPersona() {
        super.CargarPersona(); 
        System.out.println("Curso donde se matriculo: ");
        curso = leer.next();
    }
    
    // almacenar el curso en el que están matriculados. 
    public void CambioCurso(){
        System.out.println("Ingrese el nuevo curso al que se matriculo");
        curso = leer.next();
    }
   
}
