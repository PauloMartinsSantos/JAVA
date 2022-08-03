package aula20;

public class Matrizes {
	public static void main(String[] args) {
		// inicializa��o de uma matri 4x4

		int[][] matrizA = new int[4][4];
		double soma;

		double[][] notasAlunos = new double[3][4]; // 30 alunos 4 notas para cada aluno

		// massa de dados para aluno na primeira posi��o da matriz
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;

		// massa de dados para aluno na segunda posi��o da matriz
		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;

		//
		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;

		for (int i = 0; i < notasAlunos.length; i++) {

			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.print("Nota:" + (j + 1) + " ");
				System.out.print(notasAlunos[i][j] + " - ");

			}
			System.out.println();

		}
		
		System.out.println();
		System.out.println("Calculando a m�dia do aluno m ");
		for (int i = 0; i < notasAlunos.length; i++) {
			
			soma = 0;
			for (int j = 0; j < notasAlunos[i].length; j++) {
				soma += notasAlunos[i][j];				

			}
			System.out.println("M�dia do aluno " +(i+1) + " � = " + (soma/4));
			

		}

	}

}
