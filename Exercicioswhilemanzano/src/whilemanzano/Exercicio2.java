package whilemanzano;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int contadora = 1;
		int soma = 0;
		while (contadora<101) {
			

			soma = soma+contadora;
			System.out.println("O valor da soma corresponde a: "+ soma);
			contadora++;
			
		}
		sc.close();
		
		
	}

}
