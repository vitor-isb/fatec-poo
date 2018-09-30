package semana05;
public class PessoaFisica extends Pessoa{
	public String cpf, rg;
	public void mostrar() {
		super.mostrar();
		System.out.println(rg);
		System.out.println(cpf);
	}
}
