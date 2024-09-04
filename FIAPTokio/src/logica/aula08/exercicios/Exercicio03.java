package logica.aula08.exercicios;
import java.util.Scanner;
public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
int maius = 0;
int minus = 0;
int num = 0;
int espb = 0;
	System.out.println("Digite um texto: ");
	String texto = sc.nextLine();
	
	
	for (int i = 0; i<texto.length(); i++) {
		
		if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z' ) {maius = maius + 1;}
		if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z' ) {minus = minus + 1;}
		if (texto.charAt(i) >= '0' && texto.charAt(i) <= '9' ) {num = num + 1;}
		if (texto.charAt(i) == ' '  ) {espb = espb + 1;}
			
	}
	
	
	System.out.println("");
	System.out.println("Seu texto possui:");
	System.out.println("");
	System.out.println(maius+ " caracteres alfabéticos maiúsculos");
	System.out.println(minus+ " caracteres alfabéticos minúsculos");
	System.out.println(num+ " caracteres numéricos");
	System.out.println(espb+ " espaço em branco");
	
	
	
	
	
	
	
	
	
	sc.close();
	}

}
