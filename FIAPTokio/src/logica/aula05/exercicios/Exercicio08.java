package logica.aula05.exercicios;
import java.util.Scanner;
public class Exercicio08 {
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um valor em reais: ");
	float valor = sc.nextFloat();
	
	System.out.println("");
	System.out.printf("R$%.2f\n", valor);
	System.out.printf("US$%.2f\n", valor/5.56);
	System.out.printf("ARG$%.2f\n", valor/0.0058);
	System.out.printf("£%.2f\n",valor/7.35);
	System.out.printf("JPY$%.2f\n",valor/0.039);
	
	sc.close();
	
	
	
	
	
	
	
	
	
}
}
