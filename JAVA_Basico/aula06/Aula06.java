package aula06;

import java.util.Scanner;

public class Aula06 {
	
	//Implementar um programa Java que escreva na tela "Ol� Mundo!" + o argumento passado para o programa
	
	public static void main(String[] args) {
		
		String argumento;
		
		Scanner scan = new Scanner(System.in);
		argumento = scan.next();
		
		
		System.out.println("Ol� Mundo!" + argumento );
		scan.close();
	}

}
