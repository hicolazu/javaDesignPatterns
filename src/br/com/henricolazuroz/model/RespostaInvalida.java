package br.com.henricolazuroz.model;

public class RespostaInvalida implements Resposta {
    @Override
    public void responde(Requisicao req, Conta conta) {
        System.out.print("Formato inválido!");
    }

    @Override
    public void setProxima(Resposta resposta) {
        //
    }
}
