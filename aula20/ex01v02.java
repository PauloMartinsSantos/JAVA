package aula20;

import java.util.Random;

public class ex01v02 {
	public static void main(String[] args) {

		int[][] numerosAleatorios = new int[4][4];

		Random numeroRandom = new Random();

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(100);

			}

		}
		int maior = Integer.MIN_VALUE;
		int linha = 0;
		int col = 0;
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(100);
				if(numerosAleatorios[i][j] > maior) {
					maior = numerosAleatorios[i][j];
					linha = i;
					col = j;
					
				}

			}

		}
		System.out.println("Maior valor = " + maior);
		System.out.println("Linha = " + linha);
		System.out.println("Coluna = " + col);

	}

}
