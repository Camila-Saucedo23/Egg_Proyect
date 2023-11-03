/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejeextra4herencia;

/**
 *
 * @author camis
 */
public class Prefesor extends GestionFacultad{
    protected int anioinicio, nrodespacho;
    protected String departamento;

    public Prefesor() {
    }

    public Prefesor(int anioinicio, int nrodespacho, String departamento, int DNI, String nombre, String apellido, String estadocivil) {
        super(DNI, nombre, apellido, estadocivil);
        this.anioinicio = anioinicio;
        this.nrodespacho = nrodespacho;
        this.departamento = departamento;
    }

    public Prefesor(int anioinicio, int nrodespacho, int DNI, String nombre, String apellido, String estadocivil) {
        super(DNI, nombre, apellido, estadocivil);
        this.anioinicio = anioinicio;
        this.nrodespacho = nrodespacho;
    }

    @Override
    public void CargarPersona() {
        super.CargarPersona(); 
        System.out.println("Año de incorporacion a la facultad como profesor: ");
        anioinicio = leer.nextInt();
        System.out.println("Numero de despacho asignado: ");
        nrodespacho = leer.nextInt();
    }
    
    //año de incorporación a la facultad y qué número de despacho tienen asignado. 
    public void CambiodeDespacho(){
        System.out.println("Ingrese el nuevo numero de despacho");
        nrodespacho = leer.nextInt();
    }
    //gestionar a qué departamento pertenecen (lenguajes, matemáticas, arquitectura, ...). 
    public void Departamento(){
        System.out.println("A que departamento pertenece (Matematicas, Geografia, etc)");
        departamento = leer.next();
    }
    public void CambiodeDepartamento(){
        System.out.println("Ingrese su nuevo departamento");
        departamento = leer.next();
    }
}
