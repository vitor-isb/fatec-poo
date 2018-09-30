package semana04;

import java.io.IOException;
import java.io.PrintWriter;

public class Livro {
	private String titulo, autor, editora;
	private double preco;
	private boolean novo;
	private int qtdePaginas;
	
	public String gravar() {
		String ret = "";
		try {
			PrintWriter pw = new PrintWriter("livro.txt");
			pw.println(titulo);	 pw.println(autor);
			pw.println(editora); pw.println(preco);
			String s = "usado";
			if(novo) {	s = "novo"; 	}
			pw.println(s);
			pw.println(qtdePaginas);
			ret = "Arquivo gravado!";
			pw.close();
		}
		catch(IOException erro) {
			ret = "Falha na gravação";
		}
		return ret;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public boolean isNovo() {
		return novo;
	}
	public void setNovo(boolean novo) {
		this.novo = novo;
	}
	public int getQtdePaginas() {
		return qtdePaginas;
	}
	public void setQtdePaginas(int qtdePaginas) {
		this.qtdePaginas = qtdePaginas;
	}
	
	

}
