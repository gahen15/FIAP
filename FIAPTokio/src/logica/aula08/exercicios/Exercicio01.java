package logica.aula08.exercicios;

import java.util.Calendar;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar tempo = Calendar.getInstance();

		int hora = tempo.get(Calendar.HOUR_OF_DAY);

		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();

		if (hora < 12) {
			System.out.println("Bom dia, " + nome + "!");
		} else if (hora < 18) {
			System.out.println("Boa tarde, " + nome + "!");
		} else {
			System.out.println("Boa noite, " + nome + "!");
		}

		sc.close();
	}
}