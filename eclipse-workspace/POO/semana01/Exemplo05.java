package semana01;

import javax.swing.JOptionPane;

public class Exemplo05 {
/*
 * Essa aplica��o recebe dois n�meros e realiza uma 
 * opera��o matem�tica entre eles
 */
	
	public static void main(String[] args) {
		if(args.length==3) {
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			if(args[2].equals("+")) {
				System.out.println(n1+n2);
				JOptionPane.showMessageDialog(null, (n1+n2));
			}
			else if(args[2].equals("-")) {
				System.out.println(n1-n2);
			}
			else if(args[2].equals("+")) {
				System.out.println(n1*n2);
			}
			else if(args[2].equals("/")) {
				System.out.println(n1/n2);
			}
			else {
				System.out.println("Operador desconhecido");
			}
		}
		else {
			System.out.println("N�mero de argumentos incorreto");
			System.out.println("Forne�a dois numeros e o operador");
		}

	}

}
