package logica.aula05.exercicios;
import java.util.Scanner;
public class Exercicio03 {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite seu nome: ");
	String nome = sc.next();
	System.out.printf("Escolha seu gênero: \n\n[M] Masculino\n[F] Feminino\n[O] Outro\n[N] Não responder\n\n");
	char gener = sc.next().charAt(0);
	System.out.println("");
	System.out.printf("Olá, %s! Você escolheu a seguinte opção de gênero: %c", nome, gener);
	
	sc.close();
}
}
