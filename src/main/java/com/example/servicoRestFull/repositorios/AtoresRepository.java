package com.example.servicoRestFull.repositorios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.servicoRestFull.entidades.Ator;
import com.example.servicoRestFull.helpers.JsonHelper;

@Repository
public class AtoresRepository {
    @Autowired
    private JsonHelper jsonHelper;

    private List<Ator> atores = new ArrayList<Ator>();

    public AtoresRepository() {
        atores = new ArrayList<>(
                Arrays.asList(jsonHelper.jsonParaAtor()));
    }

    public Ator findById(String id) {
        return atores.stream().filter(ator -> ator.getId().equals(id)).findFirst().orElse(null);
    }
}
