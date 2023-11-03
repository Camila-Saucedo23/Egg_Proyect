/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author camis
 */
public class Poliza {
    private Cliente cliente;
    private Auto auto;
    private int nropoliza, inicio, vencimiento, cantcuotas, montoasegurado, montocoberturagranizo;
    private String mododepago, granizo, cobertura;

    public Poliza() {
    }

    public Poliza(Cliente cliente, Auto auto, int nropoliza, int inicio, int vencimiento, int cantcuotas, int montoasegurado, int montocoberturagranizo, String mododepago, String granizo, String cobertura) {
        this.cliente = cliente;
        this.auto = auto;
        this.nropoliza = nropoliza;
        this.inicio = inicio;
        this.vencimiento = vencimiento;
        this.cantcuotas = cantcuotas;
        this.montoasegurado = montoasegurado;
        this.montocoberturagranizo = montocoberturagranizo;
        this.mododepago = mododepago;
        this.granizo = granizo;
        this.cobertura = cobertura;
    }

   
    
   
}
