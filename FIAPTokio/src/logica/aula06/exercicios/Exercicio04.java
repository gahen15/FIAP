package logica.aula06.exercicios;
import java.util.Scanner;
public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite outro valor: ");
		int valor2 = sc.nextInt();
		
		if (valor1%valor2==0) {
			
			System.out.println(valor1 + " e " + valor2 + " são múltiplos");
			
		}else if (valor2%valor1==0){
			
			System.out.println(valor1 + " é divisor de " + valor2);
			
			
		}else {System.out.println(valor1 + " e " + valor2 + " não divisores nem múltiplos");}
		
		
		sc.close();
		
		
		
		
		

	}

}
