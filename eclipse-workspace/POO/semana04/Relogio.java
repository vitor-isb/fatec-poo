package semana04;

import javax.swing.JOptionPane;

public class Relogio {

	public String fabricante;
	private int horas, minutos, segundos;
	
	public void definirHoras() {
		horas = Integer.parseInt(
			JOptionPane.showInputDialog("Horas?"));
	}
	public void definirMinutos() {
		minutos = Integer.parseInt(
			JOptionPane.showInputDialog("Minutos?"));
	}
	public void definirSegundos() {
		segundos = Integer.parseInt(
			JOptionPane.showInputDialog("Segundos?"));
	}
	public void mostrar() {
		JOptionPane.showMessageDialog(null, 
				"Horas: " + horas + "\n" +
				"Minutos: " + minutos + "\n" +
				"Segundos: " + segundos);
	}
	
	public void resetar() {
		horas = minutos = segundos = 0;
	}
	
}
