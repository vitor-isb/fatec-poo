package semana04;

public class AppRelogio {
	public static void main(String[] args) {
		Relogio r = new Relogio();
		r.fabricante = "Casio";
		r.definirHoras();
		r.definirMinutos();
		r.definirSegundos();
		
		r.mostrar();
		r.resetar();
		r.mostrar();
	}
}
