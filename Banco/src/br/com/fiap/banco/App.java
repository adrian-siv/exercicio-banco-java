package br.com.fiap.banco;

public class App {

	public static void main(String[] args) {
		Conta contaUsuarioA = new ContaPoupanca("1211");
		contaUsuarioA.toString();
		
		Conta contaUsuarioB = new ContaPoupanca("0588")
;		contaUsuarioB.toString();
				
		
		try {
			contaUsuarioA.sacar(10);
		} catch (SaldoInsuficienteException e) {
			System.err.println("Um erro aconteceu: " + e.getMessage());
		}
		
		
		try {
			contaUsuarioB.depositar(100);
		} catch (DepositoNegativoException e) {
			System.err.println("Um erro aconteceu: " + e.getMessage());
		}
		
		
		System.out.println("Saldo usuário B = " + contaUsuarioB.getSaldo());
		System.out.println("Saldo usuário A = " + contaUsuarioA.getSaldo());
		
		
		try {
			contaUsuarioB.transferir(150, contaUsuarioA);
		} catch (SaldoInsuficienteException e) {
			System.err.println("Um erro aconteceu: " + e.getMessage());
		}
		
		System.out.println("Saldo usuário B = " + contaUsuarioB.getSaldo());
		System.out.println("Saldo usuário A = " + contaUsuarioA.getSaldo());
		
		
		
		
		
	}

}
