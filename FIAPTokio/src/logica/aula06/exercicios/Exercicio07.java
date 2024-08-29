package logica.aula06.exercicios;

public class Exercicio07 {

	public static void main(String[] args) {
		
		int a = 5; 
		int b = 7; 
		int c = 4; 
		int d = 8; 
System.out.println("a = "+a);		
System.out.println("b = "+b);		
System.out.println("c = "+c);		
System.out.println("d = "+d);		
System.out.println("");			
System.out.printf("A.(a <= b) e (b < d) \nB.(a = b) ou (c != b)\nC.(d > a) e (c >= b)\nD.(a <= b) ou (c <= d)\nE.((b > c) ou (c < a)) e (d <= b)");
System.out.println("");					
System.out.println("");					
System.out.println("Respostas:");					
System.out.println("");

boolean valid1 = (a <= b)&&(b < d);
boolean valid2 = (a == b)||(c != b);
boolean valid3 = (d > a)&&(c>=b);
boolean valid4 = (a<=b)||(c<=d);
boolean valid5 = ((b>c)||(c<a))&&(d<=b);




System.out.println("A."+valid1);					
System.out.println("B."+valid2);					
System.out.println("C."+valid3);					
System.out.println("D."+valid4);					
System.out.println("E."+valid5);					
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
