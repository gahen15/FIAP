package logica.aula06.exercicios;
import java.util.Scanner;
public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite um valor: ");
		float valor1 = sc.nextFloat();
		System.out.println("Digite outro valor: ");
		float valor2 = sc.nextFloat();
		System.out.printf("Escolha uma operação: \n+\n-\n*\n/\n");
		String ope = sc.next();
		
		switch (ope.charAt(0)) 
		{
			case '+': {System.out.println(valor1 + " + " +valor2 + " = "+ (valor1 + valor2));			
			break;
		}
			case '-': {System.out.println(valor1 + " - " +valor2 + " = "+ (valor1 - valor2));
			break;
		}
			case '*':{System.out.println(valor1 + " * " +valor2 + " = "+ (valor1 * valor2));
			break;
		}
			case '/':{System.out.println(valor1 + " / " +valor2 + " = "+ (valor1 / valor2));
			if (valor2 == 0) {System.out.println("Não é possível dividir um número por zero");}
			
			
			break;
			
		}
		default: {System.out.println("Erro");}
			
		}
		
		
		
		
		
		
		sc.close();
		
		
		
		
		
		
	}

}
