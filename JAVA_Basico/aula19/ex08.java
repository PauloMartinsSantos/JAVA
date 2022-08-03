package aula19;

import java.util.Scanner;

public class ex08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		String repetir;
		
		
		System.out.println("****************************************");
		System.out.println("              TABUADA                   ");
		System.out.println("****************************************");
		
		boolean continua = false;
		
		do {
			System.out.print("Digite um valor para gerar a tabuada: ");
			num = scan.nextInt();
			
			for(int i = 0; i <= 10;i++) {
				System.out.println(num + " * " + i + " = " + num*i);				
							
			}
			
			System.out.println("Executar Novamente S[] N[]");
			repetir = scan.next();
			
			if(repetir.equalsIgnoreCase("N")) {
				continua = true;		
			}
			
			
		}while(!continua);
		
		scan.close();
		System.out.println("***fim***");
		
		
		
	}

}
