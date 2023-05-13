package com.example.servicoRestFull.helpers;

import java.io.IOException;
import java.io.InputStream;

import com.example.servicoRestFull.entidades.Repositorio;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class JsonHelper {
    public Repositorio[] jsonParaRepositorios() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());

        try {
            // Carrega o arquivo JSON em um objeto
            InputStream inputStream = JsonHelper.class.getClassLoader().getResourceAsStream("repositoriesTeste.json");
            Repositorios repositorios = objectMapper.readValue(inputStream, Repositorios.class);
            return repositorios.getRepositorios();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
