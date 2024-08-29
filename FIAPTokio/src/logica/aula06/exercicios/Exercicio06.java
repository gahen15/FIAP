package logica.aula06.exercicios;
import java.util.Scanner;
import java.time.LocalDate;
public class Exercicio06 {

	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	LocalDate data = LocalDate.now();
	int ano = data.getYear();
	System.out.print("Digite seu ano de nascimento: ");
	int nas = sc.nextInt();
	
	System.out.println("");
	int idade = ano - nas;
	if(idade<16) {
		System.out.println("Seu voto é proibido.");
		
		
	}else if ((idade>=16&&idade<18)||idade >70) {
		System.out.println("Seu voto é opcional.");
	}else {
		System.out.println("Seu voto é obrigatório.");
	}
	System.out.println("");
	System.out.println("Você tem "+idade+" ano(s) de idade.");
	sc.close();
		
		
		
		
	
	

	
	
	
	
	
}
}
