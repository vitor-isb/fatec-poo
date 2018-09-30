package semana01;

import javax.swing.JOptionPane;

public class UsaExemplo05Usuario {

	public static void main(String[] args) {
		
		String v1 = 
			JOptionPane.showInputDialog("Digite o valor 1");
		String v2 = 
			JOptionPane.showInputDialog("Digite o valor 2");
		String op = 
			JOptionPane.showInputDialog("Forneça o operador");
		
		String[] v = {v1,v2,op};
		
		Exemplo05.main(v);
		
		//JOptionPane.showMessageDialog(null, s);
	}

}
