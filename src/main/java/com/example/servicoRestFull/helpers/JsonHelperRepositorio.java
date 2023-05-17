package com.example.servicoRestFull.helpers;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.servicoRestFull.entidades.Repositorio;
import com.example.servicoRestFull.repositorios.AtoresRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

@Component
public class JsonHelperRepositorio {
    // @Autowired
    private AtoresRepository atoresRepository;

    public JsonHelperRepositorio(AtoresRepository atoresRepository) {
        this.atoresRepository = atoresRepository;
    }

    public List<Repositorio> jsonParaRepositorios() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());

        try {
            // Carrega o arquivo JSON em um objeto
            InputStream inputStream = JsonHelperRepositorio.class.getClassLoader()
                    .getResourceAsStream("repositories.json");
            JsonNode rootNode = objectMapper.readTree(inputStream);
            JsonNode repositoriesNode = rootNode.get("repositories");

            List<Repositorio> repositorios = new ArrayList<>();
            if (repositoriesNode != null && repositoriesNode.isArray()) {
                for (JsonNode repositoryNode : repositoriesNode) {
                    String idOwner = repositoryNode.get("owner").asText();
                    Repositorio repositorio = objectMapper.treeToValue(repositoryNode, Repositorio.class);
                    repositorio.setOwner(atoresRepository.findById(idOwner));
                    repositorios.add(repositorio);
                }
            }

            return repositorios;

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
