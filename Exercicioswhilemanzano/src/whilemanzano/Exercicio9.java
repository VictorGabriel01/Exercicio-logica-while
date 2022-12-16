package whilemanzano;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int soma =1;
		int contadora = 1;
		while (contadora < 10) {
			System.out.println("Digite um valor:");
			int valor = sc.nextInt();
			soma = soma+valor;
			contadora++;
		}
		int media = soma/10;
		System.out.println("A somatoria de todos os valores digitado é: "+ soma+ "e a media dessa somatoria é: "+ media);
	}

}
