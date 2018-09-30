package semana04;

public class AppLivro {
	public static void main(String[] args) {

		Livro livro = new Livro();
		livro.setTitulo("Poeira em alto mar");
		livro.setAutor("Fantasma");
		livro.setNovo(true);
		livro.setEditora("Maluca");
		livro.setPreco(50);
		livro.setQtdePaginas(100);
		
		System.out.println(livro.gravar());
		
		
	}
}
