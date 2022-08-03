package exercicios;

import java.util.Scanner;

public class ex08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double n1, n2, n3, menor;

		String produto = "";

		System.out.println("*********************************************");
		System.out.println("           EXERCICIOS JAVA                   ");
		System.out.println("*********************************************");

		System.out.println("Digite o primeiro valor R$:");
		n1 = scan.nextDouble();
		System.out.println("Digite o segundo valor R$:");
		n2 = scan.nextDouble();
		System.out.println("Digite o terceiro valor R$:");
		n3 = scan.nextDouble();

		if (n1 < n2 && n1 < n3) {
			menor = n1;
			produto = "Produto 1";

		} else {
			if (n2 < n1 && n2 < n3) {
				menor = n2;
				produto = "Produto 2";
			} else {
				menor = n3;
				produto = "Produto 3";
			}

		}

		System.out.println("*********************************************");
		System.out.println("O menor produto mais em conta é o : " + produto + " custando R$ " + menor);
	}

}
