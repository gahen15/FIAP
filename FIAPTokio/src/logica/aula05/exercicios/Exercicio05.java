package logica.aula05.exercicios;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma nota: ");
		float nota1 = sc.nextFloat();
		System.out.printf("\nDigite a segunda nota: \n");
		float nota2 = sc.nextFloat();
		System.out.println("");
		System.out.printf("Sua nota é: %.2f ", ((nota1*4)+(nota2*6))/10);
		
		sc.close();
		
	}
}
