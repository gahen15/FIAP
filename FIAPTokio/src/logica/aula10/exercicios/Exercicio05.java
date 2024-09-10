package logica.aula10.exercicios;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma temperatura: ");
        float temp = sc.nextFloat();
        
        // Limpa o caractere de nova linha do buffer
        sc.nextLine(); 

        System.out.println("Digite a escala da temperatura:\n|C| Celsius\n|F| Fahrenheit \n|K| Kelvin");
        char escala = sc.nextLine().charAt(0);

        conversao(temp, escala);
        sc.close();
    }

    static void conversao(float temp, char escala) {
        float far = 0;
        float cel = 0;
        float kel = 0;

        if (escala == 'C' || escala == 'c') {
            cel = temp;
            far = (temp * 9 / 5) + 32;
            kel = temp + 273.15f;
        } 
        else if (escala == 'F' || escala == 'f') {
            far = temp;
            cel = (temp - 32) * 5 / 9;
            kel = ((temp - 32) * 5 / 9) + 273.15f;
        } 
        else if (escala == 'K' || escala == 'k') {
            kel = temp;
            cel = temp - 273.15f;
            far = ((temp - 273.15f) * 9 / 5) + 32;
        } 
        else {
            System.out.println("Escala inválida.");
            return;
        }

        System.out.println("\nCelsius: " + cel + " C°");
        System.out.println("Fahrenheit: " + far + " F°");
        System.out.println("Kelvin: " + kel + " K");
    }
}