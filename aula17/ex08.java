package aula17;

import java.util.Scanner;

public class ex08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double nota[] = new double[5];
		double media;
		
		for(int i = 0;i < nota.length; i++) {
			System.out.println("Digite a " + (i+1) + "º nota" );
			nota[i] = scan.nextDouble();
			
			
		}
		media = (nota[0] + nota[1] + nota[2] + nota[3] + nota[4]);
		System.out.println("Soma das notas: " + media);
		
		media = media/5;
		
		System.out.println("Média das notas: " + media);
	}

}
