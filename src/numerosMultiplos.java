
public class numerosMultiplos {
	
	/**
	* ATIVIDADE 1
	* Criar uma classe simples, que apresente os números múltiplos de 5 e 7, entre os números de 1 a 100.
	* Quando for múltiplo de 5, apresentar a letra A, quando for múltiplo de 7, apresentar a letra B 
	* e quando for múltiplo de 5 e 7, apresentar a letra C.
	*/
	
	public static void main(String[] args) {

		for (int n = 0; n <= 100; n++) {

			if (n >= 5 && n % 5 == 0)
				System.out.println("\n A - " + n + " é Multiplo de 5.");

			if (n >= 7 && n % 7 == 0)
				System.out.println("\n B - " + n + " é Multiplo de 7.");

			if (n >= 7 && n % 7 == 0 && n % 5 == 0)
				System.out.println("\n C - " + n + " é Multiplo de 5 e 7.");
		}
	}
}
