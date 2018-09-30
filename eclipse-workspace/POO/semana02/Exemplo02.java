package semana02;

import javax.swing.JOptionPane;

public class Exemplo02 {
	public static void main(String[] args) {
		String v1 = 
		  JOptionPane.showInputDialog("Digite um numero");
		String v2 = 
		  JOptionPane.showInputDialog("Digite um numero");
		int z=0, x=0, y=0;
		try {
			x = Integer.parseInt(v1);
			y = Integer.parseInt(v2);
			z = x / y;
		}
		catch(NumberFormatException erro) {
			JOptionPane.showMessageDialog(null,
					"Forneça um valor inteiro");
		}
		catch(ArithmeticException erro) {
			JOptionPane.showMessageDialog(null,
					"Divisão por zero");
		}
		finally {
			JOptionPane.showMessageDialog(null, "Fim");
	
			System.out.println("O resultado é: "+z);
		}

	}

}
