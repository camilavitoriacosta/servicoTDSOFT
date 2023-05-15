package com.example.servicoRestFull.repositorios;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.example.servicoRestFull.entidades.Repositorio;
import com.example.servicoRestFull.helpers.JsonHelper;

@Repository
public class RepositorioRepository {
    private List<Repositorio> repositorios = new ArrayList<Repositorio>();

    public RepositorioRepository() {
        repositorios = new JsonHelper().jsonParaRepositorios();
    }

    public List<Repositorio> findAll() {
        return repositorios;
    }

    public List<Repositorio> findByNome(String nome, int pagina, int tamanhoPagina) {
        int indexInicial = (pagina - 1) * tamanhoPagina;

        return repositorios.stream()
                .filter(r -> r.getName().toLowerCase().contains(nome.toLowerCase()))
                .skip(indexInicial)
                .limit(tamanhoPagina)
                .collect(Collectors.toList());
    }

    public Repositorio findById(String id) {
        return (Repositorio) repositorios.stream().filter(r -> r.getId().equals(id));
    }
}
