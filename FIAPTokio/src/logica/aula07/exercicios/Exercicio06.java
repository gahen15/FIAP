package logica.aula07.exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor inteiro: ");
		int valor = sc.nextInt();

		for (int num = 1; num <= valor; num++) {

			if (num % 2 == 0) {
				System.out.println(num);
			}

		}
		sc.close();
	}

}
