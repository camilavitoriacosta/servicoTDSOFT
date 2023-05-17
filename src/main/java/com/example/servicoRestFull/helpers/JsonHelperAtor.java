package com.example.servicoRestFull.helpers;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.servicoRestFull.entidades.Ator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

@Component
public class JsonHelperAtor {
    public List<Ator> jsonParaAtor() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.registerModule(new JavaTimeModule());

        try {
            // Carrega o arquivo JSON em um objeto
            InputStream inputStream = JsonHelperAtor.class.getClassLoader().getResourceAsStream("actors.json");
            JsonNode rootNode = objectMapper.readTree(inputStream);
            JsonNode actorsNode = rootNode.get("actors");

            List<Ator> atores = new ArrayList<Ator>();
            if (actorsNode != null && actorsNode.isArray()) {
                for (JsonNode actorNode : actorsNode) {
                    Ator ator = objectMapper.treeToValue(actorNode, Ator.class);
                    atores.add(ator);
                }
            }

            return atores;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
