package exercicios;

import java.util.Scanner;

//Fa�a um Programa que leia tr�s n�meros e mostre o maior deles.
public class ex06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double n1, n2, n3, maior;

		System.out.println("*********************************************");
		System.out.println("           EXERCICIOS JAVA                   ");
		System.out.println("*********************************************");

		System.out.println("Digite o primeiro n�mero:");
		n1 = scan.nextDouble();
		System.out.println("Digite o segundo n�mero:");
		n2 = scan.nextDouble();
		System.out.println("Digite o terceiro n�mero:");
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

		System.out.println("O maior n�mero digitado foi: " + maior);

	}

}
