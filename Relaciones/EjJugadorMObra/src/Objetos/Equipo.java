/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.ArrayList;


/**
 *
 * @author camis
 */
public class Equipo {
    private ArrayList<jugador> Team;

    public Equipo() {
    }

    public Equipo(ArrayList<jugador> Team) {
        this.Team = Team;
    }

    public ArrayList<jugador> getTeam() {
        return Team;
    }

    public void setTeam(ArrayList<jugador> Team) {
        this.Team = Team;
    }

    @Override
    public String toString() {
        return "El equipo esta conformado por " + Team ;
    }
    
}
