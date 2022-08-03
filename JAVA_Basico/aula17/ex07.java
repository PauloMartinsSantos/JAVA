package aula17;

import java.util.Scanner;

public class ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int valor[] = new int[5];
		int maior = 0;
		
		for(int i = 0; i < valor.length; i++ ) {
			System.out.println("Digite o " + (i+1) +" º valor");
			valor[i] = scan.nextInt();
			if(valor[i] > maior) {
				maior = valor[i];
			}			
			
		}
		System.out.println("O maior valor digitado foi: " +  maior);
	
	}

}
