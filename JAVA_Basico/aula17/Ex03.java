package aula17;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean infoValida = false;
		String nome;
		int idade;
		int aux;
		String sexo;
		String estadoCivil = "";
		double salario;
		
		
		
		do {
			System.out.println("Digite o nome: ");
			nome = scan.nextLine();
			
			if(nome.length() <3) {
				System.out.println("Nome precisa conter no mínimo 3 caracteres");
				System.out.println("");
				
			}
			else
				infoValida = true;
			
		}while(!infoValida);
		
		
		infoValida = false;

		do {
			System.out.println("Digite a idade: ");
			idade = scan.nextInt();
			
			if(idade >= 0 && idade <= 150) {
				infoValida = true;
				
			}
			else
				System.out.println("Idade deve ser entre 0 e 150");
			
		}while(!infoValida);
		
		infoValida = false;

		do {
			System.out.println("Digite o salário: ");
			salario = scan.nextDouble();
			
			if(salario > 0 ) {
				infoValida = true;
				
			}
			else
				System.out.println("Salário não deve ser menor ou igual a zero");
			
		}while(!infoValida);
		
		infoValida = false;

		do { 
			System.out.println("Digite o sexo M [Masculino] F [Feminino]: ");
			sexo = scan.next();
			
			if(sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) {
				infoValida = true;
				
			}
			else
				System.out.println("Opção Inválida");
			
		}while(!infoValida);
		
		infoValida = false;

		do { 
			System.out.println("Estado Civil 1 [Solteiro] 2 [Casado] 3 [Viuvo] 4 [Divorciado]");
			aux = scan.nextInt();
			
			switch (aux) {
			case 1:
				estadoCivil = "Solteiro";
				
				break;
			
			case 2:
				estadoCivil = "Casado";
				break;
			
			case 3:
				estadoCivil = "Viuvo";
				break;
			
			case 4:
				estadoCivil = "Divorciado";
				break;

			default:
			    System.out.println("Opção inválida");	
				break;
			}
			infoValida = true;
			
		}while(!infoValida);
		
		System.out.println("--------------------------------------------");
		System.out.println("Informações fornecidas");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Salário: R$ " + salario);
		System.out.println("Estado civil: " + estadoCivil);
		System.out.println("--------------------------------------------");
		
		
			
			
		
		
	}

}
