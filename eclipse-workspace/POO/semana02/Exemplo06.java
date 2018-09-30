package semana02;

public class Exemplo06 {

	public static void main(String[] args) {
		String s = "1";
		switch(s) {
			case "1":System.out.println("Um");break;
			case "2":System.out.println("Dois");break;
			case "3":System.out.println("Três");break;
			//...
			case "9":System.out.println("Nove");break;
		default:System.out.println("Desconhecido");
		}
	}

}
