package logica.aula10.exercicios;
import java.util.Scanner;
public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		verIDADE(idade);
		sc.close();
	}
static void verIDADE(int idade) {
	
	if(idade<16) {
		System.out.println("\nSeu voto é proibido.");
		
		
	}else if ((idade>=16&&idade<18)||idade >70) {
		System.out.println("\nSeu voto é opcional.");
	}else {
		System.out.println("\nSeu voto é obrigatório.");
	}
	
}}
