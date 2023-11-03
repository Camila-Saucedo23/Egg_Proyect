/*
 * Crea una clase Auto. Como atributos tendrá nombre del dueño, fecha vencimiento carnet, color del
vehículo, modelo y KM en motor (deberá ser inicializado por defecto en 7500km),
Crear métodos que permitan:
 */
package objeto;

/**
 *
 * @author camis
 */
public class Auto {
    private String NombreDueño;
    private String FechaVencimientoCarnet;
    private String ColorAuto;
    private String Modelo;
    private int KmMotor = 7500;

    public Auto() {
    }

    public Auto(String NombreDueño, String FechaVencimientoCarnet, String ColorAuto, String Modelo, int KmMotor) {
        this.NombreDueño = NombreDueño;
        this.FechaVencimientoCarnet = FechaVencimientoCarnet;
        this.ColorAuto = ColorAuto;
        this.Modelo = Modelo;
        this.KmMotor = KmMotor;
    }

    public String getNombreDueño() {
        return NombreDueño;
    }

    public void setNombreDueño(String NombreDueño) {
        this.NombreDueño = NombreDueño;
    }

    public String getFechaVencimientoCarnet() {
        return FechaVencimientoCarnet;
    }

    public void setFechaVencimientoCarnet(String FechaVencimientoCarnet) {
        this.FechaVencimientoCarnet = FechaVencimientoCarnet;
    }

    public String getColorAuto() {
        return ColorAuto;
    }

    public void setColorAuto(String ColorAuto) {
        this.ColorAuto = ColorAuto;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getKmMotor() {
        return KmMotor;
    }

    public void setKmMotor(int KmMotor) {
        this.KmMotor = KmMotor;
    }

    @Override
    public String toString() {
        return "Auto{" + "NombreDue\u00f1o=" + NombreDueño + ", FechaVencimientoCarnet=" + FechaVencimientoCarnet + ", ColorAuto=" + ColorAuto + ", Modelo=" + Modelo + ", KmMotor=" + KmMotor + '}';
    }
    
}
