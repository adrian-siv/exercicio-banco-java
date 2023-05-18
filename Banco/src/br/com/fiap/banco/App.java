package br.com.fiap.banco;

public class App {

	public static void main(String[] args) {
		Conta contaUsuarioA = new Conta("1211");
		contaUsuarioA.toString();
		
		Conta contaUsuarioB = new Conta("00588")
;		contaUsuarioB.toString();
		
		ContaPoupanca poupanca = new ContaPoupanca("5652");
		poupanca.sacar(10);
		
		
		try {
			contaUsuarioA.depositar(-2);
		} catch (DepositoNegativoException e) {
			System.err.println("Um erro aconteceu: " + e.getMessage());
		}
		
		
		
		
		
		
		
		
	}

}
