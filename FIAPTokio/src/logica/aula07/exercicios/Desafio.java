package logica.aula07.exercicios;

public class Desafio {

	public static void main(String[] args) {
		

		        System.out.println("Números primos entre " + inicio + " e " + fim + ":");
		        
		       
		        for (int i = 2; i <= 2000; i++) {
		            if (ehPrimo(i)) {
		                System.out.println(i + " ");
		            }
		        }
		    }

		   
		    public static boolean ehPrimo(int numero) {
		       
		        if (numero <= 1) {
		            return false;
		        }
		       
		        for (int i = 2; i <= Math.sqrt(numero); i++) {
		            if (numero % i == 0) {
		                return false; // Não é primo se for divisível por i
		            }
		        }
		        return true; // Se passar por todos os testes, é primo
		    }
		}
