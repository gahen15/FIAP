package logica.aula05.exercicios;
import java.util.Scanner;
public class Desafio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantos dias você está vivo: ");
		int valor = sc.nextInt();
		
		int anos = valor/365;
		int meses = (valor - anos*365)/30;
		int dias = valor - anos*365 - meses*30;
		System.out.println("");
		System.out.println("Você tem " + anos + " ano(s)," + meses +" mes(es) e " +dias+" dia(s)." );
	sc.close();
		
			
	}

}
