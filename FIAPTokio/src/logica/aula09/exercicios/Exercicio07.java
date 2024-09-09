package logica.aula09.exercicios;
import java.util.Scanner;
public class Exercicio07 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        
        
        int tamanhoMaximo = 100;  
        String[] nomes = new String[tamanhoMaximo];
        int quantidadeNomes = 0;

   
        for (int i = 0; i < tamanhoMaximo; i++) {
            System.out.print("Digite um nome (ou aperte Enter para finalizar): ");
            String nome = sc.nextLine();
            
   
            if (nome.isEmpty()) {
                break;
            }
            
      
            nomes[i] = nome;
            quantidadeNomes++;
        }

      
        System.out.println("Nomes na ordem inversa:");
        for (int i = quantidadeNomes - 1; i >= 0; i--) {
            System.out.println(nomes[i]);
        }
        
        sc.close();
    }
}