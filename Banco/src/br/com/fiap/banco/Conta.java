package br.com.fiap.banco;

public class Conta {
	
	private String numero;
	private double saldo;
	
	public Conta (String numero) {
		this.numero = numero;
	}
	
	public void depositar(double valor) throws DepositoNegativoException {
		if (valor < 0) {
			throw new DepositoNegativoException("Não é possível fazer depósito de um valor negativo!");
		}
		saldo+=valor;
	}
	
	public void sacar (double valor) {
	
		saldo-= valor;
	}

	public String getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	
	
	
}
