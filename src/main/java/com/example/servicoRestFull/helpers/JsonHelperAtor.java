package com.example.servicoRestFull.helpers;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.stereotype.Component;

import com.example.servicoRestFull.entidades.Ator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

@Component
public class JsonHelperAtor {
    public Ator[] jsonParaAtor() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());

        try {
            // Carrega o arquivo JSON em um objeto
            InputStream inputStream = JsonHelperAtor.class.getClassLoader().getResourceAsStream("actors.json");
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
