package exercicios;

import java.util.Scanner;

//Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
public class ex04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String letra = "";

		System.out.println("*********************************************");
		System.out.println("           EXERCICIOS JAVA                   ");
		System.out.println("*********************************************");

		System.out.println("Digite uma letra: ");
		letra = scan.nextLine();

		if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")
				|| letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O")
				|| letra.equals("U")) {

			System.out.println("A letra: " + letra + " é uma Vogal");

		} else {
			System.out.println("A letra: " + letra + " é uma Consoante");
		}

	}

}
