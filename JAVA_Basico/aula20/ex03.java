package aula20;

import java.util.Scanner;

public class ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] matriz3x3 = new int[3][3];

		int qtdPares = 0;
		int qtdImpares = 0;

		for (int i = 0; i < matriz3x3.length; i++) {
			for (int j = 0; j < matriz3x3[i].length; j++) {
				System.out.print("Digite o valor da posição " + "[" + i + "]" + "," + "[" + j + "] :");
				matriz3x3[i][j] = scan.nextInt();

				if (matriz3x3[i][j] % 2 == 0) {
					qtdPares++;
				} else {
					qtdImpares++;
				}
				
			}

		}
		System.out.println();

		
		for (int i = 0; i < matriz3x3.length; i++) {
			for (int j = 0; j < matriz3x3[i].length; j++) {
				System.out.print(matriz3x3[i][j] + " ");

			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Quantidade de numeros Pares: " + qtdPares);
		System.out.println("Quantidade de numeros Impares: " + qtdImpares);

	}

}
