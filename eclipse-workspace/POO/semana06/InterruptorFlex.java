package semana06;

public class InterruptorFlex {
	
	public void acionar(Lampada lampada) {
		lampada.status = !lampada.status;
		lampada.mostrar();
	}

}
