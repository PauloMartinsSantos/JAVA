package exercicios;

import java.util.Scanner;

//Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo
public class ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double n;

		System.out.println("*********************************************");
		System.out.println("           EXERCICIOS JAVA                   ");
		System.out.println("*********************************************");
		System.out.println("SOLICITA 1 E EXIBE SE É POSITIVO OU NEGATIVO ");
		System.out.println("*********************************************");
		
		System.out.println("Digite um valor: ");
		n = scan.nextDouble();
		
		if (n >= 0) {
			System.out.println("VALOR POSITIVO");
			
		}
		else {
			System.out.println("VALOR NEGATIVO");
		}
		
		
	}


}
