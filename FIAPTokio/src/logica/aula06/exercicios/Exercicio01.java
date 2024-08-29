package logica.aula06.exercicios;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um valor inteiro: ");
        int valor = sc.nextInt();
        System.out.println("");
        if (valor % 2 == 0) {
            System.out.println(valor + " é par.");
        } 
        
        else {
            System.out.println(valor + " é ímpar.");
        }

        sc.close();
    }
}