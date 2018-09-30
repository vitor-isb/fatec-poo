package semana03;
public class Metodos {
	/**
	 * Imprime sempre a mesma mensagem em tela
	 */
	public static void imprimir() {
		System.out.println("Apostila de Java");
	}
	/**
	 * Recebe um texto e o imprime em tela
	 * Apresenta em tela o comprimento do texto
	 * @param texto - o texto a ser impresso
	 */
	public static void imprimir(String texto) {
		System.out.println(texto);
		System.out.println(texto.length());
	}
	/**
	 * Imprime em tela um valor inteiro
	 * @param a - o valor inteiro a ser impresso
	 */
	public static void imprimir(int a) {
		System.out.println(a);
	}
	/**
	 * Realiza a geração de valores aleatórios
	 */
	public static void gerar() {
		System.out.println(Math.random());
		System.out.println(Math.random()*100);
		System.out.println((int)(Math.random()*1000));
	}
	/**
	 * Gera um valor aleatório até certo limite
	 * @param limite - o limite do valor a ser gerado
	 */
	public static void gerar(int limite) {
		System.out.println(Math.random()*limite);
	}
	/**
	 * Simula o lançamento de um dado de seis dados
	 */
	public static void lancarDado() {
		System.out.println(1+(int)(Math.random()*6));
	}
	
	public static void somar(int a, int b) {
		System.out.println(a+b);
	}
	
	
	public static double somar(double a, double b) {
		return a+b;
	}
	
	public static double calcular(double a,double b,String op){
		double r = 0;
		op = op.toLowerCase();
		switch(op) {
			case "+": r = a + b; break;
			case "-": r = a - b; break;
			case "x": r = a * b; break;
			case "/": r = a / b; break;
		}
		return r;
	}
	
}
