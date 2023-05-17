package br.com.fiap.banco;

public class App {

	public static void main(String[] args) {
		Conta conta = new Conta("1211");
		conta.toString()
;		
		ContaPoupanca poupanca = new ContaPoupanca("5652");
		poupanca.sacar(10);
	}

}
