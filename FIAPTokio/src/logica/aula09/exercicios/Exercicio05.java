package logica.aula09.exercicios;

public class Exercicio05 {

	public static void main(String[] args) {
		String[] mes = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dec"};
		int[] dia = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for(int i = 0; i<mes.length;i++) {
			System.out.println("O mês de " + mes[i] +" tem " + dia[i]+" dias.");
			
		}
		
		
		
	}

}
