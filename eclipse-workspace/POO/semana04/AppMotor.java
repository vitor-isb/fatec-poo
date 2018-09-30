package semana04;

public class AppMotor {

	public static void main(String[] args) {
		
		Motor m = new Motor();
		m.frear();
		m.mostrar();
		
		m.acelerar();
		m.acelerar();
		m.mostrar();
		
		for(int a=0;a<1000;a++) {
			m.acelerar();
		}
		m.mostrar();

	}

}
