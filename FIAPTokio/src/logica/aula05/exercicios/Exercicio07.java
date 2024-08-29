package logica.aula05.exercicios;
import java.util.Scanner;
public class Exercicio07 {
public static void main (String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o valor total: ");
	float total = sc.nextFloat();
	System.out.println("Digite o valor pago: ");
	float pago = sc.nextFloat();
	System.out.println("");
	System.out.printf("O valor do troco é R$%.2f", (total-pago));
sc.close();

}
}
