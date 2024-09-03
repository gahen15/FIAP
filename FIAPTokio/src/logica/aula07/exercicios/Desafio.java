package logica.aula07.exercicios;

public class Desafio {

	public static void main(String[] args) {
		
		        int inicio = 2;
		        int fim = 2000;

		        System.out.println("Números primos entre " + inicio + " e " + fim + ":");
		        
		        // Loop para verificar cada número no intervalo
		        for (int i = inicio; i <= fim; i++) {
		            if (ehPrimo(i)) {
		                System.out.println(i + " ");
		            }
		        }
		    }

		    // Método para verificar se um número é primo
		    public static boolean ehPrimo(int numero) {
		        // Números menores ou iguais a 1 não são primos
		        if (numero <= 1) {
		            return false;
		        }
		        // Verifica se o número é divisível por qualquer número de 2 até a raiz quadrada do número
		        for (int i = 2; i <= Math.sqrt(numero); i++) {
		            if (numero % i == 0) {
		                return false; // Não é primo se for divisível por i
		            }
		        }
		        return true; // Se passar por todos os testes, é primo
		    }
		}
