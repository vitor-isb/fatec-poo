package semana05;

public class Funcionario extends PessoaFisica {

	public double salario;
	
	public void mostrar() {
		super.mostrar();
		System.out.println(salario);
	}
}
