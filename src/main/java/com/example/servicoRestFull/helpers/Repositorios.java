package com.example.servicoRestFull.helpers;

import com.example.servicoRestFull.entidades.RepositorioJson;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Repositorios {
    @JsonProperty("repositories")
    private RepositorioJson[] repositorios;

    public RepositorioJson[] getRepositorios() {
        return repositorios;
    }

    public void setRepositorios(RepositorioJson[] repositorios) {
        this.repositorios = repositorios;
    }
}
