package semana01;

import javax.swing.JOptionPane;

public class Exemplo05 {
/*
 * Essa aplicação recebe dois números e realiza uma 
 * operação matemática entre eles
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
			System.out.println("Número de argumentos incorreto");
			System.out.println("Forneça dois numeros e o operador");
		}

	}

}
