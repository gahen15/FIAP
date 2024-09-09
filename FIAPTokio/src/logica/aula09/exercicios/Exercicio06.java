package logica.aula09.exercicios;
import java.util.Scanner;
public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		System.out.print("Digite um valor para o vetor: ");
		int[] vet = new int[sc.nextInt()];
	
		for(int i = 0 ; i<vet.length;i++) {
			
			System.out.print("Digite o valor da casa " + i + " do vetor: ");
			vet[i] = sc.nextInt();
			System.out.println();
			soma = soma+vet[i];
		}
		
		
		
		System.out.println();
		System.out.println("A somatória equivale a " + soma);
		
		sc.close();
	}

}
