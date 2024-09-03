package logica.aula07.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int cont = 0;
		do {
			System.out.println("Digite um número:");
			cont = cont + sc.nextInt();
			num++;
		} while (num < 10);
		System.out.println();
		System.out.println("A soma de todos os números é: " + cont);
		sc.close();

	}

}
