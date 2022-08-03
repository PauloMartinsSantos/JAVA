package aula18;

import java.util.Scanner;

public class BreakContinue {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num,max;
		
		System.out.println("Digite um número: ");
		num = scan.nextInt();
		
		System.out.println("Digite o limite: ");
		max = scan.nextInt();
		
		//Break para sair do laço FOR
		
		for(int i = num; i <= max; i++) {
			if(i % 7 == 0) {
				
				continue;
				
			}
			System.out.println(i);
			
		}
		
	}

}
