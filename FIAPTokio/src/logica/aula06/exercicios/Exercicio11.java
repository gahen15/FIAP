package logica.aula06.exercicios;
import java.util.Scanner;
public class Exercicio11 {

	public static void main(String[] args) {
float preco =0;
Scanner sc = new Scanner(System.in);
float impo = 0;
System.out.println("Digite o código do estado: ");
int cod = sc.nextInt();
System.out.println("Digite o peso da carga em toneladas: ");
float peso = sc.nextFloat();
System.out.println("Digite o código da carga: ");
int coca = sc.nextInt();
System.out.println("");
System.out.println("O peso da carga é: "+ (peso = (peso * 1000)) + " Kg");

		
		if (coca >= 10 && coca <=20 ) {
		
			System.out.printf("Preço da carga: R$ %.2f\n", (100*peso));
		 preco = 100*peso;
		}else if (coca >= 21 && coca <=30 ) {
			System.out.printf("Preço da carga: R$ %.2f\n", (250*peso));
			preco = 250*peso;}
		 else {
			System.out.printf("Preço da carga: R$ %.2f\n", (340*peso));
			preco = 340*peso;}
		
		switch (cod) {
		case 1: {
			System.out.printf("O preço do imposto é: R$ %.2f\n", (preco*0.35));
			impo = preco*0.35f;
		
			break;
		}
		case 2: {
			System.out.printf("O preço do imposto é: R$ %.2f\n", (preco*0.25));
			impo = preco*0.25f;
			break;
		}
		case 3: {
		
			System.out.printf("O preço do imposto é: R$ %.2f\n", (preco*0.15));
			impo = preco*0.15f;
			break;
		}
		case 4: {
			System.out.printf("O preço do imposto é: R$ %.2f\n", (preco*0.05));
			impo = preco*0.05f;
			break;
		}
		case 5: {
			System.out.printf("O preço do imposto é: Isento \n");
			break; 	
		}
		default:
			System.out.println("Erro");;
		}
		System.out.printf("Preço total é: R$ %.2f", (preco+impo));
		
		
		
		sc.close();
	}

}
