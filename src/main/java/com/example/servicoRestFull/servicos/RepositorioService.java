package com.example.servicoRestFull.servicos;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.servicoRestFull.controllers.dto.ResponseDTO;
import com.example.servicoRestFull.entidades.Erro;
import com.example.servicoRestFull.entidades.Repositorio;
import com.example.servicoRestFull.entidades.RepositorioSimplificado;
import com.example.servicoRestFull.mappers.RepositorioMapper;
import com.example.servicoRestFull.repositorios.RepositorioRepository;

@Service
public class RepositorioService {
    @Autowired
    RepositorioRepository repositorioRepository;

    @Autowired
    RepositorioMapper repositorioMapper;

    public ResponseDTO<?> buscarPeloNome(String nome, int pagina, int por_pagina) {

        if (pagina < 1) {
            Erro erro = new Erro("O valor mínimo para página é 1");
            return new ResponseDTO<Erro>(erro, HttpStatus.BAD_REQUEST);
        }

        if (por_pagina < 1 || por_pagina > 25) {
            Erro erro = new Erro(
                    "O informado para por_pagina está fora dos limites permitidos, tente um valor entre 1 e 25");
            return new ResponseDTO<Erro>(erro, HttpStatus.BAD_REQUEST);
        }

        if (nome == null || nome.trim() == "") {
            Erro erro = new Erro("Nome é obrigatório");
            return new ResponseDTO<Erro>(erro, HttpStatus.BAD_REQUEST);
        }

        Collection<RepositorioSimplificado> repositorioSimplificados = repositorioMapper
                .repositoriosParaRepositoriosSimplificados(
                        repositorioRepository.findByNome(nome, pagina, por_pagina));

        return new ResponseDTO<Collection<RepositorioSimplificado>>(repositorioSimplificados, HttpStatus.OK);
    }

    public ResponseDTO<?> buscarPorId(String repoId) {
        Repositorio repositorio = repositorioRepository.findById(repoId);
        return new ResponseDTO<Repositorio>(repositorio, HttpStatus.OK);
    }
}
