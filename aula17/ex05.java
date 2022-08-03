package aula17;

import java.util.Scanner;

public class ex05 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double popA;
		double popB;
		int count = 0;
		double taxaA, taxaB;

		boolean valido = false;

		do {
			System.out.println("Digite a população A: ");
			popA = scan.nextDouble();
			
			if (popA > 0) {
				valido = true;
			}
			else {
				System.out.println("População A precisa ser maior que 0");
			}

		} while (!valido);
		
		valido = false;

		do {
			System.out.println("Digite a taxa de crescimento A: ");
			taxaA = scan.nextDouble();
			
			if (taxaA > 0) {
				valido = true;
			}
			else {
				System.out.println("A taxa de crescimento A precisa ser maior que 0");
			}

		} while (!valido);
		
		valido = false;

		do {
			System.out.println("Digite a população B: ");
			popB = scan.nextDouble();
			
			if (popB > 0) {
				valido = true;
			}
			else {
				System.out.println("População B precisa ser maior que 0");
			}

		} while (!valido);
		
		valido = false;

		do {
			System.out.println("Digite a taxa de crescimento B: ");
			taxaB = scan.nextDouble();
			
			if (taxaB > 0) {
				valido = true;
			}
			else {
				System.out.println("A taxa de crescimento B precisa ser maior que 0");
			}

		} while (!valido);
		
		while(popA < popB) {
			popA += (popA/100) * taxaA;
			popB +=(popB/100) * taxaB;
			count++;
		}
		
		System.out.println("População A: " + popA);
		System.out.println("População B: " + popB);
		System.out.println("Quantidade de Anos: " + count);
		scan.close();

	}
}