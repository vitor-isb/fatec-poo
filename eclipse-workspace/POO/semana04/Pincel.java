package semana04;
public class Pincel {
	//atributos
	public String cor;
	public String fabricante;
	public double preco;
	//metodos
	public void imprimirEstado() {
		System.out.println(cor);
		System.out.println(fabricante);
		System.out.println(preco);
	}
	
	
	public String toString() {
		return "["+cor+","+fabricante+","+preco+"]";
	}
	
	public void abrir() {
		System.out.println("Abrindo a tampa");
	}
	public void fechar() {
		System.out.println("Fechando a tampa");
	}
	
}
