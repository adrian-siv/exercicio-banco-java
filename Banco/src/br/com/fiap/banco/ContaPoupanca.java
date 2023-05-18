package br.com.fiap.banco;

public class ContaPoupanca extends Conta {
	

	private double taxa;
	public ContaPoupanca(String numero, String nome) {
		super(numero, nome);
	}
	
	public double getTaxa() {
		return taxa;
	}

}
