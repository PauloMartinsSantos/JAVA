package exercicios;

import java.util.Scanner;

//Faça um Programa que peça dois números e imprima o maior deles.
public class ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1, n2, res;

		System.out.println("****************************************");
		System.out.println("          EXERCICIOS JAVA               ");
		System.out.println("****************************************");
		System.out.println("SOLICITA 2 NUMEROS E EXIBE O MAIOR DELES");
		System.out.println("****************************************");

		System.out.println("Digite o primeiro valor: ");
		n1 = scan.nextInt();

		System.out.println("Digite o segundo valor: ");
		n2 = scan.nextInt();

		if (n1 > n2) {
			System.out.println("O maior valor digitado foi: " + n1);

		} else {
			System.out.println("O maior valor digitado foi: " + n2);
		}

	}

}
