package br.com.fiap.banco;

public class ContaCorrente extends Conta{
	
	private double tarifa;
	
	public ContaCorrente(String numero, String nome) {
		super(numero, nome);
	}

	public double getTafira() {
		return tarifa;
	}

}
