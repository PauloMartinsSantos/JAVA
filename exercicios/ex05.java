package exercicios;

import java.util.Scanner;

/*Fa�a um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a m�dia alcan�ada por aluno e apresentar:
A mensagem "Aprovado", se a m�dia alcan�ada for maior ou igual a sete;
A mensagem "Reprovado", se a m�dia for menor do que sete;
A mensagem "Aprovado com Distin��o", se a m�dia for igual a dez.*/
public class ex05 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double n1, n2, media;

		System.out.println("*********************************************");
		System.out.println("           EXERCICIOS JAVA                   ");
		System.out.println("*********************************************");

		System.out.println("Digite a primeira nota: ");
		n1 = scan.nextDouble();

		System.out.println("Digite a segunda nota: ");
		n2 = scan.nextDouble();

		media = (n1 + n2) / 2;

		if (media == 10) {
			System.out.println("Aluno Aprovado com Distin��o");

		} else {
			if (media < 7) {
				System.out.println("Aluno Reprovado");
				
			}
			else {
				if(media >= 7) {
					System.out.println("Aluno Aprovado");
				}
			}
		}

	}

}
