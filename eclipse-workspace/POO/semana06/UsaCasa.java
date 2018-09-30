package semana06;

public class UsaCasa {

	public static void main(String[] args) {
		Casa c = new Casa();
		c.sala.lampada.ligar();
		c.sala.lampada2.ligar();
		c.sala.lampada.mostrar();
		c.sala.lampada2.mostrar();
		
		c.sala.ar.setTemperatura(22);
		c.sala.ar.aumentar();
		c.sala.ar.mostrar();
	}

}
