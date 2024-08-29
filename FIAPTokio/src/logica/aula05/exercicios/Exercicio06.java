package logica.aula05.exercicios;
import java.util.Scanner;
public class Exercicio06 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o nome da peça1: "); 
	String nome1 = sc.nextLine();
	System.out.println("Digite o número de peças1 que você quer: "); 
	int num1 = Integer.parseInt(sc.nextLine());
	System.out.println("Digite o valor unitário da peça1: "); 
	float valor1 = Float.parseFloat(sc.nextLine());
	System.out.println("Digite o nome da peça2: "); 
	String nome2 = sc.nextLine();
	System.out.println("Digite o número de peças2 que você quer: "); 
	int num2 = Integer.parseInt(sc.nextLine());
	System.out.println("Digite o valor unitário da peça2: "); 
	float valor2 = Float.parseFloat(sc.nextLine());
	
    // Cálculo do valor total da compra
    float total = (num1 * valor1) + (num2 * valor2);
    
    System.out.println("");
    System.out.printf("O valor total da compra é: R$%.2f\n", total);
    System.out.println("Peças: " + nome1 + ", "+nome2);
    sc.close();
}

}

