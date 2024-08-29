package logica.aula06.exercicios;
import java.util.Scanner;
public class Exercicio03 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite a nota de Matemática: ");
	int math = sc.nextInt();
	System.out.println("Digite a nota de Português: ");
	int por = sc.nextInt();
	System.out.println("Digite a nota de História: ");
	int his = sc.nextInt();
	System.out.println("Digite a nota de Física: ");
	int fis = sc.nextInt();
	float media = (float) (math + por + his + fis)/4;
	
	System.out.println("");
	
	
	
	if (media >= 7) {	
		System.out.println("Aluno Aprovado    Média: " + media);
		
	}else if (media >= 5 && media < 7) {
		System.out.println("Aluno em Recuperação    Média: " + media);
		
	}else {System.out.println("Aluno Reprovado      Média: " + media );}
	
	
	sc.close();
	
	
	
	
	
	
	
	
	}

}
