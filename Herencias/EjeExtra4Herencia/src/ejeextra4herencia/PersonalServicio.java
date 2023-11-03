/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejeextra4herencia;

/**
 *
 * @author camis
 */
public class PersonalServicio extends Prefesor {
    public String seccion;

    public PersonalServicio() {
    }

    public PersonalServicio(String seccion, int anioinicio, int nrodespacho, int DNI, String nombre, String apellido, String estadocivil) {
        super(anioinicio, nrodespacho, DNI, nombre, apellido, estadocivil);
        this.seccion = seccion;
    }

    @Override
    public void CargarPersona() {
        super.CargarPersona(); 
        System.out.println("Seccion: ");
        seccion = leer.next();
    }
    
    public void TrasladodeSeccion(){
        System.out.println("En que seccion se encuentra actualmente");
        seccion = leer.next();
    }
}
