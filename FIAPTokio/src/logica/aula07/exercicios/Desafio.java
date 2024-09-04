package logica.aula07.exercicios;

public class Desafio {

    public static void main(String[] args) {
        System.out.println("Números primos entre 2 e 2000:");
System.out.println("");
  for (int j = 2; j<=2000; j++) {
        
   if(ehPrimo(j)) {System.out.println(j);}     
        
        
  }
        
    }
public static boolean ehPrimo(int num) {
	
	if (num <=1) {return false;}
	if(num == 2) {return true;}
	if (num % 2 == 0) { return false; }
	
	for (int i = 2; i<=Math.sqrt(num); i++ ) {
	if (num%i==0) {
	return false;

	}
	
	
	}return true;
	
	
}}