package com.example.servicoRestFull.repositorios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.servicoRestFull.entidades.Ator;
import com.example.servicoRestFull.helpers.JsonHelperAtor;

@Repository
public class AtoresRepository {
    private JsonHelperAtor jsonHelper;

    @Autowired
    public AtoresRepository(JsonHelperAtor jsonHelper) {
        this.jsonHelper = jsonHelper;
        atores = new ArrayList<>(Arrays.asList(this.jsonHelper.jsonParaAtor()));
    }

    private List<Ator> atores = new ArrayList<Ator>();

    public Ator findById(String id) {
        Ator atorResultante = atores.stream().filter(ator -> ator.getId().equals(id)).findFirst().orElse(null);
        System.out.println(atorResultante);
        System.out.println("*****************************");
        return atorResultante;
    }
}