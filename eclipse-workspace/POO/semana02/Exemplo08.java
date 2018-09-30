package semana02;

public class Exemplo08 {

	public static void main(String[] args) {

		int a=0;
		while(a<100) {
			System.out.println(a);
			//a=a+5;
			a+=5;
		}
		
		for(a=0; a<=100; a+=5) {
			System.out.print(a+" ");
		}

	}

}
