package semana03;

import javax.swing.JOptionPane;

public class UsaMetodos {
	public static void main(String[] args) {
		/*Metodos.imprimir();
		Metodos.imprimir("Aula de Java");
		Metodos.imprimir("Sexta-feira");
		Metodos.gerar();
		for(int a=1; a<10; a++) {
			Metodos.lancarDado();
		}*/
		
/*		int x = Integer.parseInt(
				JOptionPane.showInputDialog("Valor 1"));
		int y = Integer.parseInt(
				JOptionPane.showInputDialog("Valor 2"));
		Metodos.somar(x, y);*/
		
		/*double x = 1.2;
		double y = 4.5;
		double r = Metodos.somar(x, y);
		System.out.println(r);*/
		
		double r = Metodos.calcular(10, 20, "X");
		System.out.println(r);
	}
}
