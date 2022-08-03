package exercicios;

import java.util.Scanner;

//Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido
public class ex03 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String sexo = "";

		System.out.println("*********************************************");
		System.out.println("           EXERCICIOS JAVA                   ");
		System.out.println("*********************************************");

		System.out.println("Digite o Sexo: M [MASCULINO] F [FEMININO] ");
		sexo = scan.nextLine();

		if (sexo.equals("M") || sexo.equals("m")) {
			System.out.println("Masculino");
		} else {
			if (sexo.equals("F") || sexo.equals("f")) {
				System.out.println("Feminino");
			} else {
				System.out.println("Sexo Inválido");
			}
		}
	}

}
