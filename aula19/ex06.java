package aula19;

import java.util.Scanner;

public class ex06 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[5];
		int[] vetorB = new int[5];
		int[] vetorC = new int[5];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o " + (i + 1) + "� valor");
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i];
			vetorC[i] = vetorA[i] + vetorB[i];

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
		System.out.println("");
		System.out.println("Soma dos Valores: ");
		for (int posC : vetorC) {
			System.out.print(" " + posC);
		}

	}

}
