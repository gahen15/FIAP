package logica.aula06.exercicios;
import java.util.Scanner;
public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor1;
		int valor2;
		System.out.println("Digite um valor inteiro: ");
		valor1 = sc.nextInt();
		System.out.println("");
		System.out.println("Digite outro valor inteiro: ");
		valor2 = sc.nextInt();
		System.out.println("");
		
		
		
		
		if (valor1 > valor2) {
			
			System.out.println("O maior é " + valor1);
			
			
		}else if (valor1<valor2) {
			
			System.out.println("O maior é " + valor2);
		}else {System.out.println(valor1 + " e " + valor2 + " são iguais.");}
		
		
		sc.close();
	}

}
