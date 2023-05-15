package com.example.servicoRestFull.mappers;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.example.servicoRestFull.entidades.Repositorio;
import com.example.servicoRestFull.entidades.RepositorioJson;
import com.example.servicoRestFull.entidades.RepositorioSimplificado;

@Component
public class RepositorioMapperImpl implements RepositorioMapper {
    public RepositorioSimplificado repositorioParaRepositorioSimplificado(Repositorio repositorio) {
        return new RepositorioSimplificado(repositorio.getId(), repositorio.getName());
    }

    public Collection<RepositorioSimplificado> repositoriosParaRepositoriosSimplificados(
            Collection<Repositorio> repositorios) {
        ArrayList<RepositorioSimplificado> repositorioSimplificados = new ArrayList<RepositorioSimplificado>();
        for (Repositorio repositorio : repositorios) {
            repositorioSimplificados.add(repositorioParaRepositorioSimplificado(repositorio));
        }

        return repositorioSimplificados;
    }
}
