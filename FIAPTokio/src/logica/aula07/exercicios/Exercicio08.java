package logica.aula07.exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int num;
int cont;
int soma =0;
int sobe=1;
	do { 
		System.out.println("Digite um número inteiro positivo: ");
		num = sc.nextInt();
		sc.close();}while (num<0);
	
	
	for(cont = 0; cont < num; cont++) {
		soma = soma + sobe;
		sobe++;
		}

	System.out.println("A soma de todos os números inteiros até este número é: " + soma);
	
	
	
	

	}
}
