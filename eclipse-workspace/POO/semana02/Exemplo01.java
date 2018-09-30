package semana02;

import javax.swing.JOptionPane;

public class Exemplo01 {

	public static void main(String[] args) {
		
		String v = 
		  JOptionPane.showInputDialog("Digite um numero");
		try {
			int x = Integer.parseInt(v);
			System.out.println(v);
			System.out.println(x);
		}
		catch(NumberFormatException erro) {
			JOptionPane.showMessageDialog(null,
					"Forneça um valor inteiro");
		}
	}

}
