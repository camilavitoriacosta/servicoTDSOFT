package com.example.servicoRestFull.helpers;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.servicoRestFull.entidades.Ator;
import com.example.servicoRestFull.entidades.Repositorio;
import com.example.servicoRestFull.entidades.RepositorioJson;
import com.example.servicoRestFull.repositorios.AtoresRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class JsonHelper {
    @Autowired
    private AtoresRepository atoresRepository;

    public List<Repositorio> jsonParaRepositorios() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());

        try {
            // Carrega o arquivo JSON em um objeto
            InputStream inputStream = JsonHelper.class.getClassLoader().getResourceAsStream("repositories.json");
            Repositorios repositoriosJson = objectMapper.readValue(inputStream, Repositorios.class);

            List<Repositorio> repositorios = new ArrayList<Repositorio>();
            for (RepositorioJson repositorioJson : repositoriosJson.getRepositorios()) {
                Ator owner = atoresRepository.findById(repositorioJson.getOwner());
                // adicionar na lista de repositorios
            }

            return repositorios;

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public Ator[] jsonParaAtor() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());

        try {
            // Carrega o arquivo JSON em um objeto
            InputStream inputStream = JsonHelper.class.getClassLoader().getResourceAsStream("repositories.json");
            Atores atores = objectMapper.readValue(inputStream, Atores.class);
            return atores.getActores();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
