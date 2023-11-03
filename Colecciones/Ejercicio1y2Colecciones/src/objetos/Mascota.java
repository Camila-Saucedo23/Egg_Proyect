/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author camis
 */
public class Mascota {
    private String Raza;

    public Mascota() {
    }

    public Mascota(String Raza) {
        this.Raza = Raza;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    @Override
    public String toString() {
        return "La raza del perro es: "  + Raza ;
    }
    
}
