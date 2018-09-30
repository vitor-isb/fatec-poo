package semana08;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class GradeCidadeTela extends JFrame {
	private static final long serialVersionUID = 1L;

	private JButton btLocalizar, btSair;
	private JTextField tfLocalizar;
	private JPanel panel;
	private JTable table = new JTable();
	private DefaultTableModel model;
	private BD bd = new BD();

	public static void main(String args[]) {
		JFrame janela = new GradeCidadeTela();
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}

	public GradeCidadeTela() {
		setTitle("Tabela de Cidades");
		setBounds(200, 200, 600, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.white);
		btLocalizar = new JButton("Localizar");
		tfLocalizar = new JTextField(10);
		btSair = new JButton("Sair");
		panel = new JPanel();
		panel.setBackground(new Color(230, 230, 230));
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel.add(tfLocalizar);
		panel.add(btLocalizar);
		panel.add(btSair);
		add(panel, BorderLayout.NORTH);
		// add(table,BorderLayout.CENTER);
		bd.getConnection();
		model = TableModel.getModel(bd, "select * from cidade");
		table.setModel(model);
		JScrollPane sp = new JScrollPane(table);
		add(sp, BorderLayout.CENTER);
		definirEventos();
	}

	private void definirEventos() {
		btSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				bd.close();
				System.exit(0);
			}
		});

		btLocalizar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String sql = "select * from cidade where nome like '" + tfLocalizar.getText() + "%'";

				model = TableModel.getModel(bd, sql);
				table.setModel(model);

			}
		});

		tfLocalizar.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent arg0) {

			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				String sql = "select * from cidade where nome like '" + tfLocalizar.getText() + "%'";

				model = TableModel.getModel(bd, sql);
				table.setModel(model);

			}

			@Override
			public void keyPressed(KeyEvent arg0) {

			}
		});
	}
}