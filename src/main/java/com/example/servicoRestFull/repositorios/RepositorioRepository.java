package com.example.servicoRestFull.repositorios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.example.servicoRestFull.entidades.Repositorio;
import com.example.servicoRestFull.helpers.JsonHelper;

@Repository
public class RepositorioRepository {
    private List<Repositorio> repositorios = new ArrayList<Repositorio>();

    public RepositorioRepository() {
        repositorios = new ArrayList<>(
                Arrays.asList(new JsonHelper().jsonParaRepositorios()));
    }

    public List<Repositorio> findAll() {
        return repositorios;
    }

    public List<Repositorio> findByNome(String nome) {
        return repositorios.stream().filter(r -> r.getName().equalsIgnoreCase(nome)).collect(Collectors.toList());
    }
}
