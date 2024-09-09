package logica.aula09.exercicios;
import java.util.Random;
public class Exercicio10 {

	public static void main(String[] args) {
	Random rand = new Random();
		int[][] mat1 = new int [3][3];
		int[][] mat2 = new int [3][3];
		int[][] mat3 = new int [3][3];
		
		for(int i = 0; i<3;i++) {
			for(int j = 0; j<3;j++) {
				mat1[i][j] = rand.nextInt(0,10);
				mat2[i][j] = rand.nextInt(0,10);	
			}
		}
		
		
		for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }
		System.out.println("\n  +\n");
		
		for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }
		
		System.out.println("\n  =  \n");
		for(int i = 0; i<3;i++) {
			for(int j =0; j<3; j++) {
				mat3[i][j] = mat1[i][j]+ mat2[i][j];
			}
		}
		for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat3[i][j] + " ");
            }
            System.out.println();
        }
		
		
	}

}
