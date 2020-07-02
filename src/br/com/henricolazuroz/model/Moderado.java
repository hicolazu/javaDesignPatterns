package br.com.henricolazuroz.model;

import br.com.henricolazuroz.model.Conta;
import br.com.henricolazuroz.model.Investimento;

import java.util.Random;

class Moderado implements Investimento {
	private Random random;

	public Moderado() {
		this.random = new Random();
	}

	public double calcula(Conta conta) {
		if (random.nextInt(2) == 0)
			return conta.getSaldo() * 0.025;
		else
			return conta.getSaldo() * 0.007;
	}
}
