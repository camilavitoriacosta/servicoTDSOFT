package com.example.servicoRestFull.repositorios;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.servicoRestFull.entidades.Repositorio;
import com.example.servicoRestFull.helpers.JsonHelperRepositorio;

@Repository
public class RepositorioRepository {
    private AtoresRepository atoresRepository;

    private List<Repositorio> repositorios = new ArrayList<Repositorio>();

    public RepositorioRepository(AtoresRepository atoresRepository) {
        this.atoresRepository = atoresRepository;
        repositorios = new JsonHelperRepositorio(this.atoresRepository).jsonParaRepositorios();
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
        return repositorios.stream().filter(r -> r.getId().equals(id)).findFirst().orElse(null);
    }
}
