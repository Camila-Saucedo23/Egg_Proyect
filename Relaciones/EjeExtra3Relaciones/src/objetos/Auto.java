/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author camis
 */
public class Auto {
    private String Marca, Modelo, color, tipo;
    private int nromotor, chasis;

    public Auto() {
    }

    public Auto(String Marca, String Modelo, String color, String tipo, int nromotor, int chasis) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.color = color;
        this.tipo = tipo;
        this.nromotor = nromotor;
        this.chasis = chasis;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNromotor() {
        return nromotor;
    }

    public void setNromotor(int nromotor) {
        this.nromotor = nromotor;
    }

    public int getChasis() {
        return chasis;
    }

    public void setChasis(int chasis) {
        this.chasis = chasis;
    }

    @Override
    public String toString() {
        return "Auto{" + "Marca=" + Marca + ", Modelo=" + Modelo + ", color=" + color + ", tipo=" + tipo + ", nromotor=" + nromotor + ", chasis=" + chasis + '}';
    }
    
}
