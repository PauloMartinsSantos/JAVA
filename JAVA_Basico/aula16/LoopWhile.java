package aula16;

import java.util.Scanner;

public class LoopWhile {
	public static void main(String[] args) {
		int i = 1;
		int max = 10;
		boolean continua = true;
		int escolha = 0;
		Scanner scan = new Scanner(System.in);

		/*
		 * System.out.println("Contando até " + max); while (i <= max) {
		 * System.out.println(i); i++;
		 * 
		 * }
		 */
		System.out.println("Deseja iniciar o loop? [1]Sim [2]Não");
		escolha = scan.nextInt();
		if (escolha == 1) {
			while (escolha == 1) {
				System.out.println("Dentro do laço");
				System.out.println("Deseja continuar no loop? [1]Sim [2]Não");
				escolha = scan.nextInt();

			}
		}else {
			System.out.println("Aplicação encerrada");
		}

	}
}
