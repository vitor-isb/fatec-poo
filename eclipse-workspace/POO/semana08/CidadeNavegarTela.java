package semana08;

import java.awt.*;
import javax.swing.*;

public class CidadeNavegarTela extends JPanel {
    private JButton btProximo;
    private JButton btAnterior;
    private JLabel lbCodigo;
    private JLabel lbNome;
    private JTextField tfCodigo;
    private JTextField tfNome;

    public CidadeNavegarTela() {
    	inicializarComponentes();
    	definirEventos();
    }


    public void definirEventos() {
		
	}


	public void inicializarComponentes(){
    	btProximo = new JButton ("Proximo");
        btAnterior = new JButton ("Anterior");
        lbCodigo = new JLabel ("Codigo:");
        lbNome = new JLabel ("Nome:");
        tfCodigo = new JTextField (5);
        tfNome = new JTextField (5);
        setPreferredSize (new Dimension (383, 155));
        setLayout (null);
        add (btProximo);
        add (btAnterior);
        add (lbCodigo);
        add (lbNome);
        add (tfCodigo);
        add (tfNome);
        btProximo.setBounds (160, 115, 100, 20);
        btAnterior.setBounds (40, 115, 100, 20);
        lbCodigo.setBounds (40, 40, 100, 25);
        lbNome.setBounds (40, 75, 100, 25);
        tfCodigo.setBounds (105, 40, 100, 25);
        tfNome.setBounds (105, 75, 265, 25);
    }

	public static void main (String[] args) {
        JFrame frame = new JFrame ("Navegacao");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new CidadeNavegarTela());
        frame.pack();
        frame.setVisible (true);
    }
}