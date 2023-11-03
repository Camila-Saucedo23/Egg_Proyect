/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author camis
 */
public class revolver {
    private int posicionactual;
    private int posicionagua;

    public revolver() {
    }

    public revolver(int posicionactual, int posicionagua) {
        this.posicionactual = (int)(Math. random()*5);
        this.posicionagua = (int)(Math. random()*5);
    }

    public Boolean disparar(){
       boolean exito = false;
        if (posicionactual==posicionagua) {
            exito = true;
        }
        siguientebala();
        return exito;
    }
    public void siguientebala(){
        if (posicionactual==6) {
            posicionactual=1;
        }else posicionactual++;
    }

    @Override
    public String toString() {
        return "posicionactual " + posicionactual + " posicionagua " + posicionagua ;
    }
    
}

