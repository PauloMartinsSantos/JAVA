package aula20;

import java.util.Random;

public class ex02 {
	public static void main(String[] args) {

		int[][] numerosAleatorios = new int[10][10];
		Random numeroRandom = new Random();

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(100);

				System.out.print(numerosAleatorios[i][j] + " " );
			}
			System.out.println();
		}
		int maiorL5 = 0;
		int menorL5 = 101;
		int maiorC7 = 0;
		int menorC7 = 101;
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				if (numerosAleatorios[4][j] < menorL5) {
					menorL5 = numerosAleatorios[4][j];

				}
				if(numerosAleatorios[4][j] > maiorL5) {
					maiorL5 = numerosAleatorios[4][j];
					
				}
			}

		}
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				if (numerosAleatorios[i][6] > maiorC7) {
					maiorC7 = numerosAleatorios[i][6];
				}
				if (numerosAleatorios[i][6] < menorC7) {
					menorC7 = numerosAleatorios[i][6];
					
				}
			}
		}
		System.out.println();
		System.out.println("Maior Linha 5: " + maiorL5);
		System.out.println("Menor Linha 5: " + menorL5);
		System.out.println();
		System.out.println("Maior coluna 7: " + maiorC7);
		System.out.println("Menor coluna 7: " + menorC7);

	}

}
