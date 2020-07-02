package br.com.henricolazuroz;

import br.com.henricolazuroz.model.ICMS;
import br.com.henricolazuroz.model.ISS;
import br.com.henricolazuroz.model.Imposto;
import br.com.henricolazuroz.model.Orcamento;
import br.com.henricolazuroz.service.CalculadorDeImpostos;

public class TesteDeImpostos {

	public static void main(String[] args) {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();

		Orcamento orcamento = new Orcamento(500.0);

		CalculadorDeImpostos calculador = new CalculadorDeImpostos();

		// Calculando o ISS
		calculador.realizaCalculo(orcamento, iss);

		// Calculando o ICMS
		calculador.realizaCalculo(orcamento, icms);
	}
}