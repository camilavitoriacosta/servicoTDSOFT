package com.example.servicoRestFull.helpers;

import java.io.IOException;

import com.example.servicoRestFull.entidades.Ator;
import com.example.servicoRestFull.repositorios.AtoresRepository;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AtorDeserializer extends JsonDeserializer<Ator> {
    private AtoresRepository atoresRepository;

    public AtorDeserializer() {
        // Construtor sem argumentos necessário para o ObjectMapper
    }

    public AtorDeserializer(AtoresRepository atoresRepository) {
        this.atoresRepository = atoresRepository;
    }

    @Override
    public Ator deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
            throws IOException, JsonProcessingException {
        ObjectMapper mapper = (ObjectMapper) jsonParser.getCodec();
        JsonNode node = mapper.readTree(jsonParser);

        System.out.println("______________________________");
        System.out.println(node.has("owner"));
        System.out.println("______________________________");
        
        if (node.has("owner")) {
            String idOwner = node.get("owner").asText();
            Ator ator = atoresRepository.findById(idOwner);
            return ator;
        }
        return null;
    }
}
