package whilemanzano;

public class Exercicio7 {

	public static void main(String[] args) {
		int valor1 = 1;
		int valor2 = 1;
		int valor3 = 1;
		int contador = 3;
		while (contador < 18) {
			valor3 = valor1+valor2;
			System.out.println(valor3);
			valor1 = valor2;
			valor2 = valor3;
			contador++;
		}
	}

}
