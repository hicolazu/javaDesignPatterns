package br.com.henricolazuroz.model;

public interface Resposta {
    void responde(Requisicao req, Conta conta);
    void setProxima(Resposta resposta);
}
