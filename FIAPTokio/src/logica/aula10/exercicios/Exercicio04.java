package logica.aula10.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor: ");
		int num1 = sc.nextInt();
		System.out.println("Digite outro valor: ");
		int num2 = sc.nextInt();
		System.out.println("Escolha uma operação: \n|1|+ \n|2|-\n|3|*\n|4|/");
		int ope = sc.nextInt();

		conta(num1, num2, ope);
		sc.close();
	}

	static void conta(int num1, int num2, int ope) {
		float result = 0;
		switch (ope) {
		case 1: {
		 result = num1 + num2;
			break;
		}
		case 2: {
			 result = num1 - num2;
			break;
		}
		case 3: {
			 result = num1 * num2;
			break;
		}
		case 4: {
			if(num2 == 0) {System.out.println("Não é possível dividir um número por 0!");}else {
			 result = num1 / num2;}
			break;
		}
		default: {System.out.println("Erro");}
		break;
		}
		System.out.println("\nO resultado da operação é: " + result);
	}

}
