package whilemanzano;

public class Exercicio10 {

	public static void main(String[] args) {
		int contadora = 49;
		int soma = 1;
		while (contadora < 70) {
			contadora++;
			if (contadora % 2 == 0) {
				soma = soma + contadora;
				System.out.println(contadora);
			}
			System.out.println("A soma dos numeros pares de 50 a 70 é: " + soma);
		}
	}

}
