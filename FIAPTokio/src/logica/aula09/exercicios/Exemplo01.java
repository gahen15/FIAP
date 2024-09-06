package logica.aula09.exercicios;

public class Exemplo01 {

	public static void main(String[] args) {
		
		
		String[] nome = {"Arthur", "Bia", "Carlo", "Daniel", "Eduarda"};
		
		
		for(int i = 0;  i < 4; i++) {
			
// j sempre será uma casa após o i
			for(int j = i+1; j < nome.length;j++) {
				System.out.println(nome[i]+nome[j]);
				
				
				
			}
			
			
		}
		System.out.println(nome.length);
		
		
		
	}

}
