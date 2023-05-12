package com.example.servicoRestFull.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.servicoRestFull.entidades.Erro;
import com.example.servicoRestFull.entidades.RepositorioSimplificado;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = { "" }, produces = { "application/json" })
public class RepositorioController {

    @Operation(summary = "Permite a busca por repositorios cadastrados")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "busca realizada com sucesso", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RepositorioSimplificado.class))),
            @ApiResponse(responseCode = "400", description = "ocorreu um erro na busca", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Erro.class)))
    })
    @GetMapping(path = "/find")
    public ResponseEntity<Object> buscarPeloNome(
            @RequestParam(required = true, name = "nome") String nome,
            @RequestParam(required = false, name = "pagina", defaultValue = "1") int pagina,
            @RequestParam(required = false, name = "por_pagina", defaultValue = "10") int por_pagina) {

        RepositorioSimplificado repo = new RepositorioSimplificado("MDEwOlJlcG9zaXRvcnkxMDI3MDI1MA==",
                "facebook/react");
        return ResponseEntity.status(HttpStatus.OK).body(repo);

        // Erro erro = new Erro("Nome é obrigatório");
        // return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erro);
    }
}