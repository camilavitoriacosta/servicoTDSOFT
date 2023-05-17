package com.example.servicoRestFull.repositorios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.example.servicoRestFull.entidades.RepositorioJson;
import com.example.servicoRestFull.helpers.JsonHelper;

@Repository
public class RepositorioRepository {
    private List<RepositorioJson> repositorios = new ArrayList<RepositorioJson>();

    public RepositorioRepository() {
        repositorios = new ArrayList<>(
                Arrays.asList(new JsonHelper().jsonParaRepositorios()));
    }

    public List<RepositorioJson> findAll() {
        return repositorios;
    }

    public List<RepositorioJson> findByNome(String nome, int pagina, int tamanhoPagina) {
        int indexInicial = (pagina - 1) * tamanhoPagina;

        return repositorios.stream()
                .filter(r -> r.getName().toLowerCase().contains(nome.toLowerCase()))
                .skip(indexInicial)
                .limit(tamanhoPagina)
                .collect(Collectors.toList());
    }

    public RepositorioJson findById(String id) {
        return repositorios.stream().filter(r -> r.getId().equals(id)).findFirst().orElse(null);
    }
}
