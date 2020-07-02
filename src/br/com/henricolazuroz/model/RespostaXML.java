package br.com.henricolazuroz.model;

public class RespostaXML implements Resposta {
    private Resposta proximo;

    @Override
    public void responde(Requisicao req, Conta conta) {
        if (req.getFormato().equals(Formato.XML)) System.out.print("Formato XML!");
        else proximo.responde(req, conta);
    }

    @Override
    public void setProxima(Resposta resposta) {
        this.proximo = resposta;
    }
}
