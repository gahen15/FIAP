package logica.aula07.exercicios;
import java.util.Scanner;
public class Exercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
int num;
		System.out.println("Digite um valor inteiro: ");
		num = sc.nextInt();
		
		for (int vali = 1; vali <= num ; vali++) {
			if (num%vali == 0) {System.out.println(vali);}
			
		}
		
		
		
		
		
	sc.close();}

}
