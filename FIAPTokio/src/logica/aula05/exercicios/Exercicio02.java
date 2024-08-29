package logica.aula05.exercicios;

public class Exercicio02 {
    public static void main(String[] args) {
        int num1 = 1;
        float num2 = 2f;
        double num3 = 3;
        
        System.out.printf("%d\n%.2f\n%.1f\n", num1, num2, num3);
        
        String str1 = Integer.toString(num1);
        String str2 = Float.toString(num2);
        String str3 = Double.toString(num3);
        System.out.printf("\n%s\n%s\n%s", str1, str2, str3);
        
    }
}