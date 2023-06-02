package com.example.servicoRestFull.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.servicoRestFull.controllers.dto.ResponseDTO;
import com.example.servicoRestFull.entidades.Erro;
import com.example.servicoRestFull.entidades.Repositorio;
import com.example.servicoRestFull.entidades.RepositorioSimplificado;
import com.example.servicoRestFull.servicos.RepositorioService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = { "repos/" }, produces = { "application/json" })
public class RepositorioController {
        @Autowired
        RepositorioService repositorioService;

        @Operation(summary = "Permite a busca por repositorios cadastrados")
        @ApiResponses(value = {
                        @ApiResponse(responseCode = "200", description = "busca realizada com sucesso", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RepositorioSimplificado.class))),
                        @ApiResponse(responseCode = "400", description = "ocorreu um erro na busca", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Erro.class)))
        })
        @GetMapping(path = "/find")
        public ResponseEntity<?> buscarPeloNome(
                        @RequestParam(required = true, name = "nome") String nome,
                        @RequestParam(required = false, name = "pagina", defaultValue = "1") int pagina,
                        @RequestParam(required = false, name = "por_pagina", defaultValue = "10") int por_pagina) {

                ResponseDTO<?> resposta = repositorioService.buscarPeloNome(nome, pagina, por_pagina);
                return ResponseEntity.status(resposta.getStatusCode())
                                .body(resposta.getResposta());
        }

        @Operation(summary = "obtém dados de um repositório específico")
        @ApiResponses(value = {
                        @ApiResponse(responseCode = "200", description = "busca realizada com sucesso", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Repositorio.class)))
        })
        @GetMapping(path = "/{repoId}")
        public ResponseEntity<?> buscarPorId(@PathVariable String repoId) {
                ResponseDTO<?> resposta = repositorioService.buscarPorId(repoId);
                return ResponseEntity.status(resposta.getStatusCode())
                                .body(resposta.getResposta());
        }
}
