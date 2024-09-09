package logica.aula09.exercicios;
import java.util.Scanner;
import java.util.Random;
public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Digite um valor n > 0:");
		int valor = sc.nextInt();
		
		double[] vet = new double[valor];
		for (int i = 0 ; i<valor; i++) {

		System.out.println((i+1) + "º : "+ (vet[i]=rand.nextDouble()));	
			
			
		}
		
		
		
	
		
		
		sc.close();

	}

}
