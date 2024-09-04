package logica.aula08.exercicios;

import java.util.Random;

public class Exercicio06 {

    public static void main(String[] args) {

        int numPares = 0;
        int numImpares = 0;
        int numPrimos = 0;
        Random rand = new Random();

        // Loop para sortear 100 números e contar pares e ímpares
        for (int i = 0; i < 100; i++) {
            int num = rand.nextInt(101); // Sorteia um número entre 0 e 100

            if (num % 2 == 0) {
                numPares++;
            } else {
                numImpares++;
                
                // Verifica se o número ímpar é primo
                if (ehPrimo(num)||num == 2) {
                   numPrimos++;
                }
            }
        }

        // Exibe os resultados
        System.out.println("Foram sorteados:");
        System.out.println("");
        System.out.println(numPares + " números pares.");
        System.out.println(numImpares + " números ímpares.");
        System.out.println(numPrimos + " números primos.");
    }

    // Método para verificar se um número é primo
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}