package logica.aula06.exercicios;
import java.util.Scanner;
public class Exercicio09 {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Qual o seu tipo de conta: \n\n[1] Residencial\n[2] Comercial\n[3] Industrial\n\n");
		String tipo = sc.nextLine();
		System.out.println("");
		System.out.println("Digite quantos Kw/h você utiliza por mês: ");
		int quanto = sc.nextInt();
		System.out.println("");
		switch (tipo) {
		case "1": {
			System.out.println("O valor da sua conta de luz é: R$ " + (quanto * 0.6));	
		break;
		}case "2": {
			System.out.println("O valor da sua conta de luz é: R$  " + (quanto * 0.48));	
		break;
		}case "3": {
			System.out.println("O valor da sua conta de luz é: R$ " + (quanto * 1.29));	
		break;
		}
		
		
		default:
			System.out.println("Erro");;
		}
		
	
	
	
	
	
	sc.close();
}
}
