package aula26;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	public void exibirAautonomia() {
		System.out.println("A autonomia do carro é: "+ capCombustivel * consumoCombustivel + " km");		
	}
	
	double obterAutonomia() {
		
		System.out.println("Método obterAutonomia foi chamado.  ");
		return capCombustivel * consumoCombustivel;
	}
}
