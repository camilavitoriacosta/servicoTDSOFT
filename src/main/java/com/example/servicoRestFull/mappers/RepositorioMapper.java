package com.example.servicoRestFull.mappers;

import java.util.Collection;

import org.mapstruct.Mapper;

import com.example.servicoRestFull.entidades.RepositorioJson;
import com.example.servicoRestFull.entidades.RepositorioSimplificado;

@Mapper(componentModel = "spring")
public interface RepositorioMapper {
    public RepositorioSimplificado repositorioParaRepositorioSimplificado(RepositorioJson repositorio);

    public Collection<RepositorioSimplificado> repositoriosParaRepositoriosSimplificados(
            Collection<RepositorioJson> repositorios);
}
