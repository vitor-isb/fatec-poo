package semana05;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuPI extends JFrame {
	private JMenuBar menuBar;
	private JMenu mnArquivo, mnCadastro;
	private JMenuItem miSair, miCliente, miProduto;

	public MenuPI() {
		setTitle("Projeto Interdisciplinar");
		setBounds(0, 0, 800, 600);
		setLayout(null);
		menuBar = new JMenuBar();
		mnArquivo = new JMenu("Arquivo");
		mnCadastro = new JMenu("Cadastro");
		miSair = new JMenuItem("Sair");
		miCliente = new JMenuItem("Cliente");
		miProduto = new JMenuItem("Produto");
		mnArquivo.add(miSair);
		mnCadastro.add(miCliente);
		mnCadastro.add(miProduto);
		menuBar.add(mnArquivo);
		menuBar.add(mnCadastro);
		setJMenuBar(menuBar);
		definirEventos();
	}

	public void definirEventos() {
		miCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MeuPI m = new MeuPI();
				m.setVisible(true);
			}
		});
	}

	public static void main(String[] args) {
		MenuPI m = new MenuPI();
		m.setVisible(true);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}