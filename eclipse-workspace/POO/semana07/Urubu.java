package semana07;

public class Urubu implements Passaro, Alimentar {

	@Override
	public void comer() {
		System.out.println("Comendo");
	}

	@Override
	public void voar() {
		System.out.println("Voando");

	}

	@Override
	public void cantar() {
		System.out.println("Cantar");

	}

}
