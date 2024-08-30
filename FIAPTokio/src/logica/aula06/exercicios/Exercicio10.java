package logica.aula06.exercicios;
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu salário: ");
        float valor = sc.nextFloat();
System.out.println();
        if (valor <= 280) {
            System.out.printf("Salário inicial: R$%.2f\n", valor);
            System.out.println("Percentual de aumento: 20%");
            float aumento = valor * 0.2f;
            System.out.printf("Valor do aumento: R$%.2f\n", aumento);
            System.out.printf("Novo salário: R$%.2f\n", valor + aumento);
        }
        else if (valor > 280 && valor < 700) {
        	
        	System.out.printf("Salário inicial: R$%.2f\n", valor);
            System.out.println("Percentual de aumento: 15%");
            float aumento = valor * 0.15f;
            System.out.printf("Valor do aumento: R$%.2f\n", aumento);
            System.out.printf("Novo salário: R$%.2f\n", valor + aumento);
        	
        }else if (valor >= 700&& valor < 1500) {
        	System.out.printf("Salário inicial: R$%.2f\n", valor);
            System.out.println("Percentual de aumento: 10%");
            float aumento = valor * 0.1f;
            System.out.printf("Valor do aumento: R$%.2f\n", aumento);
            System.out.printf("Novo salário: R$%.2f\n", valor + aumento);
        	
        }else {
        	System.out.printf("Salário inicial: R$%.2f\n", valor);
            System.out.println("Percentual de aumento: 5%");
            float aumento = valor * 0.05f;
            System.out.printf("Valor do aumento: R$%.2f\n", aumento);
            System.out.printf("Novo salário: R$%.2f\n", valor + aumento);
        }
       

        sc.close();
    }
}