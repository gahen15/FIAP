package logica.aula07.exercicios;
import java.util.Scanner;
public class Exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a média padrão: ");
		float media = sc.nextFloat();
		int aluno = 0;
		int aluno2 = 0;
		int aluno3 = 0;
		for (int cont = 1; cont <=20; cont++) {
			
			System.out.println("Digite a nota de um aluno: ");
			float nota = sc.nextFloat(); 
			
			if (nota > media) {aluno++;} else if (nota < media) {aluno2++;}else {aluno3++;}
			
			
		}
		System.out.println("");
		System.out.println(aluno + " Alunos ficaram acima da média");
		System.out.println(aluno2 + " Alunos ficaram abaixo da média");
		System.out.println(aluno3 + " Alunos ficaram na média");
		
		
		
		
		sc.close();
	}

}
