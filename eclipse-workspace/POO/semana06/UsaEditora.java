package semana06;

public class UsaEditora {

	public static void main(String[] args) {
		Editora e = new Editora();
		e.nome = "Saraiva";
		e.livros = new Livro[3];
		e.livros[0] = new Livro();
		e.livros[1] = new Livro();
		e.livros[2] = new Livro();

		e.livros[0].isbn = "1";
		e.livros[0].titulo = "Manifesto Comunista";
		e.livros[0].qtdePaginas = 666;
		
		e.livros[1].isbn = "2";
		e.livros[1].titulo = "O Capital";
		e.livros[1].qtdePaginas = 123;
		
		e.livros[2].isbn = "3";
		e.livros[2].titulo = "A ideologia alemã";
		e.livros[2].qtdePaginas = 1488;
		
		e.mostrarTodosLivros();

	}

}
