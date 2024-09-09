package logica.aula09.exercicios;
import java.util.Scanner;
import java.util.Random;
public class Exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Digite um valor n>0: ");
		int valor = sc.nextInt();
		System.out.println();
		
		char[] text = new char[valor];
		Random rand = new Random();
		
		for (int i = 0; i < valor; i++)
		{
			text[i] = (char) (rand.nextInt(26)+ 'a');	
		}
		for (char c : text) {System.out.print(c);
		}
		
		// Ja definimos os caracteres, agora só inverter.
		char temp;
		for(int i  = 0 ; i<valor;i++) {
			
			temp = text[i];
			text[i] = text[valor-1];
			valor--;
			text[valor] = temp;
				
		}
		
		System.out.println();
	
	for (char c : text) {System.out.print(c);
	}
	
		
		
		sc.close();

	}

}
