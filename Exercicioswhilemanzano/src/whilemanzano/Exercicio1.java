package whilemanzano;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um numero para a saber a sua tabuada");
		int valor = sc.nextInt();
		int contador = 1;
		while (contador<10) {
			contador++;
			int resultado = valor*contador;
			System.out.println(valor+"x"+contador+" ="+resultado);
		}
		sc.close();
	}

}
