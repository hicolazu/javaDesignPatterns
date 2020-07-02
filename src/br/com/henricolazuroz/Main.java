package br.com.henricolazuroz;

import br.com.henricolazuroz.controller.RequisicaoController;
import br.com.henricolazuroz.model.Formato;
import br.com.henricolazuroz.model.ICMS;
import br.com.henricolazuroz.model.Orcamento;
import br.com.henricolazuroz.model.Requisicao;
import br.com.henricolazuroz.service.CalculadorDeImpostos;

public class Main {

    public static void main(String[] args) {
        calculaImposto();
        trataRequisicao();
    }

    private static void calculaImposto() {
        CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();

        Orcamento orcamento = new Orcamento(50);
        ICMS icms = new ICMS();

        calculadorDeImpostos.realizaCalculo(orcamento, icms);
    }

    private static void trataRequisicao() {
        RequisicaoController requisicaoController = new RequisicaoController();
        Requisicao requisicao = new Requisicao(Formato.JSON);

        requisicaoController.handleRequisicao(requisicao);
    }

}
