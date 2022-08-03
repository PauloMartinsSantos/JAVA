package aula19;

import java.util.Scanner;

public class VetoresArrays {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] temperatura = new double[365];
		
		for (int i = 0; i < temperatura.length; i++) {
			System.out.println("A temperatura do dia " + (i+1) + " é: " + temperatura[i]);
			
		}
		

		
	}
	
}
