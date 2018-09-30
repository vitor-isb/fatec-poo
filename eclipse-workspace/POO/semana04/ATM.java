package semana04;

public class ATM {

	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria();
		conta1.depositar(500);
		conta1.depositar(300);
		conta1.sacar(200);
		conta1.sacar(700);
		conta1.consultar();
		
		ContaBancaria conta2 = new ContaBancaria();
		conta1.transferir(conta2, 100);
		conta1.consultar();
		conta2.consultar();
		
		

	}

}
