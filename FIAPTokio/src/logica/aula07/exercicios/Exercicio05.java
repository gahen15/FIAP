package logica.aula07.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int cont = 0;
		do {
			System.out.println("Digite um número:");
			int veri = sc.nextInt();
			if (cont < veri){
			cont =  veri;
			}
			num++;
			}
		while (num < 12);
		System.out.println("O maior é: " + cont);


		sc.close();
	}

}
