package com.example.servicoRestFull.helpers;

import com.example.servicoRestFull.entidades.Repositorio;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Repositorios {
    @JsonProperty("repositories")
    private Repositorio[] repositorios;

    public Repositorio[] getRepositorios() {
        return repositorios;
    }

    public void setRepositorios(Repositorio[] repositorios) {
        this.repositorios = repositorios;
    }

}
