package br.com.fiap.banco;

public class App {

	public static void main(String[] args) {
		Conta conta1 = new ContaPoupanca("1211", "Henrique");
		conta1.toString();
		
		Conta conta2 = new ContaPoupanca("0588", "Denner");
		conta2.toString();
		
		Conta conta3 = new ContaPoupanca("1314", "Denner");
		conta2.toString();
				
		
		try {
			conta1.sacar(10);
		} catch (SaldoInsuficienteException e) {
			System.err.println("Um erro aconteceu: " + e.getMessage());
		}
		
		
		try {
			conta2.depositar(100);
		} catch (DepositoNegativoException e) {
			System.err.println("Um erro aconteceu: " + e.getMessage());
		}
		
		
		System.out.println("Saldo conta 1 = " + conta1.getSaldo());
		System.out.println("Saldo conta 2 = " + conta2.getSaldo());
		System.out.println("Saldo conta 3 = " + conta3.getSaldo());
		
		
		try {
			conta2.transferir(50, conta1);
		} catch (SaldoInsuficienteException e) {
			System.err.println("Um erro aconteceu: " + e.getMessage());
		} catch (TitularidadesDiferentesException e) {
			System.err.println("Um erro aconteceu: " + e.getMessage());
		} catch (TransferenciaNegativaException e) {
			System.err.println("Um erro aconteceu: " + e.getMessage());
		}
		
		System.out.println("Saldo conta 1 = " + conta1.getSaldo());
		System.out.println("Saldo conta 2 = " + conta2.getSaldo());
		System.out.println("Saldo conta 3 = " + conta3.getSaldo());
		
		try {
			conta2.transferir(200, conta3);
		} catch (SaldoInsuficienteException e) {
			System.err.println("Um erro aconteceu: " + e.getMessage());
		} catch (TitularidadesDiferentesException e) {
			System.err.println("Um erro aconteceu: " + e.getMessage());
		} catch (TransferenciaNegativaException e) {
			System.err.println("Um erro aconteceu: " + e.getMessage());
		}
		
		System.out.println("Saldo conta 1 = " + conta1.getSaldo());
		System.out.println("Saldo conta 2 = " + conta2.getSaldo());
		System.out.println("Saldo conta 3 = " + conta3.getSaldo());
		
		try {
			conta2.transferir(-50, conta3);
		} catch (SaldoInsuficienteException e) {
			System.err.println("Um erro aconteceu: " + e.getMessage());
		} catch (TitularidadesDiferentesException e) {
			System.err.println("Um erro aconteceu: " + e.getMessage());
		} catch (TransferenciaNegativaException e) {
			System.err.println("Um erro aconteceu: " + e.getMessage());
		}
		
		System.out.println("Saldo conta 1 = " + conta1.getSaldo());
		System.out.println("Saldo conta 2 = " + conta2.getSaldo());
		System.out.println("Saldo conta 3 = " + conta3.getSaldo());
		
		
		
		
	}

}
