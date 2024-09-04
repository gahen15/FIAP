package logica.aula08.exercicios;

import java.util.Calendar;

public class Exercicio02 {

	public static void main(String[] args) {
		String dia = "";

		Calendar cal = Calendar.getInstance();
		int dian = cal.get(Calendar.DAY_OF_WEEK);

		switch (dian) {
		case 1: {

			dia = "domingo";
			break;
		}
		case 2: {

			dia = "segunda-feira";
			break;
		}
		case 3: {

			dia = "terça-feira";
			break;
		}
		case 4: {

			dia = "quarta-feira";
			break;
		}
		case 5: {

			dia = "quinta-feira";
			break;
		}
		case 6: {

			dia = "sexta-feira";
			break;
		}
		case 7: {

			dia = "sábado";
			break;
		}
		default:
			break;
		}

		System.out.println("Hoje é " + dia);

		if (dian == 3) {
			System.out.println("Hoje terá feira de rua.");
		}

	}

}
