package com.example.servicoRestFull.helpers;

import com.example.servicoRestFull.entidades.Ator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Atores {
    @JsonProperty("actors")
    private Ator[] actores;

    public Ator[] getActores() {
        return actores;
    }

    public void setActores(Ator[] actores) {
        this.actores = actores;
    }
}
