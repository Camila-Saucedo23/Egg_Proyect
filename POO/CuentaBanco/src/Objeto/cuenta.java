/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objeto;

/**
 *
 * @author camis
 */
public class cuenta {
    public int Nrocuenta;
    public long DNI;
    public double saldoActual;

    public cuenta() {
    }

    public cuenta(int Nrocuenta, long DNI, int saldoActual) {
        this.Nrocuenta = Nrocuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    public int getNrocuenta() {
        return Nrocuenta;
    }

    public void setNrocuenta(int Nrocuenta) {
        this.Nrocuenta = Nrocuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double setSaldoActual() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
