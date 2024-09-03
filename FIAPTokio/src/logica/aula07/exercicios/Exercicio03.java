package logica.aula07.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		System.out.println("");

		for (int cont = 0; cont <= 25; cont++) {
			System.out.println(num + " x " + cont + " = " + (cont * num));
		}
		sc.close();

	}

}
