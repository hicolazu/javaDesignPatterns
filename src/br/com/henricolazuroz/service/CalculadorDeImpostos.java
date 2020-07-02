package br.com.henricolazuroz.service;

import br.com.henricolazuroz.model.Imposto;
import br.com.henricolazuroz.model.Orcamento;

public class CalculadorDeImpostos {

	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {

		double valor = imposto.calcula(orcamento);

		System.out.println(valor);

	}

}