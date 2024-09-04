package logica.aula08.exercicios;

import java.util.Random;

public class Exercicio05 {

	public static void main(String[] args) {
		Random rand = new Random();
		int num = 0;
		for (int i = 0; i < 10; i++) {

			num = num + rand.nextInt(5, 50);

		}
		System.out.println(num);
	}

}
