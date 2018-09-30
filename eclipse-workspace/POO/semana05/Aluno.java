package semana05;

import javax.swing.JOptionPane;

public class Aluno {

	private String ra, nome, curso;

	public Aluno() {
	}
	
	public Aluno(String nome) {
		this.nome = nome;
	}

	public Aluno(String ra, String nome, String curso) {
		this.ra = ra;
		this.nome = nome;
		this.curso = curso;
	}

	public Aluno(String ra, String nome) {
		this.ra = ra;
		this.nome = nome;
	}

	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public void digitarDados() {
		ra = JOptionPane.showInputDialog("RA?");
		nome = JOptionPane.showInputDialog("Nome?");
		curso = JOptionPane.showInputDialog("Curso?");
	}
	public void mostrar() {
		JOptionPane.showMessageDialog(null, 
			"RA: " + ra + 
			"\nNome: " + nome + 
			"\nCurso: " + curso);
	}
}
