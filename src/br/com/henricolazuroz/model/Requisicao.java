package br.com.henricolazuroz.model;

public enum Formato {
    XML,
    CSV,
    JSON
}

public class Requisicao {

    private Formato formato;

    public Requisicao(Formato formato) {
        this.formato = formato;
    }

    public Formato getFormato() {
        return formato;
    }
}
