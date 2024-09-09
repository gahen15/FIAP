package logica.aula09.exercicios;
import java.util.Scanner;
public class Exercicio04 {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	    
		   
		System.out.print("Digite o número de aluno: ");
		int alunos = sc.nextInt();
		double[] notas = new double[alunos];
		double soma=0;
		
		for(int i = 0; i < alunos;i++) {
			
			System.out.print("Digite a nota do aluno "+(i+1)+": ");
			notas[i] = sc.nextDouble();
			System.out.println();
			soma =  soma+notas[i];
		}
		double media = soma/alunos;
		int acimamedia = 0;  
		int namedia = 0;
		int abaixodamedia =0;
		
		for (int i = 0; i<alunos;i++) {
			
			if (notas[i] == media) {namedia++;}
			else if (notas[i]>media) {acimamedia++;}
			else {abaixodamedia++;}
			
		}		  
		   
		   
		   
		   
		   
		   
		   System.out.println("A média da turma foi: "+ media);
		   System.out.println(namedia + " Alunos estão na media.");
		   System.out.println(abaixodamedia+" Alunos estão abaixo da media.");
		   System.out.println(acimamedia+" Alunos estão acima da media.");
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   sc.close();
		   
		   
		   
		   
		   
		   
		   
	}}