package semana05;

import javax.swing.JTextField;

public class MeuPI extends MeuFrame{

	private JTextField tfA, tfB;
	
	public MeuPI() {
		tfA = new JTextField();
		tfB = new JTextField();
		tfA.setBounds(10,50,200,20);
		tfB.setBounds(10,90,200,20);
		add(tfA);
		add(tfB);
	}
	
	public static void main(String[] args) {
		MeuPI m = new MeuPI();
		m.setVisible(true);

	}

}
