package com.example.servicoRestFull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.servicoRestFull.controllers", "com.example.servicoRestFull.helpers","com.example.servicoRestFull.repositorios", "com.example.servicoRestFull.mappers",  "com.example.servicoRestFull.servicos"})
public class ServicoRestFullApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicoRestFullApplication.class, args);
	}

}
