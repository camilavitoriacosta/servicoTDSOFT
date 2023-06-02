package com.example.servicoRestFull.controllers.dto;

import org.springframework.http.HttpStatus;

public class ResponseDTO<T> {
    private T resposta;
    private HttpStatus statusCode;

    public ResponseDTO(T resposta, HttpStatus statusCode) {
        this.resposta = resposta;
        this.statusCode = statusCode;
    }

    public T getResposta() {
        return resposta;
    }

    public void setResposta(T resposta) {
        this.resposta = resposta;
    }

    public HttpStatus getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(HttpStatus statusCode) {
        this.statusCode = statusCode;
    }

}
