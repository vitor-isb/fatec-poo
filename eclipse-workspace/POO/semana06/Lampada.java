package semana06;

public class Lampada {

	public boolean status;

	public void ligar() {
		this.status = true;
	}

	public void desligar() {
		this.status = false;
	}

	public void mostrar() {
		if (status) {
			System.out.println("Ligada");
		} else {
			System.out.println("Desligada");
		}
	}

}
