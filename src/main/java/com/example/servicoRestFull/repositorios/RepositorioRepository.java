package com.example.servicoRestFull.repositorios;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.servicoRestFull.entidades.Repositorio;

@Repository
public class RepositorioRepository {
    private List<Repositorio> repositorios;

    public RepositorioRepository() {
    }

    public Collection<Repositorio> buscarPorNome(String nome) {
        return repositorios;
    }
}
