package br.com.fiap.banco;

public class SaldoInsuficienteException extends Exception {
	
	public SaldoInsuficienteException(String message) {
		super(message);
	}
}
