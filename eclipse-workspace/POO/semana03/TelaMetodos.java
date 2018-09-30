package semana03;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class TelaMetodos extends JFrame{

	private JLabel lbNum1, lbNum2, lbRes; 
	private JTextField tfNum1, tfNum2, tfRes;
	private JButton btSair,btLimpar,btSomar, btSubtrair, btMultiplicar, btDividir;
	
	public TelaMetodos() {
		setTitle("Calculadora");
		setBounds(200,200,300,200);
		setResizable(false);
		setLayout(new GridLayout(6, 2));
		lbNum1 = new JLabel("Num1:",JLabel.RIGHT);
		lbNum2 = new JLabel("Num2:",JLabel.RIGHT);
		lbRes = new JLabel("Total:",JLabel.RIGHT);
		tfNum1 = new JTextField();
		tfNum2 = new JTextField();
		tfRes = new JTextField();
		tfRes.setEditable(false);
		btLimpar = new JButton("Limpar");
		btSair = new JButton("Sair");
		btSomar = new JButton("Somar");
		btSomar.setMnemonic('S');
		btMultiplicar = new JButton("Multiplicar");
		btSubtrair = new JButton("Subtrair");
		btDividir = new JButton("Dividir");
		add(lbNum1);
		add(tfNum1);
		add(lbNum2);
		add(tfNum2);
		add(lbRes);
		add(tfRes);
		add(btSomar);
		add(btSubtrair);
		add(btMultiplicar);
		add(btDividir);
		add(btLimpar);
		add(btSair);
		btSair.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btLimpar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tfNum1.setText("");
				tfNum2.setText("");
				tfRes.setText("");
			}
		});
		btSomar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(btSomar, "Hello");	
				calcular("+");
			}
		});
		btSubtrair.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calcular("-");
			}
		});
		btMultiplicar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calcular("x");
			}
		});
		btDividir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calcular("/");
			}
		});
		
	}
	
	public void calcular(String op) {
		try{
			double x = Double.parseDouble(
				tfNum1.getText());
			double y = Double.parseDouble(
					tfNum2.getText());
			double r = Metodos.calcular(x, y, op);
			tfRes.setText(""+r);
		}
		catch(NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, "Digite números");
		}
	}
	
	public static void main(String[] args) {
		
		TelaMetodos t = new TelaMetodos();
		t.setVisible(true);
	}

}
