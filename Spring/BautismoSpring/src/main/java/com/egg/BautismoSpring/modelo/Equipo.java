package com.egg.BautismoSpring.modelo;
import lombok.Data;
import lombok.NonNull;
import lombok.ToString;
@Data
@ToString(exclude = "rankingFIFA")
public class Equipo {
    @NonNull
    private String nombrePais;
    @NonNull
    private String conf;
    private int rankingFIFA;
}
