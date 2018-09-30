package semana07;

public class Vida {
	
	public static void viver(Fisio f) {
		f.comer();
		f.beber();
		f.andar();
		f.dormir();
	}
	
	public static void main(String[] args) {
		Anime a = new Anime();
		viver(a);
		System.out.println();
		Pessoa p = new Pessoa();
		viver(p);
	}


}
