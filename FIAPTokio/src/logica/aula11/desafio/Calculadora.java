package logica.aula11.desafio;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float result=0;
		System.out.println("Digite um valor: ");
		int num1 = sc.nextInt();
		System.out.println("Digite outro valor: ");
		int num2 = sc.nextInt();
		System.out.println("Escolha uma operação: \n|1|+ \n|2|-\n|3|*\n|4|/");
		int ope = sc.nextInt();
		sc.close();

		
		
		
		switch (ope) {
		case 1: {
		 result = Operacoes.soma(num1, num2);
			break;
		}
		case 2: {
			 result = Operacoes.subt(num1, num2);
			break;
		}
		case 3: {
			 result = Operacoes.mult(num1, num2);
			break;
		}
		case 4: {
			 result = Operacoes.divi(num1, num2);
			break;
		}
		default: {System.out.println("Erro");}
		break;
		}
		System.out.println("\nO resultado da operação é: " + result);
	}

}
