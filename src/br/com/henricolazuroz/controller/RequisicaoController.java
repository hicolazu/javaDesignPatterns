package br.com.henricolazuroz.controller;

import br.com.henricolazuroz.model.*;

public class RequisicaoController {

    public void handleRequisicao(Requisicao req) {
        RespostaCSV respostaCSV = new RespostaCSV();
        RespostaXML respostaXML = new RespostaXML();
        RespostaJSON respostaJSON = new RespostaJSON();
        RespostaInvalida respostaInvalida = new RespostaInvalida();
        Conta conta = new Conta();

        respostaCSV.setProxima(respostaXML);
        respostaXML.setProxima(respostaJSON);
        respostaJSON.setProxima(respostaInvalida);

        respostaCSV.responde(req, conta);
    }
}
