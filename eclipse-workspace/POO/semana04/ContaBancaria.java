package semana04;

public class ContaBancaria {

	private double saldo;
	private final int LIMITE_SAQUE = 1000;
	public void depositar(double valor) {
		saldo += valor;
	}
	public void sacar(double valor) {
		if(valor<=LIMITE_SAQUE) {
			if(valor<=saldo) {
				saldo -= valor;
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
		}
		else {
			System.out.println("Valor máximo atingido");
		}
	}
	public void consultar() {
		System.out.println(saldo);
	}
	
	
	public void transferir(ContaBancaria contaDestino, double valor) {
		saldo -= valor;
		contaDestino.saldo +=valor;
		
	}
}
