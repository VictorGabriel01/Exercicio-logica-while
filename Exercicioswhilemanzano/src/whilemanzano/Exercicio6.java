package whilemanzano;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da base: ");
		int base =sc.nextInt();
		System.out.println("Digite o valor do expoente: ");
		int expoente = sc.nextInt();
		int resultado = 1;
		int contador = 1;
		while (contador < expoente) {
			 resultado = resultado*base;
			 contador++;
		}
		System.out.println("O valor da potência é: "+ resultado);
	}

}
