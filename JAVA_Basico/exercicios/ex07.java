package exercicios;
//Faça um Programa que leia três números e mostre o maior e o menor deles

import java.util.Scanner;

public class ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double n1, n2, n3, maior, menor;

		System.out.println("*********************************************");
		System.out.println("           EXERCICIOS JAVA                   ");
		System.out.println("*********************************************");

		System.out.println("Digite o primeiro número:");
		n1 = scan.nextDouble();
		System.out.println("Digite o segundo número:");
		n2 = scan.nextDouble();
		System.out.println("Digite o terceiro número:");
		n3 = scan.nextDouble();

		if (n1 > n2 && n1 > n3) {
			maior = n1;

		} else {
			if (n2 > n1 && n2 > n3) {
				maior = n2;
			} else {
				maior = n3;
			}

		}

		if (n1 < n2 && n1 < n3) {
			menor = n1;

		} else {
			if (n2 < n1 && n2 < n3) {
				menor = n2;
			} else {
				menor = n3;
			}

		}
		
		System.out.println("*********************************************");
		System.out.println("O menor número digitado foi: " + menor);
		System.out.println("O maior número digitado foi: " + maior);

	}
}
