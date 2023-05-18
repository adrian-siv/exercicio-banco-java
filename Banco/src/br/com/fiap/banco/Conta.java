package br.com.fiap.banco;

public abstract class Conta {
	
	private String numero;
	private double saldo;
	
	public Conta (String numero) {
		this.numero = numero;
	}
	
	public void depositar(double valor) throws DepositoNegativoException {
		if (valor < 0) {
			throw new DepositoNegativoException("Não é possível fazer depósito de um valor negativo.");
		}
		saldo+=valor;
	}
	
	public void sacar (double valor) throws SaldoInsuficienteException {
		if (valor > saldo) {
			throw new SaldoInsuficienteException("Seu saldo não é suficiente para realizar esta operação.");
		}		
		saldo-= valor;
	}
	
	
	public void transferir (double valor, Conta contaDestinataria) throws SaldoInsuficienteException {
		if (valor > saldo) {
			throw new SaldoInsuficienteException("Seu saldo não é suficiente para realizar esta operação.");
		}
		this.saldo -= valor;
		contaDestinataria.saldo += valor;
	}
	
	public String getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	
	
	
}
