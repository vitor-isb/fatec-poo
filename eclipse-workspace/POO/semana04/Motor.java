package semana04;

public class Motor {

	private boolean status;
	private byte velocidade;
	private final byte VELOCIDADE_MAXIMA = 100;
	private final byte VELOCIDADE_MINIMA = 0;
	
	
	public void ligar() {
		status = true;
	}
	public void desligar() {
		status = false;
	}
	public void acelerar() {
		if(velocidade<VELOCIDADE_MAXIMA) {
			velocidade++;
		}
	}
	public void frear() {
		if(velocidade>VELOCIDADE_MINIMA) {
			velocidade--;
		}
	}
	public void mostrar() {
		System.out.println(status);
		System.out.println(velocidade);
	}
}
