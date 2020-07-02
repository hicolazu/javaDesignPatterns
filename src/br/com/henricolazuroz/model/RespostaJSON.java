package br.com.henricolazuroz.model;

public class RespostaJSON implements Resposta{
    private Resposta proximo;

    @Override
    public void responde(Requisicao req, Conta conta) {
        if (req.getFormato().equals(Formato.JSON)) System.out.print("Formato JSON");
        else this.proximo.responde(req, conta);
    }

    @Override
    public void setProxima(Resposta resposta) {
        this.proximo = resposta;
    }
}
