package com.example.servicoRestFull.repositorios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.servicoRestFull.entidades.Ator;
import com.example.servicoRestFull.helpers.JsonHelper;

@Repository
public class AtoresRepository {
    private List<Ator> atores = new ArrayList<Ator>();

    public AtoresRepository() {
        atores = new ArrayList<>(
                Arrays.asList(new JsonHelper().jsonParaAtor()));
    }

    public Ator findById(String id) {
        return (Ator) atores.stream().filter(ator -> ator.getId().equals(id));
    }
}
