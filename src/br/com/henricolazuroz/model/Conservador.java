package br.com.henricolazuroz.model;

import br.com.henricolazuroz.model.Conta;
import br.com.henricolazuroz.model.Investimento;

public class Conservador implements Investimento {
	public double calcula(Conta conta) {
		return conta.getSaldo() * 0.008;
	}
}