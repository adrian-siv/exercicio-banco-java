package br.com.fiap.banco;

public abstract class Conta {
	
	private String numero;
	private double saldo;
	private String nome;
	
	public Conta (String numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	
	public void depositar(double valor) throws DepositoNegativoException {
		if (valor < 0) {
			throw new DepositoNegativoException("Não é possível fazer depósito de um valor negativo.");
		}
		saldo+=valor;
	}
	
	public void sacar (double valor) throws SaldoInsuficienteException, SaqueEmPoupancaException {
		if (valor > saldo) {
			throw new SaldoInsuficienteException("Seu saldo não é suficiente para realizar esta operação.");
		}
		if (this.getClass().getSimpleName() == "ContaPoupanca") {
			throw new SaqueEmPoupancaException("Não é possível realizar saques em contas poupança.");
		}
		saldo-= valor;
	}
	
	
	public void transferir (double valor, Conta contaDestinataria) throws SaldoInsuficienteException, TitularidadesDiferentesException, TransferenciaNegativaException {
		if (valor < 0) {
			throw new TransferenciaNegativaException("Não é possível fazer transferência de um valor negativo.");
		}
		if (valor > saldo) {
			throw new SaldoInsuficienteException("Seu saldo não é suficiente para realizar esta operação.");
		}
		if (this.nome != contaDestinataria.nome) {
			throw new TitularidadesDiferentesException("Não é possível realizar transferências entre contas com titularidades diferentes");
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
