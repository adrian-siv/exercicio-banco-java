package br.com.fiap.banco;

public class ContaCorrente extends Conta{
	
	private double tarifa;
	
	public ContaCorrente(String numero) {
		super(numero);
	}

	public double getTafira() {
		return tarifa;
	}

}
