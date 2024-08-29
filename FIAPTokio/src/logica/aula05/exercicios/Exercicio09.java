package logica.aula05.exercicios;
import java.util.Scanner;
public class Exercicio09 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = sc.nextInt();
		
		int cen = valor - valor % 100;
		int dez = valor%100 - (valor%100)%10 ;
		int uni = valor - cen - dez;
		
		System.out.println("");
		System.out.println("Centena: "+cen);
		System.out.println("Dezena: " +dez);
		System.out.println("Unidade: "+uni);
		
		sc.close();
		
		
		
		
	}
}
