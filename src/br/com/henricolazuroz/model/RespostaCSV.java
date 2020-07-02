package br.com.henricolazuroz.model;

public class RespostaCSV implements Resposta {
    private Resposta proximo;

    @Override
    public void responde(Requisicao req, Conta conta) {
        if (req.getFormato().equals(Formato.CSV)) System.out.print("Formato CSV");
        else this.proximo.responde(req, conta);
    }

    @Override
    public void setProxima(Resposta resposta) {
        this.proximo = resposta;
    }
}
