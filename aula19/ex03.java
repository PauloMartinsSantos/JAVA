package aula19;

import java.util.Scanner;

public class ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[15];
		int[] vetorB = new int[15];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o " + (i + 1) + "º valor");
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i] * vetorA[i];

		}
		System.out.println("Valores do vetor A: ");
		for (int posA : vetorA) {
			System.out.print(" " + posA);
		}
		System.out.println("");
		System.out.println("Valores do vetor B: ");
		for (int posB : vetorB) {
			System.out.print(" " + posB);
		}

	}

}
