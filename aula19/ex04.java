package aula19;

import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] vetorA = new double[2];
		double[] vetorB = new double[2];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o " + (i + 1) + "º valor");
			vetorA[i] = scan.nextInt();
			vetorB[i] = Math.sqrt(vetorA[i]);

		}
		System.out.println("Valores do vetor A: ");
		for (double posA : vetorA) {
			System.out.print(" " + posA);
		}
		System.out.println("");
		System.out.println("Raiz quadrada dos valores: ");
		for (double posB : vetorB) {
			System.out.print(" " + posB);
		}

	}

}
