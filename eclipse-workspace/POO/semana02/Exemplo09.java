package semana02;

import javax.swing.JOptionPane;

public class Exemplo09 {

	public static void main(String[] args) {
		
		float nota1=0;
		do {
			try {
				String s = JOptionPane.showInputDialog("Nota 1?");
				if(s==null) {
					JOptionPane.showMessageDialog(null,
							"Cancelar pressionado");
					System.exit(0);
				}
				nota1 = Float.parseFloat(s);
			}
			catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null,"Erro, tente novamente!");
				nota1 = -1;
			}
		}
		while(nota1<0 || nota1>10);
		
		float nota2=0;
		do {
			nota2 = Float.parseFloat(
				JOptionPane.showInputDialog("Nota2?"));	
		}
		while(nota2<0 || nota2>10);
		
		System.out.println("Média = "+(nota1+nota2)/2);
	}

}
