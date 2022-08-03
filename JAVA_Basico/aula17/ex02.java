package aula17;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String usuario;
		String senha;

		System.out.println("Digite o usuario: ");
		usuario = scan.nextLine();

		System.out.println("Digite a senha: ");
		senha = scan.nextLine();

		while (usuario.equalsIgnoreCase(senha)) {
			System.out.println("ERRO: A senha não pode ser igual ao nome de usuário refaça a operação: ");

			System.out.println("Digite o usuario: ");
			usuario = scan.nextLine();

			System.out.println("Digite a senha: ");
			senha = scan.nextLine();

		}

		System.out.println("Usuario cadastrado com sucesso");
		scan.close();

	}

}
