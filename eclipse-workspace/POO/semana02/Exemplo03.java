package semana02;
import javax.swing.JOptionPane;
public class Exemplo03 {
	public static void main(String[] args) {
		float n1=0, n2=0;
		try {
			n1 = Float.parseFloat(
				JOptionPane.showInputDialog("Nota 1"));	
		}
		catch(NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, 
					"Nota 1 inv�lida");
		}
		
		try {
			n2 = Float.parseFloat(
				JOptionPane.showInputDialog("Nota 2"));	
		}
		
		catch(NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, 
					"Nota 2 inv�lida");
		}

		JOptionPane.showMessageDialog(null,
			"A m�dia �: \n" + (n1+n2)/2);
	}
}
