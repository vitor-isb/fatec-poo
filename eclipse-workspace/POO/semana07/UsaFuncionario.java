package semana07;

public class UsaFuncionario {

	public static void main(String[] args) {

		Funcionario f = new Funcionario();

		f.nome = "João";
		f.salario = 10000;
		f.empresa = "XYZ";
		//f.mostrar();
		

		Funcionario f1 = new Funcionario();

		f1.nome = "Maria";
		f1.salario = 20000;
		f1.empresa = "FATEC";
		
		
		f1.mostrar();
		f.mostrar();		
//		Funcionario.empresa = "OSOKAOPKPO";
//		Funcionario.verEmpresa();
		

	}

}
