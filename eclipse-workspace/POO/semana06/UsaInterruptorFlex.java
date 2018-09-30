package semana06;

public class UsaInterruptorFlex {

	public static void main(String[] args) {
		Lampada l1 = new Lampada();
		Lampada l2 = new Lampada();
		
		InterruptorFlex i = new InterruptorFlex();
		i.acionar(l1);
		i.acionar(l2);
		

	}

}
