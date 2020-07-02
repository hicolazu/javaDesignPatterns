package br.com.henricolazuroz.service;

import br.com.henricolazuroz.model.Conta;
import br.com.henricolazuroz.model.Investimento;

public class RealizadorDeInvestimentos {
	public void realiza(Conta conta, Investimento investimento) {
		double resultado = investimento.calcula(conta);

		conta.deposita(resultado * 0.75);
		System.out.println("Novo saldo: " + conta.getSaldo());
	}
}