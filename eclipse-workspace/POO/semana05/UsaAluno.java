package semana05;

public class UsaAluno {

	public static void main(String[] args) {
		Aluno a = new Aluno("Sabrina");
		Aluno b = new Aluno();
		
		a.digitarDados();
		a.mostrar();
		a.setNome("João");
	}

}
