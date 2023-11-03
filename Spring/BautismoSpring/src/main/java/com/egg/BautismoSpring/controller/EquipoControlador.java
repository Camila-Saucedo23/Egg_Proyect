package com.egg.BautismoSpring.controller;

import com.egg.BautismoSpring.modelo.Equipo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@RestController
@RequestMapping("/equipos")
public class EquipoControlador {
    ArrayList<Equipo> equipos = new ArrayList<>(
            List.of(
                    new Equipo("Argentina", "Comebol"),
                    new Equipo("España", "UEFA"),
                    new Equipo("Marruecos", "CAF"),
                    new Equipo("Uruguay", "Comebol"),
                    new Equipo("Croacia", "UEFA")
            )
    );

    @GetMapping()
    //devuelve info a un rest
    public List<Equipo> ListaTodos() {
        return equipos;
    }

    @GetMapping("/{nombre}")
    public Equipo recuperarEquipoXNombre(@PathVariable String nombre) {
        for (Equipo equipo : equipos) {
            if (equipo.getNombrePais().equalsIgnoreCase(nombre)) {
                return equipo;
            }
        }
        return null;
    }

    @PostMapping()

    public void CrearEquipo(@RequestBody Equipo equipo) {
        equipos.add(equipo);
    }

    @DeleteMapping("/{nombre}")
    public void eliminarEquipo(@PathVariable String nombre) {
        for (Equipo equipo : equipos) {
            if (equipo.getNombrePais().equalsIgnoreCase(nombre)) {
                equipos.remove(equipo);
            }
        }
        //opcion lamda
        Optional<Equipo> optEquipo = equipos.stream().filter(equipo -> equipo.getNombrePais().equalsIgnoreCase(nombre)).findFirst();
        if (optEquipo.isPresent()) {
            equipos.remove(optEquipo.get());
        }
    }

    @PutMapping("/{nombre}")
    public void EditarEquipo(@RequestBody Equipo equiMod) {
        for (Equipo equipo : equipos) {
            if (equipo.getNombrePais().equalsIgnoreCase(equiMod.getNombrePais())) {
                equipo.setConf(equiMod.getConf());
                equipo.setRankingFIFA(equiMod.getRankingFIFA());
            }
        }
    }

    @GetMapping("/jugar/{equipoA}/{equipoB}")
    public String jugar(@PathVariable String equipoA, @PathVariable String equipoB) {
        Random random = new Random();
        int golesA = random.nextInt(10);
        int golesB = random.nextInt(4);
        return "Equipo " + equipoA + " (" + golesA + ")" + " - Equipo " + equipoB + "(" + golesB + ")";
    }
}
