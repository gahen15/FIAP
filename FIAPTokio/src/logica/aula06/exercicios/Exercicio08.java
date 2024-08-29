package logica.aula06.exercicios;
import java.util.Scanner;
public class Exercicio08 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma distância em quilômetros: ");
		float dis = sc.nextFloat();
		
		System.out.println("Digite a litragem gasta: ");
		float lit = sc.nextFloat();
		float auto = dis/lit;
		System.out.printf("O consumo médio do automóvel é de %.1f Km/L\n", auto);
		if (dis/lit<8) {System.out.println("Esse carro bebe hein!");}
		else{System.out.println("Autonomia legal!");}
		
		
		
		
		
		
		
		
		
		
		
sc.close();		
}
}
