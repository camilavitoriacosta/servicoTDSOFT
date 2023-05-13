package com.example.servicoRestFull.entidades;

public class Erro {
    private String mensagem;

    public Erro(String string) {
        setMensagem(string);
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
