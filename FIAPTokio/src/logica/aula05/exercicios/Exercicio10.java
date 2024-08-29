package logica.aula05.exercicios;
import java.util.Scanner;
public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	System.out.print("Digite quantos anos você tem: ");
	int anos = sc.nextInt();
	System.out.print("Digite quantos meses além de anos que você tem: ");
	int meses = sc.nextInt();
	System.out.print("Digite quantos dias além de anos e meses que você tem: ");
	int dia = sc.nextInt();
	System.out.println("");
	System.out.println("");
	System.out.println("Você está a " + ((anos*365)+(meses*30)+dia)+" dias vivo.");
sc.close();
	
		
	}

}
