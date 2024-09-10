package logica.aula11.desafio;

public class Operacoes {
	
	
		public static int soma(int a, int b) {
		int soma = a + b;
		return soma;
		}
		public static int subt(int a, int b) {
			int subt = a - b;
			return subt;
		}
		public static int mult(int a, int b) {
			int mult = a * b;
			return mult;
		}
		public static float divi(int a, int b) {
			if (b==0) {System.out.println("Não é possível dividir um número por zero!!!");
			return Float.NaN;}
			else  {;
			return (float) a/b;}
		
			
		}
		
		
	
	
	
	
	
}
