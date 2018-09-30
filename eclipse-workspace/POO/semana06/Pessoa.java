package semana06;

public class Pessoa {
	
	public int codigo;
	public String nome;
	public Pessoa conjuge;
	
	public void mostrar() {
		System.out.println(this.codigo);
		System.out.println(this.nome);
		if(conjuge!= null)
			System.out.println("Conjuge: "+ conjuge.nome);
	}

}
