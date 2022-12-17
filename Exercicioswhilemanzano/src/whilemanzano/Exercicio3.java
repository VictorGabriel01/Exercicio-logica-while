package whilemanzano;

public class Exercicio3 {

	public static void main(String[] args) {
		int contadora = 1;
		int soma = 0;
		while (contadora < 501) {
		    if (contadora  % 2 == 0) {
		         soma = soma+contadora;
		    }
		    contadora++;
		}
		System.out.println("A soma dos valores é "+ soma);
	}

}
