package logica.aula06.exercicios;

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do lado A do triângulo: ");
        float A = sc.nextFloat();

        System.out.print("Digite o valor do lado B do triângulo: ");
        float B = sc.nextFloat();

        System.out.print("Digite o valor do lado C do triângulo: ");
        float C = sc.nextFloat();
        System.out.println();

        if (A < B) {
            float temp = A;
            A = B;
            B = temp;
        }
        if (A < C) {
            float temp = A;
            A = C;
            C = temp;
        }
        if (B < C) {
            float temp = B;
            B = C;
            C = temp;
        }

        if (A >= (B + C)) {
            System.out.println("NÃO FORMA TRIÂNGULO");
        } else {
            if (A * A == B * B + C * C) {
                System.out.println("TRIÂNGULO RETÂNGULO");
            } else if (A * A > B * B + C * C) {
                System.out.println("TRIÂNGULO OBTUSÂNGULO");
            } else {
                System.out.println("TRIÂNGULO ACUTÂNGULO");
            }

            if (A == B && B == C) {
                System.out.println("TRIÂNGULO EQUILÁTERO");
            } else if (A == B || A == C || B == C) {
                System.out.println("TRIÂNGULO ISÓSCELES");
            } else {
                System.out.println("TRIÂNGULO ESCALENO");
            }
        }

        sc.close();
    }
}