package logica.aula10.exercicios;
import java.util.Scanner;
public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o comprimento do terreno: ");
		float x = sc.nextFloat();
		System.out.print("Digite a largura do terreno: ");
		float y = sc.nextFloat();
		clcTERRENO(x,y);
		sc.close();
	}

	
	
	static void clcTERRENO(float x,float y) {
		
		System.out.printf("\nA área do terreno é %.1f m²",(x*y) );
		
	}
	
	
	
	
	
	
}
